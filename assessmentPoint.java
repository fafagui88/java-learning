public class assessmentPoint {
  public static void main(String[] args) {

    String teksAngka = args[0];
    int angka = Integer.parseInt(teksAngka); 

    System.out.println("Ini Adalah nilai String menjadi integer: " + angka);

    if (args.length == 0 || Integer.parseInt(args[0]) == 0) {
      System.out.println("Mohon diinput nilai, dan tidak boleh kosong!!");
      return;
    }

    int number;
    try {
        number = Integer.parseInt(args[0]); 
    } catch (NumberFormatException e) {
        System.out.println("ERROR: Parameter yang dimasukkan harus berupa angka.");
        return;
    }

    System.out.println("Nilai yang diinput: " + number); 

    if (number == 70) {
      System.out.println("Nilai yang di input sesuai dengan penilaian, Namun Harus ditingkatkan!!");
    } else if(number > 70) {
      System.out.println("Nilai yang di input sangat bagus melebihi kriteria penilaian!");
    } else if (number < 70) {
      System.out.println("Nilai yang di input tidak sesuai dengan penilaian");
    } else {
      System.out.println("Mohon input nilai agar bisa memenuhi persyaratan!!!!");
    }

  }

}