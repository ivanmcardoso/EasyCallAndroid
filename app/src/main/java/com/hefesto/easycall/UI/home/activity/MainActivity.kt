package com.hefesto.easycall.UI.home.activity

import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import androidx.navigation.Navigation
import com.hefesto.easycall.R
import kotlinx.android.synthetic.main.appbar_home.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<FloatingActionButton>(R.id.fab).setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        setupAppbarBehavior()
    }

    private fun setupAppbarBehavior() {
        val navController = Navigation.findNavController(this, R.id.nav_host_fragment)
        navController.addOnDestinationChangedListener { controller, destination, arguments ->
             when (destination.id) {
                R.id.FirstFragment -> {
                    appbar_tv_name.text = "Contatos"
                    appbar_iv_pressback.visibility = View.GONE
                    appbar_iv_settings.visibility = View.VISIBLE
                }
                R.id.SecondFragment -> {
                    appbar_tv_name.text = "Editar Contato"
                    appbar_iv_pressback.visibility = View.VISIBLE
                    appbar_iv_pressback.setOnClickListener { onBackPressed() }
                    appbar_iv_settings.visibility = View.GONE
                }
                else -> "EasyCall"
            }

        }
    }
}