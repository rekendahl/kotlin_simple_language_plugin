package com.simpleplugin

import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import com.intellij.openapi.options.colors.ColorSettingsPage


class SimpleColorSettingsPage : ColorSettingsPage {
    private val DESCRIPTORS = arrayOf(
            AttributesDescriptor("Key", SimpleSyntaxHighlighter.KEY),
            AttributesDescriptor("Separator", SimpleSyntaxHighlighter.SEPARATOR),
            AttributesDescriptor("Value", SimpleSyntaxHighlighter.VALUE)
            )

    override fun getDisplayName() = "Simple"
    override fun getIcon() = SimpleIcons.SIMPLE
    override fun getAttributeDescriptors() = DESCRIPTORS
    override fun getColorDescriptors() = ColorDescriptor.EMPTY_ARRAY
    override fun getHighlighter() = SimpleSyntaxHighlighter()
    override fun getAdditionalHighlightingTagToDescriptorMap() = null
    override fun getDemoText(): String {
        return "# You are reading the \".properties\" entry.\n" +
                "! The exclamation mark can also mark text as comments.\n" +
                "website = http://en.wikipedia.org/\n" +
                "language = English\n" +
                "# The backslash below tells the application to continue reading\n" +
                "# the value onto the next line.\n" +
                "message = Welcome to \\\n" +
                "          Wikipedia!\n" +
                "# Add spaces to the key\n" +
                "key\\ with\\ spaces = This is the value that could be looked up with the key \"key with spaces\".\n" +
                "# Unicode\n" +
                "tab : \\u0009"
    }
}
