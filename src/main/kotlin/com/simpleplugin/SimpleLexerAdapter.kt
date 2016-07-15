package com.simpleplugin

import com.intellij.lexer.FlexAdapter
import java.io.Reader

class SimpleLexerAdapter : FlexAdapter(SimpleLexer(null as Reader?))
