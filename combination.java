import java.util.Scanner;

public class combination {
    public static void main(String[] args) {
        int n,r;
        int totaln=1, totalr=1, totall=1;
        double comb;

        Scanner input = new Scanner(System.in);

        System.out.print("Kombinasyonu alinacak sayiyi giriniz:");
        n= input.nextInt();

        System.out.print("Kacli kombinasyon alinacagini giriniz : ");
        r= input.nextInt();

        for(int i =1 ; i<=n ; i++){

            totaln= totaln * i;

        }

        for (int j =1 ; j<=r; j++){

            totalr=totalr*j;

        }

        for(int k=1; k<=(n-r); k++){

            totall=totall*k;

        }

        comb=totaln/(totalr*totall);

        System.out.println("Kombinasyon = "+comb);


    }
}
