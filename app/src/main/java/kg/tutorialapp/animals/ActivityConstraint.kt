package kg.tutorialapp.animals

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class ActivityConstraint : AppCompatActivity() {

    lateinit var editTextConst: EditText
    lateinit var btnOtherActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constraint)

        val actionBar = supportActionBar
        actionBar!!.title = "Constraint Layout"

        putOtherActivity()
    }
    private fun putOtherActivity(){
        editTextConst = findViewById(R.id.editText_const)

        btnOtherActivity = findViewById(R.id.btn_8)
        btnOtherActivity.setOnClickListener {
            val text = editTextConst.text.toString()
            val intent = Intent(this, LessonsActivity::class.java)
            intent.putExtra("String", text)
            startActivity(intent)
        }
    }
}