/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarfilm;

/**
 *
 * @author Muhammad Ihsan
 * Nama : Muhammad Ihsan
 * Nim   : 10118037
 * Kelas : IF-1 2018
 * Deskripsi program : Program ini menampilkan film yang akan diputar
 */
public class DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Film film = new Film();
       
       //output
        System.out.println("=====Daftar Film Sedang Tayang=====\n");
        
        //venom
        film.filmName = "Venom";
        film.filmGenre = "Action, Horor, SciFi";
        film.filmRating = 8.5;
        film.filmDuration = 120;
        film.nowPlaying();
        
        //Smallfoot
        film.filmName = "Smallfoot";
        film.filmGenre = "Animation";
        film.filmRating = 9.0;
        film.filmDuration = 96;
        film.nowPlaying();
        
        //Crazy Rich Asian
        film.filmName = "Crazy Rich Asian";
        film.filmGenre = "Comedy";
        film.filmRating = 7.8;
        film.filmDuration = 119;
        film.nowPlaying();
        
        //Asih
        film.filmName = "Asih";
        film.filmGenre = "Horor";
        film.filmRating = 6.0;
        film.filmDuration = 100;
        film.nowPlaying();
        
        
        
        
    }
    
}
