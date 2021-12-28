package com.example.rxjavastudy.network

import com.example.rxjavastudy.data.Gif
import com.example.rxjavastudy.data.Meta

data class GiphyRandomResponse (
    val data: Gif,
    val meta: Meta
)
