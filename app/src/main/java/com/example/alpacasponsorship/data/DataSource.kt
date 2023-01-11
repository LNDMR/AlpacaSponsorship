package com.example.alpacasponsorship.data

import com.example.alpacasponsorship.R
import com.example.alpacasponsorship.data.modul.Alpaca

class DataSource {

    fun getAlapacas(): List<Alpaca> {
        return listOf(
            Alpaca("Yurak", 7, "calm, dominant", R.drawable.yurak),
            Alpaca("Suri", 1, "curious, playful, smart", R.drawable.suri),
            Alpaca("Roberta", 9, "friendly, chaotic", R.drawable.roberta),
            Alpaca("Juan Pablo", 6, "funny, dynamic, likes to cuddle", R.drawable.juampy),
            Alpaca("Joana", 4, "shy, lone wolf, content", R.drawable.joana),
            Alpaca("Gonzalo", 5, "curious, social, content", R.drawable.gonzalo),
            Alpaca("Joe", 4, "bubbly, social", R.drawable.joe),
            Alpaca("Maria", 2, "happy, playful, chaotic", R.drawable.maria))
    }
}