package dev.vincenzocostagliola.setupyourfridge.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import dev.vincenzocostagliola.setupyourfridge.R

class RecyclerBeerAdapter: RecyclerView.Adapter<RecyclerBeerAdapter.ViewHolder>() {


    var img: Array<Int?> = arrayOf(R.drawable.ichnusa_test, R.drawable.messina_test, null)
    var title = arrayOf("Ichnusa non filtrata", "Birra Messina Cristalli Di Sale", "PlaceHolder testing mode")
    var qnt = arrayOf("33 cl", "33 cl", "66 cl")
    var desc = arrayOf("Colore giallo dorato luminoso con schiuma fine e persistente.", "Colore giallo dorato luminoso con una naturale opalescenza, ha schiuma compatta e persistente.", "lorem ipsum lorem ipsum lorem ipsum lorem ipsum lorem ipsum")

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerBeerAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.beer_list_layout, parent, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(holder: RecyclerBeerAdapter.ViewHolder, position: Int) {
        holder.titleBeer.text = title[position]
        holder.qntBeer.text = qnt[position]
        holder.descBeer.text = desc[position]
        if (img[position] != null){
            holder.imgBeer.setImageResource(img[position]!!)
        } else {
            holder.imgBeer.setImageResource(R.drawable.placeholder)
        }
    }

    override fun getItemCount(): Int {
        return title.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var imgBeer: ImageView = itemView.findViewById(R.id.img_beer_list)
        var titleBeer: TextView = itemView.findViewById(R.id.title_beer_list)
        var qntBeer: TextView = itemView.findViewById(R.id.qnt_beer_list)
        var descBeer: TextView = itemView.findViewById(R.id.dsc_beer_list)

    }
}