package com.prithviraj.moviesappcardview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        recyclerView=findViewById(R.id.recyclerView);
        ArrayList<MovieDetails> movies = new ArrayList<MovieDetails>();
        movies.add(new MovieDetails("The Shawshank Redemption", R.drawable.card1));
        movies.add(new MovieDetails("The Godfather", R.drawable.card2));
        movies.add(new MovieDetails("The Dark Knight", R.drawable.card3));
        movies.add(new MovieDetails("The Godfather: Part II", R.drawable.card4));
        movies.add(new MovieDetails("12 Angry Men", R.drawable.card5));
        movies.add(new MovieDetails("Schindler's List", R.drawable.card6));
        movies.add(new MovieDetails("The Lord of the Rings: The Return of the King", R.drawable.card7));
        movies.add(new MovieDetails("Pulp Fiction", R.drawable.card8));
        movies.add(new MovieDetails("The Good, the Bad and the Ugly", R.drawable.card9));
        movies.add(new MovieDetails("Fight Club", R.drawable.card10));
        myAdapter= new MyAdapter(this,movies);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(myAdapter);



    }
}