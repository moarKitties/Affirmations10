package com.example.affirmations10

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations10.adapter.ItemAdapter
import com.example.affirmations10.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
   
        val myDatset = Datasource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view2)
        recyclerView.adapter = ItemAdapter(this, myDatset)

        recyclerView.setHasFixedSize(true)
    }
}