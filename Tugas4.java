import java.util.Scanner;

public class Tugas4 {
    public static void main(String args[]){
        Persegi persegi = new Persegi();
        PersegiPanjang persegiPanjang = new PersegiPanjang();
        Segitiga segitiga = new Segitiga();
        Lingkaran lingkaran = new Lingkaran();

        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("==========================================");
            System.out.println("Menghitung luas dan lingkaran bangun datar");
            System.out.println("---------- Bangun Datar ----------");
            System.out.println("1. Persegi \n2. Persegi Panjang \n3. Segitiga \n4. Lingkaran \n5. Exit");

            System.out.print("Pilih menu : ");
            int menu = input.nextInt();
            int menu2;

            switch(menu){
                case 1:
                System.out.println("menu persegi");
                System.out.println("1. Luas \n2. Keliling");
                System.out.print("Mencari luas atau keliling : ");
                menu2 = input.nextInt();
                if(menu2 == 1){
                persegi.luas();
                } else if (menu2 == 2) {
                persegi.keliling();
                } else {
                    System.out.println("pilih antara 1 atau 2");
                }
                break;
                case 2:
                System.out.println("menu persegi panjang");
                System.out.println("1. Luas \n2. Keliling");
                System.out.print("Mencari luas atau keliling : ");
                menu2 = input.nextInt();
                if(menu2 == 1){
                persegiPanjang.luas();
                } else if (menu2 == 2) {
                persegiPanjang.keliling();
                } else {
                    System.out.println("pilih antara 1 atau 2");
                }
                case 3:
                System.out.println("menu segitiga");
                System.out.println("1. Luas \n2. Keliling");
                System.out.print("Mencari luas atau keliling : ");
                menu2 = input.nextInt();
                if(menu2 == 1){
                segitiga.luas();
                } else if (menu2 == 2) {
                segitiga.keliling();
                } else {
                    System.out.println("pilih antara 1 atau 2");
                }
                break;
                case 4:
                System.out.println("menu lingkaran");
                System.out.println("1. Luas \n2. Keliling");
                System.out.print("Mencari luas atau keliling : ");
                menu2 = input.nextInt();
                if(menu2 == 1){
                lingkaran.luas();
                } else if (menu2 == 2) {
                lingkaran.keliling();
                } else {
                    System.out.println("pilih antara 1 atau 2");
                }
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
        
    }

class Persegi implements Rumus{
    @Override
    public void luas(){
        Scanner inputSisi = new Scanner(System.in);
        int sisiPersegi;
        System.out.println("Untuk menghitung keliling persegi, silahkan masukkan sisi persegi:");
        sisiPersegi = inputSisi.nextInt();

        System.out.println("Keliling bangun datar persegi adalah " + 4 * sisiPersegi);
    }

    @Override
    public void keliling(){
        Scanner inputLuas = new Scanner(System.in);
        int sisiPersegi;
        System.out.println("Untuk menghitung luas persegi, silahkan masukkan sisi persegi:");
        sisiPersegi = inputLuas.nextInt();

        System.out.println("Luas bangun datar persegi adalah " + sisiPersegi * sisiPersegi);
    }
}

class PersegiPanjang implements Rumus {
    @Override
    public void luas(){
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

    @Override
    public void keliling(){
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

class Segitiga implements Rumus {
    @Override
    public void luas(){
        Scanner inputSisi = new Scanner(System.in);

        int sisiSegitiga;
        System.out.println("Untuk menghitung keliling segitiga, silahkan masukkan sisi segitiga:");
        sisiSegitiga = inputSisi.nextInt();

        System.out.println("Keliling bangun datar segitiga adalah " + (sisiSegitiga + sisiSegitiga + sisiSegitiga));
    }

    @Override
    public void keliling(){
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

class Lingkaran implements Rumus {
    @Override
    public void luas(){
        Scanner inputJari = new Scanner(System.in);

        int jariLingkaran;
        System.out.println("Untuk menghitung keliling lingkaran, silahkan masukkan jari-jari lingkaran:");
        jariLingkaran = inputJari.nextInt();

        System.out.println("Keliling bangun datar lingkaran adalah " + 2 * Math.PI * jariLingkaran);
    }

    @Override
    public void keliling(){
        Scanner inputJari = new Scanner(System.in);

        int jariLingkaran;
        System.out.println("Untuk menghitung luas lingkaran, silahkan masukkan jari-jari lingkaran:");
        jariLingkaran = inputJari.nextInt();

        System.out.println("Luas bangun datar lingkaran adalah " + Math.PI * jariLingkaran * jariLingkaran);
    }
}

interface Rumus{
    void luas();

    void keliling();
}