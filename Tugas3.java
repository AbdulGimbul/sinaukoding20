import java.util.Scanner;

public class Tugas3 {
    public static void main(String args[]){
            Scanner input = new Scanner(System.in);
            System.out.println("Menghitung luas dan lingkaran bangun datar");
            System.out.println("---------- Bangun Datar ----------");
            System.out.println("1. Persegi \n2. Persegi Panjang \n3. Segitiga \n4. Lingkaran \n5. Exit");

            System.out.print("Pilih menu : ");
            int menu = input.nextInt();

            switch(menu){
                case 1:
                Persegi persegi = new Persegi();
                persegi.hitungKeliling();
                persegi.hitungLuas();
                break;
                case 2:
                PersegiPanjang persegiPanjang = new PersegiPanjang();
                persegiPanjang.hitungKeliling();
                persegiPanjang.hitungLuas();
                break;
                case 3:
                Segitiga segitiga = new Segitiga();
                segitiga.hitungKeliling();
                segitiga.hitungLuas();
                break;
                case 4:
                Lingkaran lingkaran = new Lingkaran();
                lingkaran.hitungKeliling();
                lingkaran.hitungLuas();
                break;
                case 5:
                System.exit(0);
                break;
                default:
                System.out.println("Pilih menu!!");
                break;
            }
    }
}

class Persegi{

    void hitungKeliling(){
        Scanner inputSisi = new Scanner(System.in);
        int sisiPersegi;
        System.out.println("Untuk menghitung keliling persegi, silahkan masukkan sisi persegi:");
        sisiPersegi = inputSisi.nextInt();

        System.out.println("Keliling bangun datar persegi adalah " + 4 * sisiPersegi);
    }

    void hitungLuas(){
        Scanner inputLuas = new Scanner(System.in);
        int sisiPersegi;
        System.out.println("Untuk menghitung luas persegi, silahkan masukkan sisi persegi:");
        sisiPersegi = inputLuas.nextInt();

        System.out.println("Luas bangun datar persegi adalah " + sisiPersegi * sisiPersegi);
    }
}

class PersegiPanjang{

    void hitungKeliling(){
        Scanner inputPanjang = new Scanner(System.in);
        Scanner inputLebar = new Scanner(System.in);
        int panjangPersegi;
        int lebarPersegi;
        System.out.println("Untuk menghitung keliling persegi panjang, silahkan masukkan panjang persegi:");
        panjangPersegi = inputPanjang.nextInt();
        System.out.println("Kemudian silahkan masukkan lebar persegi:");
        lebarPersegi = inputLebar.nextInt();

        System.out.println("Keliling bangun datar persegi panjang adalah " + 2 * (panjangPersegi + lebarPersegi));
    }

    void hitungLuas(){
        Scanner inputPanjang = new Scanner(System.in);
        Scanner inputLebar = new Scanner(System.in);
        int panjangPersegi;
        int lebarPersegi;
        System.out.println("Untuk menghitung luas persegi panjang, silahkan masukkan panjang persegi:");
        panjangPersegi = inputPanjang.nextInt();
        System.out.println("Kemudian silahkan masukkan lebar persegi:");
        lebarPersegi = inputLebar.nextInt();

        System.out.println("Luas bangun datar persegi panjang adalah " + panjangPersegi * lebarPersegi);
    }
}

class Segitiga{
    void hitungKeliling(){
        Scanner inputSisi = new Scanner(System.in);

        int sisiSegitiga;
        System.out.println("Untuk menghitung keliling segitiga, silahkan masukkan sisi segitiga:");
        sisiSegitiga = inputSisi.nextInt();

        System.out.println("Keliling bangun datar segitiga adalah " + (sisiSegitiga + sisiSegitiga + sisiSegitiga));
    }

    void hitungLuas(){
        Scanner inputTinggi = new Scanner(System.in);
        Scanner inputAlas = new Scanner(System.in);

        int tinggiSegitiga;
        int alasSegitiga;

        System.out.println("Untuk menghitung luas segitiga, silahkan masukkan alas segitiga:");
        alasSegitiga = inputAlas.nextInt();
        System.out.println("Kemudian silahkan masukkan lebar persegi:");
        tinggiSegitiga = inputTinggi.nextInt();

        System.out.println("Luas bangun datar persegi panjang adalah " + alasSegitiga * tinggiSegitiga / 2);
    }
}

class Lingkaran{
    void hitungKeliling(){
        Scanner inputJari = new Scanner(System.in);

        int jariLingkaran;
        System.out.println("Untuk menghitung keliling lingkaran, silahkan masukkan jari-jari lingkaran:");
        jariLingkaran = inputJari.nextInt();

        System.out.println("Keliling bangun datar lingkaran adalah " + 2 * Math.PI * jariLingkaran);
    }

    void hitungLuas(){
        Scanner inputJari = new Scanner(System.in);

        int jariLingkaran;
        System.out.println("Untuk menghitung luas lingkaran, silahkan masukkan jari-jari lingkaran:");
        jariLingkaran = inputJari.nextInt();

        System.out.println("Luas bangun datar lingkaran adalah " + Math.PI * jariLingkaran * jariLingkaran);
    }
}