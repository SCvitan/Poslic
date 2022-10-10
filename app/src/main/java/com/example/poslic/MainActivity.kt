package com.example.poslic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.poslic.adapter.RecyclerviewAdapter
import java.util.ArrayList


private lateinit var recyclerView: RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val poslovi = generateDummyList(100)

        recyclerView = findViewById(R.id.rvPoslovi)
        recyclerView.adapter = RecyclerviewAdapter(poslovi)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)




    }

    private fun generateDummyList(size: Int): List<Poslovi>{
        val list = ArrayList<Poslovi>()

        for (i in 0 until size){
            val item = Poslovi("$i", "$i", "$i", "$i")
            list += item
        }

        return list

    }


}