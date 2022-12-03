package com.alusionista.mensis_eucharisticus.models

class TextModel() {

    fun getTextByDay(day: Int): List<String> {
        return when (day) {
            1 -> day1
            2 -> day2
            3 -> day3
            4 -> day4
            5 -> day5
            6 -> day6
            7 -> day7
            8 -> day8
            9 -> day9
            10 -> day10
            11 -> day11
            12 -> day12
            13 -> day13
            14 -> day14
            15 -> day15
            16 -> day16
            17 -> day17
            18 -> day18
            19 -> day19
            20 -> day20
            21 -> day21
            22 -> day22
            23 -> day23
            24 -> day24
            25 -> day25
            26 -> day26
            27 -> day27
            28 -> day28
            29 -> day29
            30 -> day30
            else ->  day31

        }
    }

}
