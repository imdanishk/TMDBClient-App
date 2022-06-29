package com.example.tmdbclientapp.data.repository.tvshow.datasource

import com.example.tmdbclientapp.data.model.tvshow.TvShow

interface TvShowLocalDataSource {

    suspend fun getTvShowsFromDB() : List<TvShow>
    suspend fun saveTvShowsToDB(movies : List<TvShow>)
    suspend fun clearAll()
}