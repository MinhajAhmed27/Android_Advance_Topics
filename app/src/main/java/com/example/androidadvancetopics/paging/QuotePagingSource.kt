package com.example.androidadvancetopics.paging

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.example.androidadvancetopics.api.QuotesAPI
import com.example.androidadvancetopics.model.Quotes
import java.lang.Exception

const val STARTING_PAGE_INDEX = 1

class QuotePagingSource(private val quotesAPI: QuotesAPI) : PagingSource<Int, Quotes>() {

    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Quotes> {
        return try {
            val currentPosition = params.key ?: STARTING_PAGE_INDEX
            val response = quotesAPI.getQuotes(currentPosition)

            return LoadResult.Page(
                data = response.results,
                prevKey = if (currentPosition == STARTING_PAGE_INDEX) null else currentPosition - 1,
                nextKey = if (currentPosition == response.totalPages) null else currentPosition + 1
            )

        } catch (e: Exception) {
            LoadResult.Error(e)
        }
    }

    override fun getRefreshKey(state: PagingState<Int, Quotes>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1) ?: anchorPage?.nextKey?.minus(1)
        }
    }

}