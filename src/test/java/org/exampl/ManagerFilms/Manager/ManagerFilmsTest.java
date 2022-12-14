package org.exampl.ManagerFilms.Manager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ManagerFilmsTest {

    @Test

    public void addThreeFilms() {
        ManagerFilms managerFilms = new ManagerFilms();

        managerFilms.addMovie("film 1");
        managerFilms.addMovie("film 2");
        managerFilms.addMovie("film 3");

        String[] expected = {"film 1", "film 2", "film 3"};
        String[] actual = managerFilms.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void addOneFilm() {
        ManagerFilms managerFilms = new ManagerFilms();

        managerFilms.addMovie("film 4");

        String[] expected = {"film 4"};
        String[] actual = managerFilms.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void notAddFilm() {
        ManagerFilms managerFilms = new ManagerFilms();

        String[] expected = {};
        String[] actual = managerFilms.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void LastLimitFilms() {
        ManagerFilms managerFilms = new ManagerFilms();
        managerFilms.addMovie("Film 1");
        managerFilms.addMovie("Film 2");
        managerFilms.addMovie("Film 3");
        managerFilms.addMovie("Film 4");
        managerFilms.addMovie("Film 5");
        managerFilms.addMovie("Film 6");
        managerFilms.addMovie("Film 7");
        managerFilms.addMovie("Film 8");
        managerFilms.addMovie("Film 9");
        managerFilms.addMovie("Film 10");
        managerFilms.addMovie("Film 11");


        String[] actual = managerFilms.findLast();
        String[] expected = {"Film 11", "Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5" ,"Film 4" ,"Film 3", "Film 2"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addLastFilms() {
        ManagerFilms managerFilms = new ManagerFilms();

        managerFilms.addMovie("Film 3");
        managerFilms.addMovie("Film 4");
        managerFilms.addMovie("Film 5");
        managerFilms.addMovie("Film 6");
        managerFilms.addMovie("Film 7");
        managerFilms.addMovie("Film 8");



        String[] actual = managerFilms.findLast();
        String[] expected = {"Film 8", "Film 7", "Film 6", "Film 5" ,"Film 4" ,"Film 3"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void notAddFilmFindLast() {
        ManagerFilms managerFilms = new ManagerFilms();

        String[] expected = {};
        String[] actual = managerFilms.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void findLastThreeFilms() {
        ManagerFilms managerFilms = new ManagerFilms(3);
        managerFilms.addMovie("Film 1");
        managerFilms.addMovie("Film 2");
        managerFilms.addMovie("Film 3");
        managerFilms.addMovie("Film 4");
        managerFilms.addMovie("Film 5");
        managerFilms.addMovie("Film 6");
        managerFilms.addMovie("Film 7");
        managerFilms.addMovie("Film 8");
        managerFilms.addMovie("Film 9");
        managerFilms.addMovie("Film 10");


        String[] actual = managerFilms.findLast();
        String[] expected = {"Film 10", "Film 9", "Film 8"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void findLastZeroFilms() {
        ManagerFilms managerFilms = new ManagerFilms(0);
        managerFilms.addMovie("Film 1");
        managerFilms.addMovie("Film 2");
        managerFilms.addMovie("Film 3");
        managerFilms.addMovie("Film 4");
        managerFilms.addMovie("Film 5");
        managerFilms.addMovie("Film 6");
        managerFilms.addMovie("Film 7");
        managerFilms.addMovie("Film 8");
        managerFilms.addMovie("Film 9");
        managerFilms.addMovie("Film 10");


        String[] actual = managerFilms.findLast();
        String[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void findLastElevenFilms() {
        ManagerFilms managerFilms = new ManagerFilms(11);
        managerFilms.addMovie("Film 1");
        managerFilms.addMovie("Film 2");
        managerFilms.addMovie("Film 3");
        managerFilms.addMovie("Film 4");
        managerFilms.addMovie("Film 5");
        managerFilms.addMovie("Film 6");
        managerFilms.addMovie("Film 7");
        managerFilms.addMovie("Film 8");
        managerFilms.addMovie("Film 9");
        managerFilms.addMovie("Film 10");


        String[] actual = managerFilms.findLast();
        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5" ,"Film 4" ,"Film 3", "Film 2","Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void findLastTenFilms() {
        ManagerFilms managerFilms = new ManagerFilms(10);
        managerFilms.addMovie("Film 1");
        managerFilms.addMovie("Film 2");
        managerFilms.addMovie("Film 3");
        managerFilms.addMovie("Film 4");
        managerFilms.addMovie("Film 5");
        managerFilms.addMovie("Film 6");
        managerFilms.addMovie("Film 7");
        managerFilms.addMovie("Film 8");
        managerFilms.addMovie("Film 9");
        managerFilms.addMovie("Film 10");


        String[] actual = managerFilms.findLast();
        String[] expected = {"Film 10", "Film 9", "Film 8", "Film 7", "Film 6", "Film 5" ,"Film 4" ,"Film 3", "Film 2","Film 1"};

        Assertions.assertArrayEquals(expected, actual);
    }
}
