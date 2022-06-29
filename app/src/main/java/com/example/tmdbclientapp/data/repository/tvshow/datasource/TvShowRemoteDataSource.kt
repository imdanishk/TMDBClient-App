package com.example.tmdbclientapp.data.repository.tvshow.datasource


import com.example.tmdbclientapp.data.model.tvshow.TvShowList
import retrofit2.Response

interface TvShowRemoteDataSource {

    suspend fun getTvShows() : Response<TvShowList>
}