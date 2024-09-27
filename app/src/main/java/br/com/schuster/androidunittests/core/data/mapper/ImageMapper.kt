package br.com.schuster.androidunittests.core.data.mapper

import br.com.schuster.androidunittests.core.data.remote.dto.ImageListDto
import br.com.schuster.androidunittests.core.domain.model.Images


fun ImageListDto.toImages(): Images {
    return Images(
        images = hits?.map { imageDto ->
            imageDto.previewURL ?: ""
        } ?: emptyList()
    )
}

















