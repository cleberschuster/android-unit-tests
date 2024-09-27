package br.com.schuster.androidunittests.core.domain.repository

import br.com.schuster.androidunittests.core.domain.model.Images


interface ImagesRepository {

    suspend fun searchImages(query: String): Images?

}