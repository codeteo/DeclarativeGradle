package com.example.core_data.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
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

@Serializable
data class Movies(
    @SerialName("results") val results: List<Movie>
)

@Serializable
data class Movie(
    @SerialName("id") var id: Int,
    @SerialName("title") var title: String,
    @SerialName("vote_average") var voteAverage: Double,
    @SerialName("original_language") var language: String,
    @SerialName("backdrop_path") var backdrop: String,
    @SerialName("overview") var overview: String,
    @SerialName("release_date") var releaseDate: String,
)