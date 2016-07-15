package com.simpleplugin.psi

import com.intellij.psi.tree.IElementType
import com.simpleplugin.SimpleLanguage


class SimpleTokenType(debugName: String) : IElementType(debugName, SimpleLanguage.INSTANCE){
    override fun toString(): String {
        return "SimpleTokenType." + super.toString()
    }
}