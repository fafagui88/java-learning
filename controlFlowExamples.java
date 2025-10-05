public class controlFlowExamples {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("ERROR: Mohon masukkan angka bulan sebagai parameter. Contoh: java ControlFlowExamples 3");
      return;
    }

    int bulan;
    try {
        bulan = Integer.parseInt(args[0]);
    } catch (NumberFormatException e) {
        System.out.println("ERROR: Input harus berupa angka.");
        return;
    }
    
    System.out.println("-------------------------------------------------");
    System.out.println("cth dari control flow di java");
    System.out.println("-------------------------------------------------");


    System.out.println("\n--- demo: switch case { berdasarkan bulan yang  diinput } ---");
    
    /*
    ** cth: switch case
    */ 
    String namaBulan = switch (bulan) {
      case 1 -> "Januari";
      case 2 -> "Februari";
      case 3 -> "Maret";
      case 4 -> "April";
      default -> "Bulan Lain (di luar kasus 1-4)";
    };

    System.out.println("Bulan ke-" + bulan + " adalah: " + namaBulan);

    System.out.println("\n--- demo: for loop { pengulangan } ---");
    /*
    ** cth: for
    */ 
    for (int i = 0; i < 3; i++) {
      System.out.println("For Loop: Iterasi ke-" + (i + 1));
    }

    System.out.println("\n--- demo: while loop { Cek dari kondisi di awal } ---");
    
    /*
    ** cth: While loop
    */ 
    int hitungWhile = 0;
    while (hitungWhile < 3) {
        System.out.println("While Loop: Nilai saat ini = " + hitungWhile);
        hitungWhile++;
    }

    System.out.println("\n--- DEMO: DO-WHILE LOOP (Jalankan Dulu, Cek Kemudian) ---");
    
    /*
    ** cth: While loop
    ** do { kode } while (kondisi) 
    */ 
    int hitungDoWhile = 0;
    do {
        System.out.println("Do-While Loop: Nilai saat ini = " + hitungDoWhile);
        hitungDoWhile++; 
    } while (hitungDoWhile < 3);
  }
}