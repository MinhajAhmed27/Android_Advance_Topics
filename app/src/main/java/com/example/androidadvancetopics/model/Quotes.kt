package com.example.androidadvancetopics.model
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Quote")
data class Quotes(
    @PrimaryKey(autoGenerate = false)
    val _id: String,

    val author: String,
    val authorSlug: String,
    val content: String,
    val dateAdded: String,
    val dateModified: String,
    val length: Int
)