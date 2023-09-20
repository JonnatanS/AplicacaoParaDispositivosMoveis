package br.com.meunovoprojeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SegundaAba : AppCompatActivity() {


    lateinit var btnVoltar: Button
    lateinit var btnProximo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segunda_aba)

        btnVoltar = findViewById(R.id.btn_voltar)
        btnVoltar.setOnClickListener {
            val intent = Intent(this,
                MainActivity::class.java)

            startActivity(intent)
        }

        btnProximo = findViewById(R.id.btn_proximo)
        btnProximo.setOnClickListener {
            val intent = Intent(this,
            DetalhesActivity::class.java)

            startActivity(intent)
        }
    }
}