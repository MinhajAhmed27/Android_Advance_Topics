package com.example.androidadvancetopics.repository

import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.liveData
import com.example.androidadvancetopics.api.QuotesAPI
import com.example.androidadvancetopics.db.QuoteDatabase
import com.example.androidadvancetopics.paging.QuotePagingSource
import com.example.androidadvancetopics.paging.QuoteRemoteMediator
import javax.inject.Inject

@ExperimentalPagingApi
class QuoteRepository @Inject constructor(
    private val quotesAPI: QuotesAPI,
    private val quoteDatabase: QuoteDatabase
) {

    fun getQuotes() = Pager(
        config = PagingConfig(
            pageSize = 20,
            maxSize = 100
        ),
        remoteMediator = QuoteRemoteMediator(quotesAPI, quoteDatabase),
        //since now data will pull from db
        pagingSourceFactory = { quoteDatabase.quotesDao().getQuotes() }
        //previously it was pulling from API
//        pagingSourceFactory = { QuotePagingSource(quotesAPI) }
    ).liveData

}