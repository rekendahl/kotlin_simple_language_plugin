package com.simpleplugin.psi

import com.intellij.psi.tree.IElementType
import com.simpleplugin.SimpleLanguage

open class SimpleElementType(debugName:String) : IElementType(debugName, SimpleLanguage.INSTANCE){}

