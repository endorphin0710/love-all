package com.junnosuke.loveall.scoreboard.presentation

import com.junnosuke.loveall.core.domain.team.Team

data class ScoreBoardState(
    val team1: Team,
    val team2: Team
)