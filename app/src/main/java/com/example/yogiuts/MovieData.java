package com.example.yogiuts;

import java.util.ArrayList;
import java.util.List;

public class MovieData {
    public static List<Movie> getMovieList(){

        Movie movie1 = new Movie("RSUPN Dr. Cipto Mangunkusumo (2013)", "Nama rumah sakit ini diambil dari nama tokoh perjuangan Indonesia pada masa penjajahan yaitu Dr. Tjipto Mangoenkoesoemo.", "https://cdn02.indozone.id/local/5d416fb02ec6c.jpg", "+62211500135", "4,0");
        Movie movie2 = new Movie("Rumah Sakit Pondok Indah (1986)", "Ada sekitar 250 dokter spesialis, subspesialis, dan dokter umum.", "https://cdn02.indozone.id/local/5d416f881b6e3.jpg", "+62217657525", "4,1");
        Movie movie3 = new Movie("Rumah Sakit Umum Pusat Fatmawati (1962)", "Nama rumah sakit diambil dari nama mantan ibu negara yaitu Fatmawati Soekarno, Ruangan untuk rawat inap tersedia hingga 536 dan memiliki pelayanan dokter spesialis, subspesialis, dan tenaga kesehatan lainnya.", "https://cdn02.indozone.id/local/5d416f3402999.jpg", "+62217501524", "3,2");
        Movie movie4 = new Movie("Jakarta Eye Center Kedoya (1984)", "Beberapa penghargaan dan akreditasi internasional sudah pernah diraih JEC.", "https://cdn02.indozone.id/local/5d416f5a327c2.jpg", "+628041221000", "4,1");
        Movie movie5 = new Movie("RSPAD Gatot Soebroto (1942)", "Rumah Sakit Pusat Angkatan Darat (RSPAD) Gatot Soebroto merupakan rumah sakit yang berada di bawah naungan Komando Direktorat Kesehatan Angkatan Darat.", "https://lh5.googleusercontent.com/p/AF1QipPDjZfPfVNpjGi02TvCDVahnrqr5Ht8WXSOQfkY=w426-h240-k-no", "+62213840702", "4,2");
        Movie movie6 = new Movie("RSUD Tulungagung (1917)", "Beberapa layanan unggulan RSUD Tulungagung di antaranya, Si Poetri (sistem pendaftaran online tanpa antre), Si Tole (sistem pendaftaran tutol dewe), serta TEMS (Tulungagung Emergency Medical Service).","https://lh5.googleusercontent.com/p/AF1QipNMHQ2ffwD73-0_ANN_ZHjZauhoWleCbnneEDhe=w408-h270-k-no", "+62355322609", "3,8");
        Movie movie7 = new Movie("Santosa Hospital Bandung Central (2006)", "Rumah sakit terakreditasi internasional ini terdiri dari 9 lantai dan 2 basement untuk parkir. Dengan kapasitas 400 tempat tidur operasional, rumah sakit swasta ini menawarkan layanan Unit Gawat Darurat (UGD) 24 jam.", "https://cdn02.indozone.id/local/5dd2673a64c19.jpg", "+62224248333", "3,5");
        Movie movie8 = new Movie("Bali International Medical Center (BIMC) (2012)", "Salah satu keistimewaan rumah sakit ini adalah para tenaga medis yang memahami banyak bahasa. Sehingga, tidak menjadi kendala untuk melayani wisatawan luar negeri yang butuh perawatan medis.", "https://cdn02.indozone.id/local/5dd26783c0eef.jpg", "+62361761263", "3,5");
        Movie movie9 = new Movie("RS Umum Dr. Sardjito (1974)", "RS Umum Dr. Sardjito termasuk yang terbesar di Yogyakarta. Tersedia 813 tempat tidur di berbagai jenis kamar rumah sakit ini, mulai dari kelas III sampai Suite Room.", "https://cdn02.indozone.id/local/5dd2681fc9925.jpg", "+62274631190", "4,0");
        Movie movie10 = new Movie("RS Premier Jatinegara (1989)", "Dulunya, rumah sakit ini bernama RS Mitra Internasional. Sejak 12 Agustus 2010, rumah sakit swasta milik PT Affinity Health Indonesia ini berganti nama menjadi RS Premier Jatinegara.", "https://cdn02.indozone.id/local/5dd268ecd1fc0.jpg", "+62211500908", "3,6");

        List<Movie> list = new ArrayList<>();
        list.add(movie1);
        list.add(movie2);
        list.add(movie3);
        list.add(movie4);
        list.add(movie5);
        list.add(movie6);
        list.add(movie7);
        list.add(movie8);
        list.add(movie9);
        list.add(movie10);
        return list;
    }
}


