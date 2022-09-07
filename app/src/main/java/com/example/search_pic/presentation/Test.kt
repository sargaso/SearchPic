package com.example.search_pic.presentation

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.launch

class Test {
     init {


             val coroutine = CoroutineScope(Dispatchers.IO).launch {
                 val a = async {
                     returnHelloWorld("Hello world")
                 }
                 val word = a.await()
             }

     }

    suspend fun returnHelloWorld(text: String):String {
        return text + 1
    }

}