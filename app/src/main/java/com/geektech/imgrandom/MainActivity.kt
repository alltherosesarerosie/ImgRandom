package com.geektech.imgrandom

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.geektech.imgrandom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val img = arrayListOf("https://i.pinimg.com/736x/36/cc/96/36cc96e7f7d0e09ed143e0a58cc8dded.jpg",
            "https://i.pinimg.com/736x/86/21/06/8621063dc107587bd78c90f2fbb7d0b1.jpg",
            "https://i.pinimg.com/564x/ac/20/ae/ac20ae19715c305d4b7319b7ce848856.jpg",
            "https://i.pinimg.com/564x/03/44/37/034437e020d265f78434c2efad255002.jpg",
            "https://i.pinimg.com/564x/a0/53/06/a053061654a8c6d93e01d63cae00d4d3.jpg")

        with(binding){
            btnSubmit.setOnClickListener {
                val url = etUrl.text.toString()
                img.add(url)
                ivImg.loadImage(url)
                etUrl.text = null
            }

            btnRandom.setOnClickListener {
                val ind = (0 until (img.size)).random()
                ivImg.loadImage(img[ind])
            }
        }
    }
}