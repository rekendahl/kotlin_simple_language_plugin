package com.simpleplugin

import com.intellij.lang.ASTNode
import com.intellij.lang.ParserDefinition
import com.intellij.lang.PsiParser
import com.intellij.lexer.Lexer
import com.intellij.openapi.project.Project
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiElement
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType
import com.intellij.psi.tree.IFileElementType
import com.intellij.psi.tree.TokenSet
import com.simpleplugin.parser.SimpleParser
import com.simpleplugin.psi.SimpleFile
import com.simpleplugin.psi.SimpleTypes

class SimpleParserDefinition(): ParserDefinition {
    val WHITESPACES: TokenSet = TokenSet.create(TokenType.WHITE_SPACE)
    val COMMENT: TokenSet = TokenSet.create(SimpleTypes.COMMENT)
    val SIMPLE_FILE = IFileElementType(SimpleLanguage.INSTANCE)

    override fun createLexer(project: Project?): Lexer = SimpleLexerAdapter()
    override fun getWhitespaceTokens() = WHITESPACES
    override fun getCommentTokens(): TokenSet = COMMENT
    override fun getStringLiteralElements(): TokenSet = TokenSet.EMPTY
    override fun createParser(project: Project?): PsiParser =
            PsiParser { root, builder -> SimpleParser().parse(root, builder) }
    override fun getFileNodeType(): IFileElementType = SIMPLE_FILE
    override fun createFile(viewProvider: FileViewProvider?): PsiFile = SimpleFile(viewProvider!!) // ToDo: Don't understand syntax
    override fun spaceExistanceTypeBetweenTokens(left: ASTNode?, right: ASTNode?) =
            ParserDefinition.SpaceRequirements.MAY
    override fun createElement(node: ASTNode?): PsiElement {
        return SimpleTypes.Factory.createElement(node)
    }
}
