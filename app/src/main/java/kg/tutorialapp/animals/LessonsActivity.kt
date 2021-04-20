package kg.tutorialapp.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class LessonsActivity : AppCompatActivity() {
    lateinit var btnOk: Button
    lateinit var btnShape: Button

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
    }
}