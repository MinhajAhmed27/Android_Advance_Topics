package com.example.androidadvancetopics.di

import android.content.Context
import androidx.room.Room
import com.example.androidadvancetopics.Contants.BASE_URL
import com.example.androidadvancetopics.api.QuotesAPI
import com.example.androidadvancetopics.db.QuoteDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun getRetrofit():Retrofit =
        Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()


    @Provides
    @Singleton
    fun providesQuotesApi(retrofit: Retrofit): QuotesAPI =
        retrofit.create(QuotesAPI::class.java)


    /*@Provides
    @Singleton
    fun provideDatabase(app: Application): QuoteDatabase =
        Room.databaseBuilder(app, QuoteDatabase::class.java, "quotes_database")
            .fallbackToDestructiveMigration()
            .build()*/

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext context: Context) : QuoteDatabase =
        Room.databaseBuilder(context, QuoteDatabase::class.java, "quotes_database").build()
}