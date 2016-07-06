package com.simpleplugin

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon


object SimpleFileType : LanguageFileType(SimpleLanguage) {

    object DEFAULTS {
        val EXTENSION: String = "simple"
    }

    override fun getName(): String = "Simple"

    override fun getDescription(): String = "Simple File"

    override fun getDefaultExtension(): String = DEFAULTS.EXTENSION

    override fun getIcon(): Icon = SimpleIcons.SIMPLE
}