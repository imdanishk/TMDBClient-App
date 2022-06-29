package com.example.tmdbclientapp.data.repository.artist.datasource

import com.example.tmdbclientapp.data.model.artist.Artist

interface ArtistCacheDataSource {
    
    suspend fun getArtistsFromCache() : List<Artist>
    suspend fun saveArtistsToCache(artists : List<Artist>)
}