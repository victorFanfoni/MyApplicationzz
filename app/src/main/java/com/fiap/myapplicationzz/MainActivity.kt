package com.fiap.myapplicationzz

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.fiap.myapplicationzz.ui.theme.MyApplicationzzTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(saveInstanceState: Bundle?){
        super.onCreate(saveInstanceState)
        setContentView(R.layout.activity_main)

        var btnCalcular = findViewById<Button>(R.id.btnCalcular)

        btnCalcular.setOnClickListener {view : View? ->
            var txtAlcool = findViewById<EditText>(R.id.txtPrecoAlcool)
            var precoAlcool = txtAlcool.text.toString().toDouble()
            var txtGasolina = findViewById<EditText>(R.id.txtPrecoGasolina)
            var precoGasolina = txtGasolina.text.toString().toDouble()
            var resultado : Double = precoAlcool / precoGasolina
            var mensagem = ""
            if (resultado > 0.7) {
                mensagem = "Gasolina"
            }
            else if (resultado < 0.7) {
                mensagem = "Alcool"
            }
            else {
                mensagem = "Tanto Faz"
            }
            Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
        }
    }
}