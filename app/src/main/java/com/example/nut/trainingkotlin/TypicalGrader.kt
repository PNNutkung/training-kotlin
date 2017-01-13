package com.example.nut.trainingkotlin

/**
 * Created by nut on 1/14/17.
 * Typical Grader class
 */
class TypicalGrader : Grader {
    override fun grade(score: Int): String =
            when (score) {
                in 80..100 -> "A"
                in 75..79 -> "B+"
                in 70..74 -> "B"
                in 65..69 -> "C+"
                in 60..64 -> "C"
                in 55..59 -> "D+"
                in 50..54 -> "D"
                in 0..49 -> "F"
                else -> "???"
            }
}
