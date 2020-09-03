package com.gabriel.easycall

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_mapear_contato.*

class Mapear_contato : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mapear_contato)

        btnConcluir2.setOnClickListener() {
            finishActivity()
        }
    }

    private fun finishActivity() {
        finish()
    }

}
