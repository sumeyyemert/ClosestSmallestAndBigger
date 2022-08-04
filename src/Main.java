import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int[] list = {15,12,788,1,-1,-778,2,0};
        int min = list[0];
        int max = list[0];

        Scanner scan = new Scanner(System.in);
        System.out.println("Dizi : " + Arrays.toString(list));
        System.out.print("Girilen Sayı : ");
        int givenNumber = scan.nextInt();

        Arrays.sort(list);


        for (int i : list) {
            if (i < givenNumber) {
                min = i;
            }

            if (i > givenNumber) {
                max = i;
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en yakın sayı : " + min);
        System.out.println("Girilen sayıdan büyük en yakın sayı : " + max);
    }
}
