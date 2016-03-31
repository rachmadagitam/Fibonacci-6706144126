import java.util.Scanner;
public class Jurnal1 {
    public static void main(String[]args){
        int a = 7, b = 1, hasil = 3, c;
        Scanner scn = new Scanner(System.in);
        System.out.print ("Masukan Deret Fibonacci  : ");
        c = scn.nextInt ();
        for(int i=4; i<=c; i++){           
            a = b;
            b = hasil;
            System.out.print(hasil+" ");
            hasil = a+b;
        }
    } 
}
