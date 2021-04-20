package kg.tutorialapp.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.SystemClock
import android.widget.Button
import android.widget.Chronometer

class ActivityChronometer : AppCompatActivity() {

    lateinit var btn_start: Button
    lateinit var btn_stop: Button
    lateinit var btn_reset: Button

    private lateinit var chronometer: Chronometer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chronometer)

        btn_start = findViewById(R.id.start)
        btn_stop = findViewById(R.id.stop)
        btn_reset = findViewById(R.id.reset)

        chronometer = findViewById(R.id.chronometer)
        chronometer.isCountDown = true

        btn_start.setOnClickListener {
            chronometer.base = SystemClock.elapsedRealtime()
            chronometer.start()
        }
        btn_stop.setOnClickListener {
            chronometer.stop()
        }
        btn_reset.setOnClickListener {
            chronometer.base = SystemClock.elapsedRealtime()
        }
    }
}