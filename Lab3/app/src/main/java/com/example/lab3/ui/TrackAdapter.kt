package com.example.lab3.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3.R
import com.example.lab3.model.Track

class TrackAdapter(
    private val tracks: List<Track>
) : RecyclerView.Adapter<TrackAdapter.TrackViewHolder>() {

    class TrackViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val cover: ImageView = view.findViewById(R.id.ivCover)
        val title: TextView = view.findViewById(R.id.tvTitle)
        val artist: TextView = view.findViewById(R.id.tvArtist)
        val duration: TextView = view.findViewById(R.id.tvDuration)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TrackViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_track, parent, false)
        return TrackViewHolder(view)
    }

    override fun onBindViewHolder(holder: TrackViewHolder, position: Int) {
        val track = tracks[position]

        holder.cover.setImageResource(track.coverResId)
        holder.title.text = track.title
        holder.artist.text = track.artist
        holder.duration.text = track.duration
    }

    override fun getItemCount(): Int = tracks.size
}
