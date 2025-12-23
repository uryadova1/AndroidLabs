package com.example.lab3.ui


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3.R
import com.example.lab3.model.Track

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        val tracks = listOf(
            Track("Lose Yourself", "Eminem", "5:26", R.drawable.ic_music),
            Track("Numb", "Linkin Park", "3:07", R.drawable.ic_music),
            Track("Smells Like Teen Spirit", "Nirvana", "5:01", R.drawable.ic_music),
            Track("Never gonna give u up", "Rick Astley", "5:01", R.drawable.prank),
            Track("Bohemian Rhapsody", "Queen", "5:55", R.drawable.ic_music),
            Track("Billie Jean", "Michael Jackson", "4:54", R.drawable.ic_music),
            Track("Hotel California", "Eagles", "6:30", R.drawable.ic_music),
            Track("Stairway to Heaven", "Led Zeppelin", "8:02", R.drawable.ic_music),
            Track("Imagine", "John Lennon", "3:01", R.drawable.ic_music),
            Track("Shape of You", "Ed Sheeran", "3:53", R.drawable.ic_music),
            Track("Blinding Lights", "The Weeknd", "3:20", R.drawable.ic_music),
            Track("Bad Guy", "Billie Eilish", "3:14", R.drawable.ic_music),
            Track("Smooth Criminal", "Michael Jackson", "4:17", R.drawable.ic_music),
            Track("Back in Black", "AC/DC", "4:14", R.drawable.ic_music),
            Track("Wonderwall", "Oasis", "4:18", R.drawable.ic_music),
            Track("Smells Like Teen Spirit", "Nirvana", "5:01", R.drawable.ic_music),
            Track("Rolling in the Deep", "Adele", "3:48", R.drawable.ic_music),
            Track("Uptown Funk", "Mark Ronson ft. Bruno Mars", "4:29", R.drawable.ic_music),
            Track("Take On Me", "a-ha", "3:46", R.drawable.ic_music),
            Track("Hey Jude", "The Beatles", "7:11", R.drawable.ic_music),
            Track("Thriller", "Michael Jackson", "5:57", R.drawable.ic_music),
            Track("Sweet Child o' Mine", "Guns N' Roses", "5:56", R.drawable.ic_music),
            Track("Viva la Vida", "Coldplay", "4:01", R.drawable.ic_music),
            Track("Seven Nation Army", "The White Stripes", "3:59", R.drawable.ic_music)

        )

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = TrackAdapter(tracks)
    }
}