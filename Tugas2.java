public class Tugas2 {
    public static void main(String args[]){
        for(int x = 1; x<=20; x++){
            int prima = 0;
            for(int y=1; y<=x; y++){
                if (x % y == 0){
                    prima += 1;
                }
            }
            if (prima == 2){
                System.out.println(x + " bilangan prima");
            } else {
                System.out.println(x + " bukan bilangan prima");
            }
        }
    }
}