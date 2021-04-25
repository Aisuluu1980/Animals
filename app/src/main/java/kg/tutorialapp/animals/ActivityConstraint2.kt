package kg.tutorialapp.animals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.Group

class ActivityConstraint2 : AppCompatActivity() {
//    lateinit var group_helper: Group




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint2)

        val actionBar = supportActionBar
        actionBar!!.title = "Constraint Layout part 2"


    }
//        group_helper = findViewById(R.id.group)
//        group_helper.visibility = View.GONE


}


