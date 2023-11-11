package com.example.androidadvancetopics.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.androidadvancetopics.model.QuoteRemoteKeys
import com.example.androidadvancetopics.model.Quotes

@Database(entities = [Quotes::class, QuoteRemoteKeys::class], version = 1)
abstract class QuoteDatabase : RoomDatabase() {

    abstract fun quotesDao(): QuotesDao
    abstract fun remoteKeysDao(): RemoteKeysDao

}