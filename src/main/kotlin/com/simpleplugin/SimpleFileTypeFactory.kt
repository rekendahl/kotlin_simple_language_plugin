package com.simpleplugin

import com.intellij.openapi.fileTypes.FileTypeConsumer
import com.intellij.openapi.fileTypes.FileTypeFactory


class SimpleFileTypeFactory : FileTypeFactory() {
    override fun createFileTypes(consumer: FileTypeConsumer) {
        consumer.consume(SimpleFileType.INSTANCE, SimpleFileType.DEFAULTS.EXTENSION)
    }
}