package com.infoshareacademy.SredniaOcen;

import java.util.Scanner;

public class Main {

    private int liczbaPrzedmiotow;
    private int liczbaOcen;
    private int[][] oceny;

    public Main(int liczbaPrzedmiotow, int liczbaOcen) {
        this.liczbaPrzedmiotow = liczbaPrzedmiotow;
        this.liczbaOcen = liczbaOcen;
        initializeOceny();
    }
    private void initializeOceny(){
        oceny = new int[liczbaPrzedmiotow][];
        for (int nrPrzedmiotu = 0; nrPrzedmiotu < oceny.length ; nrPrzedmiotu++) {
            oceny[nrPrzedmiotu] = new int[liczbaPrzedmiotow];
        }
    }
    public void getOcenyOdUcznia(){
        Scanner scanner = new Scanner(System.in);
        for (int nrPrzedmiotu = 0; nrPrzedmiotu < liczbaPrzedmiotow ; nrPrzedmiotu++) {
            for (int nrOceny = 0; nrOceny < liczbaOcen ; nrOceny++) {
                System.out.println("Podaj ocenę numer "+ (nrOceny + 1) + " dla przedmiotu numer "+ (nrPrzedmiotu+1)+": ");
                oceny[nrPrzedmiotu][nrOceny]= scanner.nextInt();
            }

        }
    }

    public void podajSrednia(){
        double calkowitaSrednia = 0;
        for (int nrPrzedmiotu = 0; nrPrzedmiotu < liczbaPrzedmiotow; nrPrzedmiotu++) {
            double sredniaPrzedmiotow = 0;
            for (int ocena : oceny[nrPrzedmiotu] ) {
                sredniaPrzedmiotow += ocena;
            }

            sredniaPrzedmiotow/= liczbaPrzedmiotow;
            System.out.println("średnia dla przedmiotu numer "+ (nrPrzedmiotu+1)+ " wynosi "+ sredniaPrzedmiotow);
            calkowitaSrednia += sredniaPrzedmiotow;
        }

        calkowitaSrednia /= liczbaPrzedmiotow;
        System.out.println("średnia dla wszystkich przedmiotow wynosi : "+ calkowitaSrednia);
    }



    public static void main(String[] args) {
        int liczbaPrzedmiotow = 3;
        int liczbaOcen = 4;
        Main main = new Main(liczbaPrzedmiotow,liczbaOcen);
        main.getOcenyOdUcznia();
        main.podajSrednia();

    }
}

