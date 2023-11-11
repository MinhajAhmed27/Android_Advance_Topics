package com.example.androidadvancetopics.model

data class QuoteResult(
    val count: Int,
    val lastItemIndex: Int,
    val page: Int,
    val results: List<Quotes>,
    val totalCount: Int,
    val totalPages: Int
)