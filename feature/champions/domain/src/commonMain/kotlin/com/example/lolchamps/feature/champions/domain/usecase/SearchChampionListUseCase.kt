package com.example.lolchamps.feature.champions.domain.usecase

import com.example.lolchamps.feature.champions.domain.model.ChampionSummaryDomainModel

class SearchChampionListUseCase {
     operator fun invoke(
          championList :List<ChampionSummaryDomainModel>,
          query: String
     ): List<ChampionSummaryDomainModel> {
         val trimmedQuery = query.trim()
         return if (trimmedQuery.isEmpty()) {
             championList
         } else {
             championList.filter { item ->
                 item.name.contains(trimmedQuery, ignoreCase = true)
             }
         }
     }

    }
