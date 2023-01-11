package com.example.alpacasponsorship.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.alpacasponsorship.R
import com.example.alpacasponsorship.data.modul.Alpaca

class AlpacaAdapter(private val context: Context,private val dataset: List<Alpaca>)
                    : RecyclerView.Adapter<AlpacaAdapter.ViewHolder>() {



        // define which parts of the layout shall be renewed before displaying
        class ViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
            val alpaca_name = view.findViewById<TextView>(R.id.alpaca_name_text)
            val alpaca_age = view.findViewById<TextView>(R.id.alpaca_age_text)
            val alpaca_personality = view.findViewById<TextView>(R.id.alpaca_personality_text)
            val alpaca_pic = view.findViewById<ImageView>(R.id.alpaca_image)
            val sponsor_button = view.findViewById<Button>(R.id.sponsorship_button)
            val donate_button = view.findViewById<Button>(R.id.donation_button)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val adapterLayout = LayoutInflater.from(parent.context)
                .inflate(R.layout.alpaca_item, parent, false)
            return ViewHolder(adapterLayout)
        }


        // recycling process starts
        // the attributes of the ViewHolder are renewed
        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val alpaca = dataset[position]
            holder.alpaca_name.text = alpaca.name
            holder.alpaca_age.text = "${alpaca.age} year(s)"
            holder.alpaca_personality.text = alpaca.personality
            holder.alpaca_pic.setImageResource(alpaca.imageResource)
            holder.sponsor_button.text = "sponsorship"
            holder.donate_button.text = "donation"

            holder.sponsor_button.setOnClickListener {
                    Toast.makeText(context,"${alpaca.name} is happy to have you as family!", Toast.LENGTH_SHORT)
                        .show()
            }

            holder.donate_button.setOnClickListener {
                Toast.makeText(context,"Thank you very much!", Toast.LENGTH_SHORT)
                    .show()
            }
        }


        // layoutManager needs to know amount of items
        override fun getItemCount(): Int {
            return dataset.size
        }
}
