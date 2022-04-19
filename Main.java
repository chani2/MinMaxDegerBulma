import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] list = {56,34,1,8,101,-2,-33};
        System.out.println("Sayi giriniz : ");

        Scanner input = new Scanner (System.in);
        int n = input.nextInt();
        Arrays.sort(list);



        int min;
        int max;
        min = n;
        max = n;

        for(int i = 0; i < list.length; i++){
            System.out.println(i);
            if(n < list[i]){
                min = list[i-1];
                max = list[i];
                break;
            }
        }

        System.out.println("Min deger : " + min);
        System.out.println("Max deger : " + max);


    }
}