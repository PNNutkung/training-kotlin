package com.example.nut.trainingkotlin

/**
 * Created by nut on 1/14/17.
 * Su Grader
 */

class SuGrader(val satisfy: Int = 60) : Grader {
    init {
        if (satisfy < 0 || satisfy > 100)
            throw IllegalArgumentException("A satisfy $satisfy is out of range of 0-100")
    }

    override fun grade(score: Int): String = when (score) {
        in satisfy..100 -> "S"
        in 0 until satisfy -> "U"
        else -> "???"
    }
}
