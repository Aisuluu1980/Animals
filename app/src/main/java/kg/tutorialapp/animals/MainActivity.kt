package kg.tutorialapp.animals

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {


    lateinit var textview: TextView
    lateinit var btnCalc: Button
    lateinit var btnAnimal: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar

        actionBar!!.title = "Main"
        actionBar.setDisplayHomeAsUpEnabled(true)


        textview = findViewById(R.id.textMain) as TextView
        textview.text = getString((R.string.text_main))

        btnCalc = findViewById(R.id.button1)
        btnCalc.setOnClickListener{
            val calcIntent = Intent(this, ActivityCalculator::class.java)
            startActivity(calcIntent)
            }
        btnAnimal = findViewById(R.id.button2)
        btnAnimal.setOnClickListener{
            val animalIntent = Intent(this, ActivityAnimal::class.java)
            startActivity(animalIntent)
        }
    }
}
