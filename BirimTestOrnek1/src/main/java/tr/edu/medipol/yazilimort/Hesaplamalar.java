package tr.edu.medipol.yazilimort;

public class Hesaplamalar {
	public static int faktoriyelRec(int n) {
		if(n==1) return 1;
		
		return n*faktoriyelRec(n-1);
	}
	
	public static int faktoriyelDongu(int n) {
		int son =1;
		for(int i =n ;i>1;i--) {
			son *=i;
		}
		return son;
		
	}
	public static int topla (int sayi1, int sayi2)
	{
		return sayi1+sayi2;
	}
	public static int cikar (int sayi1, int sayi2)
	{
		return sayi1-sayi2;
	}
	public static int carp (int sayi1, int sayi2)
	{
		return sayi1*sayi2;
	}
}
