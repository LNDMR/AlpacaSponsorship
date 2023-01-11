package com.example.alpacasponsorship

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.alpacasponsorship.adapter.AlpacaAdapter
import com.example.alpacasponsorship.data.DataSource
import com.example.alpacasponsorship.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val dataSource = DataSource()
        val alpacaList = dataSource.getAlapacas()

        binding.alpacaRecycler.adapter = AlpacaAdapter(this,alpacaList)
        Toast.makeText(this,"App started",Toast.LENGTH_SHORT)
            .show()
    }

}