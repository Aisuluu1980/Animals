package kg.tutorialapp.animals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class LessonsActivity : AppCompatActivity() {
    lateinit var btnOk: Button
    lateinit var btnShape: Button
    lateinit var btnLinear: Button
    lateinit var btnRelative: Button
    lateinit var btnConstraint: Button
    lateinit var btnConstraint2: Button
    lateinit var textGet: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lessons)

        val actionBar = supportActionBar
        actionBar!!.title = "Lessons"
        actionBar.setDisplayHomeAsUpEnabled(true)

        textGet()
        lesson_26()
        lesson_27()
        lesson_28()
        lesson_29()
        lesson_30()
        lesson_31()

        }
//    Функция получаем текст, который ввели в ActivityConstraint  и передали в этот активи
    private fun textGet(){
        textGet = findViewById(R.id.textFromOtherActivity)
        val textFromIntent = intent.getStringExtra("String")
        textGet.text = textFromIntent
    }
    private fun lesson_26() {
        btnOk = findViewById(R.id.btn_ok)
        //если в xml указали enabled=false  то можно так указать что кнопка кликабельна
        btnOk.isEnabled = true

        btnOk.setOnClickListener {
            Toast.makeText(this, getString(R.string.toast_text), Toast.LENGTH_LONG).show()
        }
    }
    private fun lesson_27() {
        btnShape = findViewById(R.id.btn_lesson_27)
        btnShape.setOnClickListener {
            Toast.makeText(this, getString(R.string.toast_text), Toast.LENGTH_LONG).show()
        }
    }
    private fun lesson_28() {
        btnLinear = findViewById(R.id.btn_lesson_28)
        btnLinear.setOnClickListener {
            val linearIntent = Intent(this, ActivityLinear::class.java)
            startActivity(linearIntent)
        }
    }
    private fun lesson_29() {
        btnRelative = findViewById(R.id.btn_lesson_29)
        btnRelative.setOnClickListener {
            val relativeIntent = Intent(this, ActivityRelative::class.java)
            startActivity(relativeIntent)
        }
    }
    private fun lesson_30() {
        btnConstraint = findViewById(R.id.btn_lesson_30)
        btnConstraint.setOnClickListener {
            val constraintIntent = Intent(this, ActivityConstraint::class.java)
            startActivity(constraintIntent)
        }
    }
    private fun lesson_31(){
        btnConstraint2 = findViewById(R.id.btn_lesson_31)
        btnConstraint2.setOnClickListener{
            val constIntent = Intent(this, ActivityConstraint2::class.java)
            startActivity(constIntent)
        }
    }

}