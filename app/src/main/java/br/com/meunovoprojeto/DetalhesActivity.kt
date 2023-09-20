package br.com.meunovoprojeto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetalhesActivity : AppCompatActivity() {

    // Configuração do Atributo btnFechar como Button
    lateinit var btnFechar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalhes)

        btnFechar = findViewById(R.id.btn_fechar)
        btnFechar.setOnClickListener {
            finish()
        }
    }
}