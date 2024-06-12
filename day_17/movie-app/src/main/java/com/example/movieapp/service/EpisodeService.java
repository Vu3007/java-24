package com.example.movieapp.service;

import com.example.movieapp.entity.Episode;
import com.example.movieapp.repository.EpisodeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EpisodeService {
    private final EpisodeRepository episodeRepository;

    public List<Episode> getEpisodeListOfMovie(Integer movieId) {
        return episodeRepository.findByMovie_IdAndStatusOrderByDisplayOrderAsc(movieId, true);
    }
<<<<<<< HEAD
    public Episode getEpisodeByDisplayOrder(Integer movieId,String tap){
       Integer convertTap=tap.equals("full")?1:Integer.parseInt(tap);
       return episodeRepository.findByMovie_IdAndStatusAndDisplayOrder(movieId,true,convertTap).orElse(null);
    }
}
=======

    public Episode getEpisodeByDisplayOrder(Integer movieId, String tap) {
        Integer covertTap = tap.equals("full") ? 1 : Integer.parseInt(tap);
        return episodeRepository
                .findByMovie_IdAndStatusAndDisplayOrder(movieId, true, covertTap)
                .orElse(null);
    }
}
>>>>>>> f26bf26f2b3ddaf48ba9fdfef84ec05492b9ebee
