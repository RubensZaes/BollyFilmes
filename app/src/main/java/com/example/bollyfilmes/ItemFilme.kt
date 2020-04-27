package com.example.bollyfilmes

import android.net.Uri

data class ItemFilme (
    val id: String,
    val title: String,
    val description: String,
    val releaseDate: String,
    val avaliation: Float,
    val image: Uri
)