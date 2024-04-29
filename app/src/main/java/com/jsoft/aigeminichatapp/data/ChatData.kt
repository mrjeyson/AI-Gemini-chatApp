package com.jsoft.aigeminichatapp.data

import com.google.ai.client.generativeai.GenerativeModel
import com.google.ai.client.generativeai.type.ResponseStoppedException
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

object ChatData {

    val api_key = "AIzaSyBoQoogzP9_0iXfdFf5NDNWWFQ4sx2JmFg"

    suspend fun getResponse(prompt: String): Chat {
        val generativeModel = GenerativeModel(
            modelName = "gemini-pro", apiKey = api_key
        )

        try {
            val response = withContext(Dispatchers.IO) {
                generativeModel.generateContent(prompt)
            }
        } catch (e: ResponseStoppedException) {

        }
    }
}