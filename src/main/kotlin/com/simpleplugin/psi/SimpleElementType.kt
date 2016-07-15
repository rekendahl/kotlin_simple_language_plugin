package com.simpleplugin.psi

import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.tree.IElementType
import com.simpleplugin.SimpleLanguage
import java.lang.reflect.Constructor

open class SimpleElementType(
        debugName:String,
        val constructor: ((ASTNode)->PsiElement)?= null) : IElementType(debugName, SimpleLanguage.INSTANCE) {
    private val myDebugName: String = debugName
    open fun getDebugName(): String { return myDebugName }
}
