package com.example.poslic.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.poslic.Poslovi
import com.example.poslic.R

class RecyclerviewAdapter(private val poslovi: List<Poslovi>) :
    RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder>() {

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder).
     */
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nazivPosla: TextView = view.findViewById(R.id.tv_nazivPosla)
        val lokacija: TextView = view.findViewById(R.id.tv_lokacija)
        val satnica: TextView = view.findViewById(R.id.tv_satnica)
        val vise: TextView = view.findViewById(R.id.tv_vidiVise)
    }



    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        // Create a new view, which defines the UI of the list item

        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.job_list, parent, false)

        return ViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element

        val currentItem = poslovi[position]
        viewHolder.nazivPosla.text = currentItem.nazivPosla
        viewHolder.lokacija.text = currentItem.lokacija
        viewHolder.satnica.text = currentItem.satnica
        viewHolder.vise.text = currentItem.vidiVise
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = poslovi.size

}
