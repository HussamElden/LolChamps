package com.example.lolchamps.feature.champions.domain.usecase

import com.example.lolchamps.feature.champions.domain.repository.ChampionRepository

class GetChampionDetailsUseCase(
    private val championRepository: ChampionRepository
) {
    suspend operator fun invoke(id: String)=championRepository.getChampionDetails(id)
}