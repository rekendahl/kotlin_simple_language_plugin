package com.simpleplugin

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon


class SimpleFileType : LanguageFileType(SimpleLanguage.INSTANCE) {

    object DEFAULTS {
        val EXTENSION: String = "simple"
    }

    override fun getName(): String = "Simple"

    override fun getDescription(): String = "Simple File"

    override fun getDefaultExtension(): String = DEFAULTS.EXTENSION

    override fun getIcon(): Icon = SimpleIcons.SIMPLE

    companion object {
        @JvmField // ToDo: <-- Copied from HaskellFileType.kt. What does this do?
        val INSTANCE: SimpleFileType = SimpleFileType()
    }
}