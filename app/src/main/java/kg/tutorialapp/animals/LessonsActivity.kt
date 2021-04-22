package kg.tutorialapp.animals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class LessonsActivity : AppCompatActivity() {
    lateinit var btnOk: Button
    lateinit var btnShape: Button
    lateinit var btnLinear: Button
    lateinit var btnRelative: Button
    lateinit var btnConstraint: Button
    lateinit var btnConstraint2: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lessons)

        btnOk = findViewById(R.id.btn_ok) as Button

        //если в xml указали enabled=false  то можно так указать что кнопка кликабельна
        btnOk.isEnabled = true

        btnOk.setOnClickListener{
            Toast.makeText(this, getString(R.string.toast_text),Toast.LENGTH_LONG).show()
        }
        btnShape = findViewById(R.id.btn_lesson_27) as Button
        btnShape.setOnClickListener{
            Toast.makeText(this, getString(R.string.toast_text),Toast.LENGTH_LONG).show()
        }
        btnLinear = findViewById(R.id.btn_lesson_28)
        btnLinear.setOnClickListener{
            val linearIntent = Intent(this, ActivityLinear::class.java)
            startActivity(linearIntent)
        }
        btnRelative = findViewById(R.id.btn_lesson_29)
        btnRelative.setOnClickListener{
            val relativeIntent = Intent(this, ActivityRelative::class.java)
            startActivity(relativeIntent)
        }
        btnConstraint = findViewById(R.id.btn_lesson_30)
        btnConstraint.setOnClickListener{
            val constraintIntent = Intent(this, ActivityConstraint::class.java)
            startActivity(constraintIntent)
        }
        btnConstraint2 = findViewById(R.id.btn_lesson_31)
        btnConstraint2.setOnClickListener{
            val constIntent = Intent(this, ActivityConstraint2::class.java)
            startActivity(constIntent)
        }
    }
}