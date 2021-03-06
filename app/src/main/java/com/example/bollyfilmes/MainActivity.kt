package com.example.bollyfilmes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val filmeList = arrayListOf<ItemFilme>()
        filmeList.add(ItemFilme("Rubens", "First Name","01/05/1989",5.0))
        filmeList.add(ItemFilme("Zaes", "Nick Name","27/04/2020",4.0))
        filmeList.add(ItemFilme("Stanley", "Second NAme","10/05/1994",3.5))
        filmeList.add(ItemFilme("Almeida", "Last Name","05/12/1949",3.0))
        filmeList.add(ItemFilme("Brandão", "Last Name","01/01/1989",2.3))

        itemRecycleView.adapter = FilmesAdapter(filmeList)
        itemRecycleView.layoutManager = LinearLayoutManager(this)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.menuAtualizar -> {
                Toast.makeText(this, "Atualizando filmes...", Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
