package com.gabriel.easycall

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener() {
            openNextActivity()
        }

        button2.setOnClickListener() {
            openNextActivity2()
        }

    }

    private fun openNextActivity() {
        val it = Intent(this, configuracoes::class.java)
        startActivity(it)
    }

    private fun openNextActivity2() {
        val it = Intent(this, Mapear_contato::class.java)
        startActivity(it)
    }
}

/*    Override fun onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState)
                setContentView(R.layout.configuracoes_do_app)
    }*/