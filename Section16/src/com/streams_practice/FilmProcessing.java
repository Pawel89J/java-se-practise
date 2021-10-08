package com.streams_practice;

import java.util.*;
import java.util.stream.Collectors;

public class FilmProcessing {

    public static void main(String[] args) {

        Film theDarkKnight = new Film("The Dark Knight",152,9.0,"Action");
        Film sadak2 = new Film("Sadak 2",133,1.1,"Action");
        Film parasite = new Film("Parasite",132,8.6,"Comedy");
        Film cumaliCeber = new Film("Cumali Ceber",100,1.0,"Comedy");
        Film theShawshankRedemption = new Film("The Shawshank Redemption",142,9.3,"Drama");
        Film smolensk = new Film("Smolensk",120,1.1,"Drama");
        Film whiplash = new Film("Whiplash",106,8.5,"Music");
        Film spiceWorld = new Film("Spice World",93,3.5,"Music");
        Film inception = new Film("Inception",148,8.8,"Thriller");
        Film radhe = new Film("Radhe", 135,1.8,"Thriller");
        Film forrestGump = new Film("Forrest Gump",142,8.8,"Romance");
        Film theHottieAndTheNottie = new Film("The Hottie & the Nottie",91,1.9,"Romance");
        Film psycho = new Film("Psycho",109,8.5,"Horror");
        Film manos = new Film("Manos: The Hands of Fate",70,1.8,"Horror");
        Film goodBadUgly = new Film("The Good, the Bad and the Ugly", 178,8.8,"Western");

        List<Film> watchlist = Arrays.asList(theDarkKnight,sadak2,parasite,cumaliCeber,theShawshankRedemption,smolensk
        ,whiplash,spiceWorld,inception,radhe,forrestGump,theHottieAndTheNottie,psycho,manos,goodBadUgly);

        System.out.println("A");
        List<Film> filmWithMoreThan120Minutes = watchlist
                .stream()
                .filter(d -> d.getDuration() > 120)
                .collect(Collectors.toList());
        System.out.println(filmWithMoreThan120Minutes);

        System.out.println("B");
        List<String> titleInUpperCase = watchlist
                .stream()
                .map(t -> t.getTitle().toUpperCase())
                .collect(Collectors.toList());
        System.out.println(titleInUpperCase);

        System.out.println("C");
        List<Film> horrorLessThanRate2 = watchlist
                .stream()
                .filter(r -> r.getGenre().startsWith("Horror") && r.getImdbRate() < 2.0)
                .collect(Collectors.toList());
        System.out.println(horrorLessThanRate2);

        System.out.println("D");
        Optional<Film> firstThrillerFilm = watchlist
                .stream()
                .filter(g -> g.getGenre().startsWith("Comedy"))
                .findFirst();
        System.out.println(firstThrillerFilm);

        System.out.println("E");
        List<Film> imdbRatesSortedInDescendingOrder = watchlist
                .stream()
                .sorted(Comparator.comparing(Film::getImdbRate).reversed())
                .collect(Collectors.toList());
        System.out.println(imdbRatesSortedInDescendingOrder);

        System.out.println("F");
        List<Film> top3FilmSortedByImdb = watchlist
                .stream()
                .sorted(Comparator.comparingDouble(Film::getImdbRate).reversed())
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(top3FilmSortedByImdb);

        System.out.println("G");
        Integer totalWatchlistDuration = watchlist
                .stream()
                .map(Film::getDuration)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(totalWatchlistDuration);

        System.out.println("H");
        Film theLongestFilm = watchlist
                .stream()
                .max(Comparator.comparingInt(Film::getDuration))
                .get();
        System.out.println(theLongestFilm);

        System.out.println("I");
        System.out.println("J");
        System.out.println("K");

    }
}
