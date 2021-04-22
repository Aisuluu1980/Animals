package kg.tutorialapp.animals

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.constraintlayout.widget.Group

class ActivityConstraint2 : AppCompatActivity() {
//    lateinit var group_helper: Group

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint2)

//        group_helper = findViewById(R.id.group)
//        group_helper.visibility = View.GONE
    }
}