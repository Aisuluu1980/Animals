package kg.tutorialapp.animals

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class ActivityMyColor : AppCompatActivity() {

    lateinit var btnRed: Button
    lateinit var btnYellow: Button
    lateinit var btnGreen: Button
    lateinit var textColor: TextView
    lateinit var layout_main: ConstraintLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_color)

        layout_main = findViewById(R.id.main_layout) as ConstraintLayout
        textColor = findViewById(R.id.text_color)

        btnRed = findViewById(R.id.btn_red) as Button
        btnRed.setOnClickListener {
            textColor.text = resources.getText(R.string.red_btn)
            layout_main.setBackgroundColor(Color.RED)
        }

        btnYellow = findViewById(R.id.btn_yellow) as Button
        btnYellow.setOnClickListener {
            textColor.text = resources.getText(R.string.yellow_btn)
            layout_main.setBackgroundColor(Color.YELLOW)
        }

        btnGreen = findViewById(R.id.btn_green) as Button
        btnGreen.setOnClickListener {
            textColor.text = resources.getText(R.string.green_btn)
            layout_main.setBackgroundColor(Color.GREEN)
        }
    }
}