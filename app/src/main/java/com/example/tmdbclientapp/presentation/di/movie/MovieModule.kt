package com.example.tmdbclientapp.presentation.di.movie

import com.example.tmdbclientapp.domain.usecase.GetArtistsUseCase
import com.example.tmdbclientapp.domain.usecase.GetMoviesUseCase
import com.example.tmdbclientapp.domain.usecase.UpdateArtistsUseCase
import com.example.tmdbclientapp.domain.usecase.UpdateMoviesUseCase
import com.example.tmdbclientapp.presentation.artist.ArtistViewModelFactory
import com.example.tmdbclientapp.presentation.movie.MovieViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class MovieModule {

    @MovieScope
    @Provides
    fun provideMovieViewModelFactory(
        getMoviesUseCase: GetMoviesUseCase,
        updateMoviesUseCase: UpdateMoviesUseCase
    ): MovieViewModelFactory {
        return MovieViewModelFactory(
            getMoviesUseCase,
            updateMoviesUseCase
        )
    }
}