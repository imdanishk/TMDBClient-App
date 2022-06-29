package com.example.tmdbclientapp.presentation.di

import com.example.tmdbclientapp.presentation.di.artist.ArtistSubComponent
import com.example.tmdbclientapp.presentation.di.movie.MovieSubComponent
import com.example.tmdbclientapp.presentation.di.tvshow.TvShowSubComponent

interface Injector {
    fun createMovieSubComponent(): MovieSubComponent
    fun createTvShowSubComponent(): TvShowSubComponent
    fun createArtistSubComponent(): ArtistSubComponent
}