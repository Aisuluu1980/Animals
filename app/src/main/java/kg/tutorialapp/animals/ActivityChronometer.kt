package kg.tutorialapp.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ActivityChronometer : AppCompatActivity() {

    lateinit var btn_start: Button
    lateinit var btn_stop: Button
    lateinit var btn_reset: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chronometer)

        btn_start = findViewById(R.id.start)
        btn_stop = findViewById(R.id.stop)
        btn_reset = findViewById(R.id.reset)
    }
}