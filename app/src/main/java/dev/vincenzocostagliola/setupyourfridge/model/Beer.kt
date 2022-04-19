package dev.vincenzocostagliola.setupyourfridge.model

data class Beer(
    val name: String,
    val shortDescription: String,
    val longDescription: String,
    val format: String,
    var preferred: Boolean = false,
    val imageUrl: String
)
