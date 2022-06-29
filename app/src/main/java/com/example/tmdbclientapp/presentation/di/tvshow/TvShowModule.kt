package com.example.tmdbclientapp.presentation.di.tvshow

import com.example.tmdbclientapp.domain.usecase.GetMoviesUseCase
import com.example.tmdbclientapp.domain.usecase.GetTvShowsUseCase
import com.example.tmdbclientapp.domain.usecase.UpdateMoviesUseCase
import com.example.tmdbclientapp.domain.usecase.UpdateTvShowsUseCase
import com.example.tmdbclientapp.presentation.movie.MovieViewModelFactory
import com.example.tmdbclientapp.presentation.tvshow.TvShowViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class TvShowModule {

    @TvShowScope
    @Provides
    fun provideTvShowViewModelFactory(
        getTvShowsUseCase: GetTvShowsUseCase,
        updateTvShowsUseCase: UpdateTvShowsUseCase
    ): TvShowViewModelFactory {
        return TvShowViewModelFactory(
            getTvShowsUseCase,
            updateTvShowsUseCase
        )
    }
}