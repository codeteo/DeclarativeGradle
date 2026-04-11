package com.declarative.list

import androidx.lifecycle.ViewModel
import com.declarative.common_data.MovieRepository
import dev.zacsweers.metro.Inject

class MainViewModel @Inject constructor(
    repository: MovieRepository
) : ViewModel() {


}