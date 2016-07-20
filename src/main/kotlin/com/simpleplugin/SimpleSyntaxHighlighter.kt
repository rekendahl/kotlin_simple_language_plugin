package com.simpleplugin

import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors
import com.intellij.openapi.editor.HighlighterColors
import com.intellij.openapi.editor.colors.TextAttributesKey as Key

import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.psi.tree.IElementType

import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.psi.TokenType
import com.simpleplugin.psi.SimpleTypes

class SimpleSyntaxHighlighter() : SyntaxHighlighterBase() {

    companion object {
        val SEPARATOR = Key.createTextAttributesKey("SIMPLE_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN)
        val KEY = Key.createTextAttributesKey("SIMPLE_KEY", DefaultLanguageHighlighterColors.KEYWORD)
        val VALUE = Key.createTextAttributesKey("SIMPLE_VALUE", DefaultLanguageHighlighterColors.STRING)
        val COMMENT = Key.createTextAttributesKey("SIMPLE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT)
        val BAD_CHARACTER = Key.createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER)

        val SEPARATOR_KEYS = arrayOf(SEPARATOR)
        val KEY_KEYS = arrayOf(KEY)
        val VALUE_KEYS = arrayOf(VALUE)
        val COMMENT_KEYS = arrayOf(COMMENT)
        val BAD_CHARACTER_KEYS = arrayOf(BAD_CHARACTER)
        val EMPTY_KEYS = arrayOf<Key>()
    }

    override fun getHighlightingLexer(): Lexer { return SimpleLexerAdapter() }

    override fun getTokenHighlights(tokentype: IElementType?): Array<TextAttributesKey> {
        when(tokentype) {
            SimpleTypes.SEPARATOR -> return SEPARATOR_KEYS
            SimpleTypes.KEY -> return KEY_KEYS
            SimpleTypes.VALUE -> return VALUE_KEYS
            SimpleTypes.COMMENT -> return COMMENT_KEYS
            TokenType.BAD_CHARACTER -> return BAD_CHARACTER_KEYS
            else -> return EMPTY_KEYS
        }
    }
}
