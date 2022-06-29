package com.example.tmdbclientapp.presentation.di.movie

import com.example.tmdbclientapp.presentation.artist.ArtistActivity
import com.example.tmdbclientapp.presentation.movie.MovieActivity
import dagger.Subcomponent

@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {

    fun inject(movieActivity: MovieActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create(): MovieSubComponent
    }
}