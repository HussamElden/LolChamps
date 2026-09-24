package com.example.lolchamps.feature.champions.domain.repository

import com.example.lolchamps.feature.champions.domain.model.ChampionDetailsDomainModel
import com.example.lolchamps.feature.champions.domain.model.ChampionListDomainModel

interface ChampionRepository {
    suspend fun getChampionList(): Result<ChampionListDomainModel>
    suspend fun getChampionDetails(id: String): Result<ChampionDetailsDomainModel>
}