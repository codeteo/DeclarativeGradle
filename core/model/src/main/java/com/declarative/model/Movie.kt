package com.declarative.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable


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