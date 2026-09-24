package com.example.lolchamps.feature.champions.domain.model

data class ChampionListDomainModel(
    val type: String,
    val format: String,
    val version: String,
    val champions: Map<String, ChampionSummaryDomainModel>
)