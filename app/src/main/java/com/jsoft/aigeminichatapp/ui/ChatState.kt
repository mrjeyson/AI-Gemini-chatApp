package com.jsoft.aigeminichatapp.ui

import android.graphics.Bitmap
import com.jsoft.aigeminichatapp.data.Chat

data class ChatState(
    val chatList: MutableList<Chat> = mutableListOf(),
    val prompt: String = "",
    val bitmap: Bitmap? = null
)
