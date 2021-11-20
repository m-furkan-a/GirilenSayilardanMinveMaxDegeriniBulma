import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);

	    System.out.print("Kaç tane sayı Gireceksiniz : ");
	    int n = input.nextInt();
	    int eb=0,ek=0,sayi=0;

	    for (int i = 1; i <= n ; i++){
	        System.out.print(i + ". Sayi : ");
	        sayi = input.nextInt();

			if (i==1) {
				eb = sayi;
				ek = sayi;
			}
			if (sayi > eb)
				eb  =   sayi;

			if (sayi < ek)
				ek  =   sayi;
        }
		System.out.println("En Büyük Sayı : " + eb +"\nEn Küçük Sayı : " + ek);
    }
}
