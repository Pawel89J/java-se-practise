package com.streams_practice;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FilmMethods {

    public static List<Film> filmDuration(List<Film> watchlist, int duration) {

        return watchlist
                .stream()
                .filter(d -> d.getDuration() > duration)
                .collect(Collectors.toList());
    }

    public static List<String> titleInUpperCase(List<Film> watchlist) {

        return watchlist
                .stream()
                .map(t -> t.getTitle().toUpperCase())
                .collect(Collectors.toList());
    }

    public static List<Film> filmByImdbAndGenre(List<Film> watchlist, String genre, double imdbRate){

        return watchlist
                .stream()
                .filter(r -> r.getGenre() == genre && r.getImdbRate() < imdbRate)
                .collect(Collectors.toList());
    }

    public static List<Film> filmByGenre(List<Film> watchlist, String genre) {

        return watchlist
                .stream()
                .filter(g -> g.getGenre() == genre)
                .limit(1)
                .collect(Collectors.toList());
    }

    public static List<Film> imdbRatesSortedInDescendingOrder(List<Film> watchlist){

        return watchlist
                .stream()
                .sorted(Comparator.comparingDouble(Film::getImdbRate).reversed())
                .collect(Collectors.toList());
    }

    public static List<Film> top3FilmSortedByImdb(List<Film> watchlist){

        return watchlist
                .stream()
                .sorted(Comparator.comparingDouble(Film::getImdbRate).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    public static int totalWatchlistDuration(List<Film> watchlist){

        return watchlist
                .stream()
                .mapToInt(Film::getDuration)
                .sum();
    }

    public static List<Film> longestFilm(List<Film> watchlist) {

        return watchlist
                .stream()
                .sorted(Comparator.comparingInt(Film::getDuration).reversed())
                .limit(1)
                .collect(Collectors.toList());
    }

    public static boolean satisfiesCriteria(List<Film> watchlist,String title,String keyword) {
        return watchlist
                .stream()
                .anyMatch(s -> s.getTitle().contains(title) && s.getSearchKeywords().contains(keyword));
    }

    public static List<Film> commonSearchKeyword(List<Film> watchlist, String keyword) {
        return watchlist
                .stream()
                .filter(k -> k.getSearchKeywords().contains(keyword))
                .collect(Collectors.toList());
    }
}
