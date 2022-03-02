package br.com.aprendendo_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvResult = findViewById<TextView>(R.id.tvResult) // tv = TextView
        val etName = findViewById<EditText>(R.id.etName) // et = Edit Text
        val btSend = findViewById<Button>(R.id.btSend) // bt = Button

        btSend.setOnClickListener {
            if (etName.text.isNotBlank()) {

                tvResult.text = getString(R.string.hello_name, etName.text.toString())
            } else {
                etName.error = getString(R.string.type_your_name)
            }


        }
    }

}

