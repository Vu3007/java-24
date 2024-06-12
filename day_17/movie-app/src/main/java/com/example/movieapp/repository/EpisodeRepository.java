package com.example.movieapp.repository;

import com.example.movieapp.entity.Episode;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EpisodeRepository extends JpaRepository<Episode, Integer> {
<<<<<<< HEAD
    List<Episode> findByMovie_IdAndStatusOrderByDisplayOrderAsc(Integer movieId, boolean b);
    Optional<Episode> findByMovie_IdAndStatusAndDisplayOrder(Integer movieId,Boolean status,Integer displayOrder);
=======
    List<Episode> findByMovie_IdAndStatusOrderByDisplayOrderAsc(Integer movieId, Boolean status);

    Optional<Episode> findByMovie_IdAndStatusAndDisplayOrder(Integer movieId, Boolean status, Integer displayOrder);
>>>>>>> f26bf26f2b3ddaf48ba9fdfef84ec05492b9ebee
}