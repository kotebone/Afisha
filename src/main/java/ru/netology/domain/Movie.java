package ru.netology.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Movie {

  private int id;
  private String movieName;
  private String movieGenre;

  public Movie(int id, String movieName, String movieGenre) {
    this.id = id;
    this.movieName = movieName;
    this.movieGenre = movieGenre;
  }
}