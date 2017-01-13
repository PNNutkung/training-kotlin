package com.example.nut.trainingkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var grader: Grader = TypicalGrader()
    val satisfy = 50

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        act_grader_imageButton.setOnClickListener { view ->
            val s = act_grader_editText.text.toString()
            if (s.isNotBlank()) {
                try {
                    val i = s.toInt()
                    act_grader_editText.setText("")
                    act_grader_textView.text = grader.grade(i)
                } catch (e: NumberFormatException) {
                    Toast.makeText(this, "Hey! $s is not an Int", Toast.LENGTH_SHORT).show()
                }
            }
        }

        act_grader_radioGroup.setOnCheckedChangeListener { radioGroup, checkedId ->
            when (checkedId) {
                R.id.act_grader_radio_typical -> grader = TypicalGrader()
                R.id.act_grader_radio_su -> grader = SuGrader(satisfy)
            }
        }
    }
}
