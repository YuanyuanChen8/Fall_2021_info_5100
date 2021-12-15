package com.company;


import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Q4 {

    //1.
    public class Movie {
        private int title;
        private Date date;
        private String actors;
        private String Director;

        public Movie(int title, Date date, String actors, String Director) {
            this.title = title;
            this.date = date;
            this.actors = actors;
            this.Director = Director;
        }
    }


    //2.
    public static void addClassic(List<Movie> movieList) {
        Date date1 = new GregorianCalendar(2000, Calendar.FEBRUARY, 1).getTime();
        List<Movie> newList = movieList.stream().filter(e -> e.date.before(date1)).flatMap(e -> Stream.of(new Movie(e.title + "Classic", e.date, e.actors, e.Director))).collect(Collectors.toList());
        newList.forEach(e -> {
            System.out.println(e.title);
        });

    }
}


