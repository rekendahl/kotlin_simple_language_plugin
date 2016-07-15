package com.simpleplugin

import com.intellij.lang.Language

class SimpleLanguage : Language("Simple", "text/simple") {
    companion object {
        val INSTANCE: SimpleLanguage = SimpleLanguage()
    }
    override fun getDisplayName() = "Simple"
}
