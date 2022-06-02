public class Tugas1 {
    public static void main(String args[]){
        // int a = 1;
        for(int a = 1; a<50; a++){
            if (a % 3 == 0){
                System.out.println("n habis dibagi 3");
            } else if (a % 5 == 0){
                System.out.println("n habis dibagi 5");
            } else {
                System.out.println(a);
            }
        }
    }
}