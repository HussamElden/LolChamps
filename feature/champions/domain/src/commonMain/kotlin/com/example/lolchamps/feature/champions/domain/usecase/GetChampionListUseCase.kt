package com.example.lolchamps.feature.champions.domain.usecase

import com.example.lolchamps.feature.champions.domain.repository.ChampionRepository

class GetChampionListUseCase(
     private val championRepository: ChampionRepository
 ){
     suspend operator fun invoke()=championRepository.getChampionList()
 }
