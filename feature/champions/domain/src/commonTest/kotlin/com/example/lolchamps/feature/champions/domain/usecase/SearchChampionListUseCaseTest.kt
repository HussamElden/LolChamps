package com.example.lolchamps.feature.champions.domain.usecase

import com.example.lolchamps.feature.champions.domain.model.ChampionInfoDomainModel
import com.example.lolchamps.feature.champions.domain.model.ChampionStatsDomainModel
import com.example.lolchamps.feature.champions.domain.model.ChampionSummaryDomainModel
import com.example.lolchamps.feature.champions.domain.model.ImageDomainModel
import kotlin.test.Test
import kotlin.test.assertEquals


class SearchChampionListUseCaseTest {
    private val useCase = SearchChampionListUseCase()

    @Test
    fun `search with no value in query`() {
        val championList = mockChampionList()

        val result = useCase(
            championList = championList,
            query = "",
        )
        assertEquals(championList,result)
    }

    @Test
    fun `search with value in query`() {

        val championList = mockChampionList()

        val result = useCase(
            championList = championList,
            query = "Aat",
        )
        assertEquals(listOf(championList[0]),result)
    }

    private fun mockChampionList() = listOf(
        mockChampion(
            id = "Aatrox",
            key = "266",
            name = "Aatrox",
            roles = listOf("Fighter"),
            resourceType = "Blood Well",
        ),
        mockChampion(
            id = "Ahri",
            key = "103",
            name = "Ahri",
            roles = listOf("Mage", "Assassin"),
            resourceType = "Mana",
        ),
        mockChampion(
            id = "MissFortune",
            key = "21",
            name = "Miss Fortune",
            roles = listOf("Marksman"),
            resourceType = "Mana",
        ),
    )

    private fun mockChampion(
        id: String,
        key: String,
        name: String,
        roles: List<String>,
        resourceType: String,
    ) = ChampionSummaryDomainModel(
        version = "1.0.0",
        id = id,
        key = key,
        name = name,
        title = "$name title",
        summary = "$name summary",
        gameplayRatings = ChampionInfoDomainModel(
            attackRating = 5,
            defenseRating = 5,
            magicRating = 5,
            difficultyRating = 5,
        ),
        image = ImageDomainModel(
            fileName = "$id.png",
            spriteFileName = "champion0.png",
            assetGroup = "champion",
            xOffset = 0,
            yOffset = 0,
            width = 48,
            height = 48,
        ),
        roles = roles,
        resourceType = resourceType,
        stats = ChampionStatsDomainModel(
            health = 600.0,
            healthPerLevel = 100.0,
            resource = 400.0,
            resourcePerLevel = 25.0,
            movementSpeed = 335.0,
            armor = 30.0,
            armorPerLevel = 4.0,
            magicResistance = 30.0,
            magicResistancePerLevel = 1.3,
            attackRange = 550.0,
            healthRegeneration = 5.0,
            healthRegenerationPerLevel = 0.5,
            resourceRegeneration = 8.0,
            resourceRegenerationPerLevel = 0.8,
            criticalStrikeChance = 0.0,
            criticalStrikeChancePerLevel = 0.0,
            attackDamage = 60.0,
            attackDamagePerLevel = 3.0,
            attackSpeedPerLevel = 2.0,
            attackSpeed = 0.65,
        ),
    )
}
