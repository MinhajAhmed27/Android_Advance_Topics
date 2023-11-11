package com.example.androidadvancetopics.db

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.androidadvancetopics.model.Quotes

@Dao
interface QuotesDao {

    @Query("Select * from Quote")
    fun getQuotes(): PagingSource<Int, Quotes>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addListOfQuotes(quotes: List<Quotes>)

    @Query("Delete from Quote")
    suspend fun deleteAllQuotes()

}