package com.prithviraj.moviesappcardview;

public class MovieDetails {
    private String movieName;
    private int moviePoster;

    public MovieDetails(String movieName, int moviePoster) {
        this.movieName = movieName;
        this.moviePoster = moviePoster;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getMoviePoster() {
        return moviePoster;
    }
}
