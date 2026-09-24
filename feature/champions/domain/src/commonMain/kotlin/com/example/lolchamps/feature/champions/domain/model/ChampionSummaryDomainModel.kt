package com.example.lolchamps.feature.champions.domain.model


data class ChampionSummaryDomainModel(
val version: String,
val id: String,
val key: String,
val name: String,
val title: String,
val blurb: String,
val info: ChampionInfoDomainModel,
val image: ImageDomainModel,
val tags: List<String>,
val partype: String,
val stats: ChampionStatsDomainModel
)
data class ChampionInfoDomainModel(
    val attack: Int,
    val defense: Int,
    val magic: Int,
    val difficulty: Int
)
data class ImageDomainModel(
    val full: String,
    val sprite: String,
    val group: String,
    val x: Int,
    val y: Int,
    val w: Int,
    val h: Int
)
data class ChampionStatsDomainModel(
val hp: Number,
val hpperlevel: Number,
val mp: Number,
val mpperlevel: Number,
val movespeed: Number,
val armor: Number,
val armorperlevel: Number,
val spellblock: Number,
val spellblockperlevel: Number,
val attackrange: Number,
val hpregen: Number,
val hpregenperlevel: Number,
val mpregen: Number,
val mpregenperlevel: Number,
val crit: Number,
val critperlevel: Number,
val attackdamage: Number,
val attackdamageperlevel: Number,
val attackspeedperlevel: Number,
val attackspeed: Number
)