package com.simpleplugin.psi

import com.intellij.psi.tree.IElementType
import com.simpleplugin.SimpleLanguage


class SimpleTokenType(debugName: String) : IElementType(debugName, SimpleLanguage){
    override fun toString() {
        return "SimpleTokenType." + super.toString();
    }
}