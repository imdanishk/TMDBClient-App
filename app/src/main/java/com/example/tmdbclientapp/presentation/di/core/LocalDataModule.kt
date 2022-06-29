package com.example.tmdbclientapp.presentation.di.core

import com.example.tmdbclientapp.data.db.ArtistDao
import com.example.tmdbclientapp.data.db.MovieDao
import com.example.tmdbclientapp.data.db.TvShowDao
import com.example.tmdbclientapp.data.repository.artist.datasource.ArtistLocalDataSource
import com.example.tmdbclientapp.data.repository.artist.datasourceImpl.ArtistLocalDataSourceImpl
import com.example.tmdbclientapp.data.repository.movie.datasource.MovieLocalDataSource
import com.example.tmdbclientapp.data.repository.movie.datasourceImpl.MovieLocalDataSourceImpl
import com.example.tmdbclientapp.data.repository.tvshow.datasource.TvShowLocalDataSource
import com.example.tmdbclientapp.data.repository.tvshow.datasourceImpl.TvShowLocalDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class LocalDataModule {

    @Singleton
    @Provides
    fun provideMovieLocalDataSource(movieDao: MovieDao) : MovieLocalDataSource {
        return MovieLocalDataSourceImpl(movieDao)
    }

    @Singleton
    @Provides
    fun provideTvShowLocalDataSource(tvShowDao: TvShowDao) : TvShowLocalDataSource {
        return TvShowLocalDataSourceImpl(tvShowDao)
    }

    @Singleton
    @Provides
    fun provideArtistLocalDataSource(artistDao: ArtistDao) : ArtistLocalDataSource {
        return ArtistLocalDataSourceImpl(artistDao)
    }

}