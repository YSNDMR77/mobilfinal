//LocalSportsDataProvider.kt

package com.example.sports.data

import com.example.sports.R
import com.example.sports.model.Sport

/**
 * Sports data
 */
object LocalSportsDataProvider{
    val defaultSport = getSportsData()[0]

    fun getSportsData(): List<Sport> {
        return listOf(
            Sport(
                id = 4,
                titleResourceId = R.string.abd,
                subtitleResourceId = R.string.abdkisa,
                playerCount = 9 ,
                olympic = true,
                imageResourceId = R.drawable.abd_kucuk,
                sportsImageBanner = R.drawable.abd_kucuk,
                sportDetails = R.string.abduzun
            ),
            Sport(
                id = 1,
                titleResourceId = R.string.almanya,
                subtitleResourceId = R.string.almanyakisa,
                playerCount = 5,
                olympic = true,
                imageResourceId = R.drawable.almanyakucuk,
                sportsImageBanner = R.drawable.almanyakucuk,
                sportDetails = R.string.almanyauzun
            ),
            Sport(
                id = 2,
                titleResourceId = R.string.cin,
                subtitleResourceId = R.string.cinkisa,
                playerCount = 5,
                olympic = true,
                imageResourceId = R.drawable.cinkucuk,
                sportsImageBanner = R.drawable.cinkucuk,
                sportDetails = R.string.cin
            ),Sport(
                id = 3,
                titleResourceId = R.string.tunus,
                subtitleResourceId = R.string.tunusukisa,
                playerCount = 5,
                olympic = true,
                imageResourceId = R.drawable.tunus_kucuk,
                sportsImageBanner = R.drawable.tunus_kucuk,
                sportDetails = R.string.tunusuzun
            ),
            Sport(
                id = 5,
                titleResourceId = R.string.brezilya,
                subtitleResourceId = R.string.brezilyakisa,
                playerCount = 5,
                olympic = true,
                imageResourceId = R.drawable.brezilya_kucuk,
                sportsImageBanner = R.drawable.brezilya_kucuk,
                sportDetails = R.string.brezilyauzun
            ),
            Sport(
                id = 6,
                titleResourceId = R.string.avusturalya,
                subtitleResourceId = R.string.avusturalyakisa,
                playerCount = 5,
                olympic = true,
                imageResourceId = R.drawable.kucuk_avusturalya,
                sportsImageBanner = R.drawable.kucuk_avusturalya,
                sportDetails = R.string.avusturalyauzun
            ),
            Sport(
                id = 7,
                titleResourceId = R.string.antartika,
                subtitleResourceId = R.string.antartikakisa,
                playerCount = 5,
                olympic = true,
                imageResourceId = R.drawable.antartika,
                sportsImageBanner = R.drawable.antartika,
                sportDetails = R.string.antartikauzun
            ),


        )
    }
}