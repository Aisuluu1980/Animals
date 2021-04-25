package kg.tutorialapp.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class ActivityAnimal : AppCompatActivity() {

    lateinit var textview: TextView
    lateinit var image_1: ImageView
    lateinit var image_2: ImageView
    lateinit var image_3: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_animal)

        textview = findViewById(R.id.textView)

        image_1 = findViewById(R.id.image_1)
        image_1.setOnClickListener{
            textview.text = getString((R.string.first))
        }
        image_2 = findViewById(R.id.image_2)
        image_2.setOnClickListener{
            textview.text = getString((R.string.second))
        }
        image_3 = findViewById(R.id.image_3)
        image_3.setOnClickListener{
            textview.text = getString((R.string.third))
        }
    }
}
