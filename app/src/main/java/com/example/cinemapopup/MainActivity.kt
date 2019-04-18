package com.example.cinemapopup

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val minhaLista = movies_list
        val adapter = MoviesAdapter()
        minhaLista.adapter = adapter
        minhaLista.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

    }
}
