package com.example.androidadvancetopics.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.ExperimentalPagingApi
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.cachedIn
import com.example.androidadvancetopics.paging.QuotePagingSource
import com.example.androidadvancetopics.repository.QuoteRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@ExperimentalPagingApi
@HiltViewModel
class MainViewModel
@Inject constructor (private val quoteRepository: QuoteRepository ) : ViewModel() {

    val list = quoteRepository.getQuotes().cachedIn(viewModelScope)
//    val listData = Pager(PagingConfig(pageSize = 6)) {
//        QuotePagingSource(apiService)
//    }.flowable.cachedIn(viewModelScope)
}