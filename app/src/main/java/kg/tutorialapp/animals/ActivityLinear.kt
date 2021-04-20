package kg.tutorialapp.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class ActivityLinear : AppCompatActivity() {

    lateinit var text1: TextView
    lateinit var text2: TextView
    lateinit var text3: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)

        text1 = findViewById(R.id.view) as TextView
        text1.text = getText(R.string.text1)

        text2 = findViewById(R.id.view2) as TextView
        text2.text = getText(R.string.text2)

        text3 = findViewById(R.id.view3) as TextView
        text3.text = getText(R.string.text3)
    }
}