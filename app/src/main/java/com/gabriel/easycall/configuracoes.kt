package com.gabriel.easycall

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.configuracoes_do_app.*

class configuracoes : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.configuracoes_do_app)

        btnConcluir.setOnClickListener(){
            finishActivity()
        }

    }

    private fun finishActivity() {
        finish()
    }

    fun onRadioButtonClicked(view: View) {
        var getRdMensagem = findViewById(R.id.rbMensagem) as RadioButton
        if (view is RadioButton) {
            val checked = view.isChecked

            when (view.getId()) {
                R.id.rbWhat ->
                    if (checked) {

                    }
                R.id.rbMensagem ->
                    if (checked) {
                        // Ninjas rule
                    }
            }
        }
    }
}