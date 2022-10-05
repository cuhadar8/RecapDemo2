
public class Main {
	public static void main(String[] args) {
		
		double[] myList = {1.2,1.3,2.5,5.6};
		
		double toplam = 0;
		double max = myList[0];
		
		for(double number : myList) {
			
			if(max < number) {
				max = number;
			}
			toplam += number;
			System.out.println(number);
		}
		
		
		System.out.println("Dizinin en büyük sayısı = " + max);
		System.out.println("Dizinin toplamı = " + toplam);
	}

}
