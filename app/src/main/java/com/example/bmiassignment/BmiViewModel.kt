package com.example.bmiassignment

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BmiViewModel: ViewModel() {
    var heightInput: String by mutableStateOf("")
    var weightInput: String by mutableStateOf("")

    fun calculationBmi(): String {
        val height = heightInput.toFloatOrNull() ?: 0.0f
        val weight = weightInput.toIntOrNull() ?: 0
        val bmi = if (weight > 0 && height > 0) {
            weight / (height * height)
        } else {
            0.0f
        }
        return String.format("%.2f", bmi)
    }
}
