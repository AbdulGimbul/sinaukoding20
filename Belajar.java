import java.util.Scanner;

public class Belajar {
    public static void main(String args[]){
        Persegi persegi = new Persegi();
        persegi.keliling();
        persegi.luas();
        
    }
}

class Persegi implements InterfaceClass{
    @Override
    public void luas(){
        System.out.println("Luas persegi adalah s * s")
    }

    @Override
    public void keliling(){
        System.out.println("Keliling persegi adalah 4 * s")
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

public interface InterfaceClass{
    void luas();

    void keliling();
}

abstract class AbstractClass {
    void contoh(){
        System.out.println();
    }

    void luas();

    void keliling();
}