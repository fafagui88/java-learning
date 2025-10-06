public class tipeVariabelDemo {
  public static void main(String[] args) {
    System.out.println("--- DEMO TIPE VARIABEL DASAR JAVA ---\n");

    /* no 1:
    ** tipe bilangan bulat (Integer)
    ** int: Tipe data paling umum untuk bilangan bulat (32-bit).
    */ 
    int usia = 28;
    System.out.println("1. Tipe int (Usia): " + usia);

    /*
    ** long: Digunakan untuk bilangan bulat yang sangat besar (64-bit).
    ** Wajib ditambahkan suffix 'L' di akhir angka.
    */ 
    // long populasiDunia = 80000000000L; 
    long populasiDunia = 28L;
    System.out.println("   Tipe long (Populasi Dunia): " + populasiDunia);

    /*
    ** short: Digunakan untuk bilangan bulat yang sangat kecil (16-bit).
    */ 
    short jumlahHari = 365;
    System.out.println("   Tipe short (Jumlah Hari): " + jumlahHari);


    /* no 2:
    ** tipe bilangan pecahan/decimal (Floating Point)
    ** double: Tipe data paling umum untuk desimal, presisi tinggi (64-bit).
    */ 
    double hargaBarang = 119999.99;
    System.out.println("\n2. Tipe double (Harga Barang): " + hargaBarang);

    /*
    ** float: Presisi lebih rendah (32-bit).
    ** Wajib ditambahkan suffix 'f' di akhir angka.
    */ 
    float suhu = 3666666.5f;
    System.out.println("   Tipe float (Suhu Tubuh): " + suhu);


    /* no 3:
    ** tipe text dan character
    ** char: Hanya bisa menampung satu karakter, menggunakan kutip tunggal ('').
    */ 
    char nilaiHuruf = 'A';
    System.out.println("\n3. Tipe char (Nilai Huruf): " + nilaiHuruf);


    /*
    ** String: Digunakan untuk menampung serangkaian karakter (teks), menggunakan kutip ganda ("").
    ** String sebenarnya adalah Class, bukan tipe data primitif.
    */ 
    String namaLengkap = "Rendy Aja lah lorem ipsum dolor sit amet";
    System.out.println("   Tipe String (Nama Lengkap): " + namaLengkap);


    /* no 4:
    ** tipe logika untuk (Boolean)
    ** boolean: Hanya bisa bernilai true (benar) atau false (salah).
    */ 
    boolean isLulus = true;
    boolean isGagal = false;
    System.out.println("\n4. Tipe boolean (Status Lulus): " + isLulus);
    System.out.println("   Tipe boolean (Status Gagal): " + isGagal);


    /* no 5:
    ** TIPE OBJECT (General Class)
    ** Object: Adalah superclass dari semua class di Java. Semua yang bukan primitif adalah Object.
    ** Array, String, dan class buatan Anda sendiri adalah turunan dari Object.
    */
    Object dataCampuran;
    // Object yang bisa menampung nilai String
    dataCampuran = 99.8; 
    System.out.println("\n5. Tipe Object (Contoh Teks): " + dataCampuran);
    
    // Object ini juga bisa menampung nilai Integer
    dataCampuran = 12345;            
    System.out.println("   Tipe Object (Contoh Angka): " + dataCampuran);
  }
}