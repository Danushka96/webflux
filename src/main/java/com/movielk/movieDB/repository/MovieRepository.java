package com.movielk.movieDB.repository;

import com.movielk.movieDB.documents.Movie;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

/**
 * @author danushka
 * 7/6/2020
 */
public interface MovieRepository extends ReactiveMongoRepository<Movie, String> {
}
