package br.com.meunovoprojeto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    // Configuação do Atributo btnAbrir como Button
    lateinit var btnAbrir: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAbrir = findViewById(R.id.btn_abrir)
        btnAbrir.setOnClickListener {

            //Cria um Objeto Intent
            val intent = Intent(this,
                SegundaAba::class.java)

            // Inicia uma nova Atividade
            startActivity(intent)
        }
    }
}