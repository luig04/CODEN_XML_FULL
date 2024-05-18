package com.adso.appluic

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hcursos)

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment_navbar, FragmentNavBar())
            commit()
        }

    }
}
