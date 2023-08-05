package com.junnosuke.loveall.scoreboard.domain

import com.junnosuke.loveall.core.domain.team.Team

interface ScoreManager {

    fun score(
        team: Team,
        fromText: String,
        toLanguage: Language
    ): String

}