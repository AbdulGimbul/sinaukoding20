import java.util.Scanner;

public class Tugas4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Menghitung luas dan lingkaran bangun datar");
            System.out.println("---------- Bangun Datar ----------");
            System.out.println("1. Persegi \n2. Persegi Panjang \n3. Segitiga \n4. Lingkaran \n5. Exit");

            System.out.print("Pilih menu : ");
            int menu = input.nextInt();

            switch(menu){
                case 1:
                System.out.println("menu persegi");
                break;
                case 2:
                System.out.println("menu persegi panjang");
                break;
                case 3:
                System.out.println("menu segitia");
                break;
                case 4:
                System.out.println("menu lingkaran");
                break;
                case 5:
                System.exit(0);
                break;
                default:
                System.out.println("Pilih menu!!");
                break;
            }
            System.out.println("1. Luas \n2. Keliling");
            System.out.print("Mencari luas atau keliling : ");

            int menu2 = input.nextInt();
            switch(menu2){
                case 1:
                System.out.println("lsdsd");
                break;
                case 2:
                System.out.println("sdsfh");
            }
        }
        
    }
}

class Persegi implements InterfaceClass{
    @Override
    public void luas(){
        System.out.println("Luas persegi adalah s * s");
    }

    @Override
    public void keliling(){
        System.out.println("Keliling persegi adalah 4 * s");
    }
}

class PersegiPanjang extends AbstractClass{
    @Override
    public void luas(){
        
    }

    @Override
    public void keliling(){
        
    }
}

interface InterfaceClass{
    void luas();

    void keliling();
}

abstract class AbstractClass {
    void contoh(){
        System.out.println();
    }

    void luas(){};

    void keliling(){};
}