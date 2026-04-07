package com.example.core_data.data

import com.declarative.model.Movie
import com.declarative.model.Movies
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

const val API_KEY_QUERY = "api_key"
const val PAGE_QUERY = "page"
const val MOVIE_ID = "movie_id"

interface MovieService {

    @GET("movie/popular")
    suspend fun fetchPopularMovies(
        @Query(API_KEY_QUERY) apiKey: String,
        @Query(PAGE_QUERY) page: Int = 1
    ): Movies

    @GET("movie/now_playing")
    suspend fun fetchNowPlaying(
        @Query(API_KEY_QUERY) apiKey: String,
        @Query(PAGE_QUERY) page: Int = 1
    ): Movies


    @GET("movie/top_rated")
    suspend fun fetchTopRatedMovies(
        @Query(API_KEY_QUERY) apiKey: String,
        @Query(PAGE_QUERY) page: Int = 1
    ): Movies

    @GET("movie/upcoming")
    suspend fun fetchUpcomingMovies(
        @Query(API_KEY_QUERY) apiKey: String,
        @Query(PAGE_QUERY) page: Int = 1
    ): Movies

    @GET("movie/{movie_id}")
    suspend fun fetchMovieDetails(
        @Query(API_KEY_QUERY) apiKey: String,
        @Path(MOVIE_ID) movieId: Int
    ): Movie

}