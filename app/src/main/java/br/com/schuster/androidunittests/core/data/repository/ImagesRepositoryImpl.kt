package br.com.schuster.androidunittests.core.data.repository

import br.com.schuster.androidunittests.core.data.mapper.toImages
import br.com.schuster.androidunittests.core.data.remote.api.ImagesApi
import br.com.schuster.androidunittests.core.domain.model.Images
import br.com.schuster.androidunittests.core.domain.repository.ImagesRepository
import javax.inject.Inject


class ImagesRepositoryImpl @Inject constructor(
    private val imagesApi: ImagesApi
) : ImagesRepository {

    override suspend fun searchImages(
        query: String
    ): Images? {
        return imagesApi.searchImages(query)?.toImages()
    }

}


















