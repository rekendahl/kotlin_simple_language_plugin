package com.simpleplugin

import com.intellij.lang.Language

object SimpleLanguage : Language("Simple", "text/simple", "text/x-simple", "application/x-simple") {
    override fun getDisplayName() = "Simple"
}
