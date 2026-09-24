package com.example.lolchamps.feature.champions.domain.model

data class ChampionDetailsDomainModel(
val id: String,
val key: String,
val name: String,
val title: String,
    val image: ImageDomainModel,
    val skins: List<SkinDomainModel>,
    val lore: String,
    val allytips: List<String>,
    val enemytips: List<String>,
    val tags: List<String>,
    val partype: String,
    val stats: ChampionStatsDomainModel,
    val spells: List<ChampionSpellDomainModel>,
    val passive: ChampionPassiveDomainModel
)

data class ChampionSpellDomainModel(
    val id: String,
    val name: String,
    val description: String,
    val tooltip: String,
    val leveltip: ChampionSpellLevelTipDomainModel,
    val maxrank: Int,
    val cooldown: List<Double>,
    val cooldownBurn: String,
    val cost: List<Int>,
    val costBurn: String,
    val datavalues: Map<String, Any>,
    val effect: List<List<Double>?>,
    val effectBurn: List<String?>,
    val vars: List<ChampionSpellVarDomainModel>,
    val costType: String,
    val maxammo: String,
    val range: List<Int>,
    val rangeBurn: String,
    val image: ImageDomainModel,
    val resource: String
)

data class ChampionSpellLevelTipDomainModel(
    val label: List<String>,
    val effect: List<String>
)
data class ChampionSpellVarDomainModel(
    val link: String,
    val coeff: List<Double>,
    val key: String
)
data class ChampionPassiveDomainModel(
    val name: String,
    val description: String,
    val image: ImageDomainModel
)