package com.example.android_second_lab
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)

        val cities = listOf(
            City("New York", R.drawable.new_york),
            City("Nizhny Novgorod", R.drawable.ni_no),
            City("Tokyo", R.drawable.tokyo)
        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CityAdapter(cities)
    }
}
