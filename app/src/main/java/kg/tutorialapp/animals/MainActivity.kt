package kg.tutorialapp.animals

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var textview: TextView
    lateinit var btnCalc: Button
    lateinit var btnAnimal: Button
    lateinit var btnLessons: Button
    lateinit var btnChronometr: Button
    lateinit var btnMyColor: Button

    val TAG = "LIFECYCLE"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "MainActivity onCreate()")

        val actionBar = supportActionBar

        actionBar!!.title = "Main"
        actionBar.setDisplayHomeAsUpEnabled(true)

        textview = findViewById(R.id.textMain)
        textview.text = getString((R.string.text_main))

        lessonsRun()
        calcRun()
        animalRun()
        calcRun()
        chronometerRun()
        colorRun()
    }

        private fun lessonsRun(){
            btnLessons = findViewById(R.id.btn_lessons)
            btnLessons.setOnClickListener {
                val lessonsIntent = Intent(this, LessonsActivity::class.java)
                startActivity(lessonsIntent)
            }
        }
        private fun calcRun(){
            btnCalc = findViewById(R.id.button1)
            btnCalc.setOnClickListener {
                val calcIntent = Intent(this, ActivityCalculator::class.java)
                startActivity(calcIntent)
            }
        }
        private fun animalRun(){
            btnAnimal = findViewById(R.id.button2)
            btnAnimal.setOnClickListener {
                val animalIntent = Intent(this, ActivityAnimal::class.java)
                startActivity(animalIntent)
            }
        }
        private fun chronometerRun(){
            btnChronometr = findViewById(R.id.btn_26)
            btnChronometr.setOnClickListener {
                val chronometrIntent = Intent(this, ActivityChronometer::class.java)
                startActivity(chronometrIntent)
            }
        }
        private fun colorRun(){
            btnMyColor = findViewById(R.id.btn_27)
            btnMyColor.setOnClickListener {
                val myColorIntent = Intent(this, ActivityMyColor::class.java)
                startActivity(myColorIntent)
            }
        }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "MainActivity onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "MainActivity onResume()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "MainActivity onPause()")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "MainActivity onStop()")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "MainActivity onRestart()")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "MainActivity onDestroy()")
    }
}


