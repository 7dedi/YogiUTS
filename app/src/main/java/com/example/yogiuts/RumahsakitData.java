package com.example.yogiuts;

import java.util.ArrayList;
import java.util.List;

public class RumahsakitData {
    public static List<Rumahsakit> getListRumahsakit(){
        Rumahsakit rumahsakit1 = new Rumahsakit(R.drawable.ic_hospital, "RSUPN Dr. Cipto Mangunkusumo", -6.196273912253631, 106.84894066249579, "Jl. Pangeran Diponegoro No.71, RW.5, Kenari, Kec. Senen, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10430");
        Rumahsakit rumahsakit2 = new Rumahsakit(R.drawable.ic_hospital, "RS Pondok Indah Bintaro Jaya", -6.271418938273275, 106.69762629427214, "CBD Emerald Blok CE/C, Jl. Boulevard Bintaro Jaya No.1, Parigi, Kec. Pd. Aren, Kota Tangerang Selatan, Banten 15227");
        Rumahsakit rumahsakit3 = new Rumahsakit(R.drawable.ic_hospital, "Rumah Sakit Umum Pusat Fatmawati",-6.294806927594714, 106.79680959058265, "Jl. RS. Fatmawati Raya No.4, RT.4/RW.9, Cilandak Bar., Kec. Cilandak, Kota Jakarta Selatan, Daerah Khusus Ibukota Jakarta 12430");
        Rumahsakit rumahsakit4 = new Rumahsakit(R.drawable.ic_hospital, "Jakarta Eye Center Kedoya", -6.18943923480462, 106.76190713660145, "Jalan Terusan Jl. Arjuna Utara No.1, RT.7/RW.3, Kedoya Sel., Kec. Kb. Jeruk, Kota Jakarta Barat, Daerah Khusus Ibukota Jakarta 11520");
        Rumahsakit rumahsakit5 = new Rumahsakit(R.drawable.ic_hospital, "RSPAD Gatot Soebroto", -6.175983050211281, 106.83813605747594, "Jl. Abdul Rahman Saleh Raya No.24, RT.10/RW.5, Senen, Kec. Senen, Kota Jakarta Pusat, Daerah Khusus Ibukota Jakarta 10410");
        Rumahsakit rumahsakit6 = new Rumahsakit(R.drawable.ic_hospital, "RSUD Tulungagung", -8.054701288410405, 111.91853022128068, "Jl. Dr. Wahidin Sudiro Husodo, Kedung Taman, Kedungwaru, Kec. Kedungwaru, Kabupaten Tulungagung, Jawa Timur 66223");
        Rumahsakit rumahsakit7 = new Rumahsakit(R.drawable.ic_hospital, "Santosa Hospital Bandung Central", -6.915178025352119, 107.60088689427849, "Jl. Kebon Jati No.38, Kb. Jeruk, Kec. Andir, Kota Bandung, Jawa Barat 40181");
        Rumahsakit rumahsakit8 = new Rumahsakit(R.drawable.ic_hospital, "Rumah Sakit BIMC Kuta", -8.710627330009471, 115.24113978569574, "Jl. By Pass Ngurah Rai No.100X, Kuta, Kabupaten Badung, Bali 80361");
        Rumahsakit rumahsakit9 = new Rumahsakit(R.drawable.ic_hospital, "RSUP Dr. Sardjito", -7.768361165510056, 110.37405355380228, "Jl. Kesehatan No.1, Senolowo, Sinduadi, Kec. Mlati, Kabupaten Sleman, Daerah Istimewa Yogyakarta 55281");
        Rumahsakit rumahsakit10 = new Rumahsakit(R.drawable.ic_hospital, "RS Premier Jatinegara", -6.221389582548021, 106.86938918262152, "Jl. Jatinegara Timur No.85-87, RT.10/RW.2, Bali Mester, Kecamatan Jatinegara, Kota Jakarta Timur, Daerah Khusus Ibukota Jakarta 13310");

        List<Rumahsakit> list = new ArrayList<>();
        list.add(rumahsakit1);
        list.add(rumahsakit2);
        list.add(rumahsakit3);
        list.add(rumahsakit4);
        list.add(rumahsakit5);
        list.add(rumahsakit6);
        list.add(rumahsakit7);
        list.add(rumahsakit8);
        list.add(rumahsakit9);
        list.add(rumahsakit10);
        return list;

    };

}
