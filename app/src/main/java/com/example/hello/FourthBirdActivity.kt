package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.hello.databinding.ActivityFourthBirdBinding
import com.example.hello.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class FourthBirdActivity : AppCompatActivity() {
    lateinit var binding: ActivityFourthBirdBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFourthBirdBinding.inflate(layoutInflater)

        setContentView(binding.root)
        val btnprev3 = findViewById<ImageView>(R.id.btnprev3)
        val btnnext4 = findViewById<ImageView>(R.id.btnnext4)

        btnprev3.setOnClickListener {
            finish()
        }

        btnnext4.setOnClickListener {
            val intent = Intent(this, FifthBirdActivity::class.java)
            startActivity(intent)

        }
        Picasso.get().load("https://images.unsplash.com/photo-1535083783855-76ae62b2914e?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1yZWxhdGVkfDh8fHxlbnwwfHx8fHw%3D").into(binding.imageView9)

    }
}