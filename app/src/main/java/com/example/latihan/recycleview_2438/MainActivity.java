package com.example.latihan.recycleview_2438;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private String[] movie = {"Anisykurli Faza R","The Old Guard","Anisykurli Faza R","Elite","Anisykurli Faza R","Artemis Fowl","Black Box","Anisykurli Faza R","Law & Order: Special Victims Unit","Scary Movie 5","Star Trek: Discovery","Hubie Halloween","District 9","The Hurricane Heist","Paddington 2","Pride & Prejudice "};

    private String[] movieYear = {"2438","2438","2438","2438","2438","2438","2438","2438","2438","2438","2438","2438","2438","2438","2438","2438"};

    private ArrayList<Movie> movieList;

    private RecyclerView rvMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        movieList = new ArrayList<>();

        for (int i = 0; i < (movie.length) ; i++) {
            Movie mov = new Movie(movie[i],movieYear[i]);
            movieList.add(mov);
        }

        rvMovie = findViewById(R.id.rv_movie);
        rvMovie.setHasFixedSize(true);

        rvMovie.setLayoutManager(new LinearLayoutManager(this));

        MovieAdapter movieAdapter = new MovieAdapter(movieList);
        rvMovie.setAdapter(movieAdapter);


    }
}