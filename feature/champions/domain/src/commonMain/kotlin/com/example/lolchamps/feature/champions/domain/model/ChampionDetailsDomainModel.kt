package com.example.lolchamps.feature.champions.domain.model

data class ChampionDetailsDomainModel(
    val id: String,
    val key: String,
    val name: String,
    val title: String,
    val image: ImageDomainModel,
    val skins: List<SkinDomainModel>,
    val lore: String,
    val allyTips: List<String>,
    val enemyTips: List<String>,
    val roles: List<String>,
    val resourceType: String,
    val stats: ChampionStatsDomainModel,
    val abilities: List<ChampionSpellDomainModel>,
    val passive: ChampionPassiveDomainModel,
)

data class ChampionSpellDomainModel(
    val id: String,
    val name: String,
    val description: String,
    val tooltip: String,
    val levelScaling: ChampionSpellLevelTipDomainModel,
    val maxRank: Int,
    val cooldown: List<Double>,
    val cooldownDisplay: String,
    val cost: List<Int>,
    val costDisplay: String,
    val dataValues: Map<String, Any>,
    val effect: List<List<Double>?>,
    val effectDisplayValues: List<String?>,
    val variables: List<ChampionSpellVarDomainModel>,
    val costType: String,
    val maxAmmo: String,
    val range: List<Int>,
    val rangeDisplay: String,
    val image: ImageDomainModel,
    val resource: String,
)

data class ChampionSpellLevelTipDomainModel(
    val label: List<String>,
    val effect: List<String>,
)

data class ChampionSpellVarDomainModel(
    val link: String,
    val coefficients: List<Double>,
    val key: String,
)

data class ChampionPassiveDomainModel(
    val name: String,
    val description: String,
    val image: ImageDomainModel,
)
