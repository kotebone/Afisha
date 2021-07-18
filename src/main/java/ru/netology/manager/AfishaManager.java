package ru.netology.manager;

import ru.netology.domain.Movie;

public class AfishaManager {
  private int resultLength;
  private Movie[] movies = new Movie[0];

  public Movie[] getMovies() {
    return movies;
  }

  public AfishaManager() {
  }

  public AfishaManager(int resultLength) {
    this.resultLength = resultLength;
  }

  public void add(Movie item) {
    int length = movies.length + 1;
    Movie[] tmp = new Movie[length];
    System.arraycopy(movies, 0, tmp, 0, movies.length);
    int lastIndex = tmp.length - 1;
    tmp[lastIndex] = item;
    movies = tmp;
  }

  public Movie[] getAll() {
    Movie[] result = new Movie[movies.length];
    for (int i = 0; i < result.length; i++) {
      int index = movies.length - i - 1;
      result[i] = movies[index];
    }
    return result;
  }

  public Movie[] getLastAdd() {
    int tmpResultLength = resultLength;
    if (movies.length < tmpResultLength) {
      tmpResultLength = movies.length;
    }

    Movie[] result = new Movie[tmpResultLength];
    for (int i = 0; i < tmpResultLength; i++) {
      int index = movies.length - i - 1;
      result[i] = movies[index];
    }
    return result;
  }
}