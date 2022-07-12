package com.alirezabashi98.neumorphism

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.alirezabashi98.neumorphism.databinding.ActivityMain2Binding
import soup.neumorphism.ShapeType

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding
    private var checkBattery = false
    private var checkDry = false
    private var checkRang = true
    private var checkProgram = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        castOnClick()
    }

    private fun castOnClick() {
        binding.btnBattery.setOnClickListener {
            checkBattery = if (checkBattery) {
                binding.btnBattery.setShapeType(ShapeType.FLAT)
                binding.btnBattery.setColorFilter(ContextCompat.getColor(this,R.color.text_gray))
                false
            } else {
                binding.btnBattery.setShapeType(ShapeType.PRESSED)
                binding.btnBattery.setColorFilter(ContextCompat.getColor(this,R.color.blue_light))
                true
            }
        }
        binding.btnDry.setOnClickListener {
            checkDry = if (checkDry) {
                binding.btnDry.setShapeType(ShapeType.FLAT)
                binding.btnDry.setColorFilter(ContextCompat.getColor(this,R.color.text_gray))
                false
            } else {
                binding.btnDry.setShapeType(ShapeType.PRESSED)
                binding.btnDry.setColorFilter(ContextCompat.getColor(this,R.color.blue_light))
                true
            }
        }
        binding.btnRange.setOnClickListener {
            checkRang = if (checkRang) {
                binding.btnRange.setShapeType(ShapeType.FLAT)
                binding.btnRange.setColorFilter(ContextCompat.getColor(this,R.color.text_gray))
                false
            } else {
                binding.btnRange.setShapeType(ShapeType.PRESSED)
                binding.btnRange.setColorFilter(ContextCompat.getColor(this,R.color.blue_light))
                true
            }
        }
        binding.btnProgram.setOnClickListener {
            checkProgram = if (checkProgram) {
                binding.btnProgram.setShapeType(ShapeType.FLAT)
                binding.btnProgram.setColorFilter(ContextCompat.getColor(this,R.color.text_gray))
                false
            } else {
                binding.btnProgram.setShapeType(ShapeType.PRESSED)
                binding.btnProgram.setColorFilter(ContextCompat.getColor(this,R.color.blue_light))
                true
            }
        }
    }
}