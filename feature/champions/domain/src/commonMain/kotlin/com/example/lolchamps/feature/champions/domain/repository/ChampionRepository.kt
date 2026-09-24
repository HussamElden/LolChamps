package com.example.lolchamps.feature.champions.domain.repository

import com.example.lolchamps.feature.champions.domain.model.ChampionDetailsDomainModel
import com.example.lolchamps.feature.champions.domain.model.ChampionSummaryDomainModel

interface ChampionRepository {
    suspend fun getChampions(): Result<List<ChampionSummaryDomainModel>>
    suspend fun getChampionDetails(id: String): Result<ChampionDetailsDomainModel>
}
