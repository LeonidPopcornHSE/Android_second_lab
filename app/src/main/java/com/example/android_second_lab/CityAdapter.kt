package com.example.android_second_lab
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


data class City(val name: String, val imageResId: Int)

class CityAdapter(private val cities: List<City>) :
    RecyclerView.Adapter<CityAdapter.CityViewHolder>() {

    class CityViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val cityName: TextView = view.findViewById(R.id.city_name)
        val cityImage: ImageView = view.findViewById(R.id.city_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CityViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_city, parent, false)
        return CityViewHolder(view)
    }

    override fun onBindViewHolder(holder: CityViewHolder, position: Int) {
        val city = cities[position]
        holder.cityName.text = city.name
        holder.cityImage.setImageResource(city.imageResId)
    }

    override fun getItemCount() = cities.size
}
