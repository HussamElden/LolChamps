package com.example.lolchamps.feature.champions.domain.model


data class ChampionSummaryDomainModel(
    val version: String,
    val id: String,
    val key: String,
    val name: String,
    val title: String,
    val summary: String,
    val gameplayRatings: ChampionInfoDomainModel,
    val image: ImageDomainModel,
    val roles: List<String>,
    val resourceType: String,
    val stats: ChampionStatsDomainModel,
)

data class ChampionInfoDomainModel(
    val attackRating: Int,
    val defenseRating: Int,
    val magicRating: Int,
    val difficultyRating: Int,
)

data class ImageDomainModel(
    val fileName: String,
    val spriteFileName: String,
    val assetGroup: String,
    val xOffset: Int,
    val yOffset: Int,
    val width: Int,
    val height: Int,
)

data class ChampionStatsDomainModel(
    val health: Double,
    val healthPerLevel: Double,
    val resource: Double,
    val resourcePerLevel: Double,
    val movementSpeed: Double,
    val armor: Double,
    val armorPerLevel: Double,
    val magicResistance: Double,
    val magicResistancePerLevel: Double,
    val attackRange: Double,
    val healthRegeneration: Double,
    val healthRegenerationPerLevel: Double,
    val resourceRegeneration: Double,
    val resourceRegenerationPerLevel: Double,
    val criticalStrikeChance: Double,
    val criticalStrikeChancePerLevel: Double,
    val attackDamage: Double,
    val attackDamagePerLevel: Double,
    val attackSpeedPerLevel: Double,
    val attackSpeed: Double,
)
