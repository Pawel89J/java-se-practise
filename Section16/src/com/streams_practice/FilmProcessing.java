package com.streams_practice;

import java.util.*;
import java.util.stream.Collectors;

public class FilmProcessing {

    public static void main(String[] args) {

        Film theDarkKnight = new Film("The Dark Knight",152,9.0,"Action",List.of("2008","Nolan","Batman"));
        Film sadak2 = new Film("Sadak 2",133,1.1,"Action",List.of("2020","Bhatt","Journey"));
        Film parasite = new Film("Parasite",132,8.6,"Comedy",List.of("2019","Ho","Family"));
        Film cumaliCeber = new Film("Cumali Ceber",100,1.0,"Comedy",List.of("2017","Gok","Vacation"));
        Film theShawshankRedemption = new Film("The Shawshank Redemption",142,9.3,"Drama",List.of("1994","Darabont","Prison"));
        Film smolensk = new Film("Smolensk",120,1.1,"Drama",List.of("2016","Krauze","Air Crash"));
        Film whiplash = new Film("Whiplash",106,8.5,"Music",List.of("2014","Chazelle","Drummer"));
        Film spiceWorld = new Film("Spice World",93,3.5,"Music",List.of("1997","Spiers","Spice Girls"));
        Film inception = new Film("Inception",148,8.8,"Thriller",List.of("2010","Nolan","Thief"));
        Film radhe = new Film("Radhe", 135,1.8,"Thriller",List.of("2021","Deva","Syndicate"));
        Film forrestGump = new Film("Forrest Gump",142,8.8,"Romance",List.of("1994","Zemeckis","IQ"));
        Film theHottieAndTheNottie = new Film("The Hottie & the Nottie",91,1.9,"Romance",List.of("2008","Putnam","Date"));
        Film psycho = new Film("Psycho",109,8.5,"Horror",List.of("1960","Hitchcock","Motel"));
        Film manos = new Film("Manos: The Hands of Fate",70,1.8,"Horror",List.of("1966","Warren","Lost"));
        Film goodBadUgly = new Film("The Good, the Bad and the Ugly", 178,8.8,"Western",List.of("1966","Leone","Gold"));

        List<Film> watchlist = Arrays.asList(theDarkKnight,sadak2,parasite,cumaliCeber,theShawshankRedemption,smolensk
        ,whiplash,spiceWorld,inception,radhe,forrestGump,theHottieAndTheNottie,psycho,manos,goodBadUgly);

        System.out.println("A - Filter films with a duration greater than the specified value:\n"
        + FilmMethods.filmDuration(watchlist,120));
        System.out.println("=========================================================================================");
        System.out.println("B - Return list of film titles in UPPER CASE:\n"
        + FilmMethods.titleInUpperCase(watchlist));
        System.out.println("=========================================================================================");
        System.out.println("C - Filter all films of a particular genre and with IMDb rate lower than the specified value\n"
        + FilmMethods.filmByImdbAndGenre(watchlist,"Horror",2.0));
        System.out.println("=========================================================================================");
        System.out.println("D - Find the first film of a particular genre:\n"
        + FilmMethods.filmByGenre(watchlist,"Thriller"));
        System.out.println("=========================================================================================");
        System.out.println("E - Return a list of IMDb rates sorted in descending order:\n"
        + FilmMethods.imdbRatesSortedInDescendingOrder(watchlist));
        System.out.println("=========================================================================================");
        System.out.println("F - Return top-3 films sorted by IMDb rate:\n"
        + FilmMethods.top3FilmSortedByImdb(watchlist));
        System.out.println("=========================================================================================");
        System.out.println("G - Return a total watch list duration:\n"
        + FilmMethods.totalWatchlistDuration(watchlist));
        System.out.println("=========================================================================================");
        System.out.println("H - Return the longest film in a list:\n"
        + FilmMethods.longestFilm(watchlist));
        System.out.println("=========================================================================================");
        System.out.println("I - Return true if any of the films in a watch list satisfies criteria:\n"
        + FilmMethods.satisfiesCriteria(watchlist,"Forrest Gump","1995"));
        System.out.println("=========================================================================================");
        System.out.println("J - Return list of films with a common search keyword:\n"
        + FilmMethods.commonSearchKeyword(watchlist,"Family"));

    }
}
