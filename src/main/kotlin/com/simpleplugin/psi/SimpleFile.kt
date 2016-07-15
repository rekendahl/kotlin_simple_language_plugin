package com.simpleplugin.psi

import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import com.intellij.psi.FileViewProvider
import com.simpleplugin.SimpleFileType
import com.simpleplugin.SimpleLanguage
import javax.swing.Icon


class SimpleFile(provider: FileViewProvider) : PsiFileBase(provider, SimpleLanguage.INSTANCE) {
    override fun getFileType(): FileType { return SimpleFileType.INSTANCE }

    override fun toString(): String { return "Simple File" }

    override fun getIcon(flags: Int): Icon? { return super.getIcon(flags) }
}
