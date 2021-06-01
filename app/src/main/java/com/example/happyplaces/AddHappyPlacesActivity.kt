package com.example.happyplaces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.happyplaces.databinding.ActivityAddHappyPlacesBinding

class AddHappyPlacesActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddHappyPlacesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddHappyPlacesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.tbAddPlace)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        binding.tbAddPlace.setNavigationOnClickListener {
            onBackPressed()
        }
    }
}