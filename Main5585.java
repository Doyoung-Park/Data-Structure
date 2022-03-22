import java.util.Scanner;

// 백준 5585번
public class Main5585 {	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int price = scanner.nextInt();
		int[] coin= {500,100,50,10,5,1};
		
		int remain = 1000-price;
		int cnt=0;
		
		int n=0;
		
		for(int i=0; i<coin.length; i++) {
			if(remain>=coin[i]) {
				n=remain/coin[i];
				cnt+=n;
				remain-=(coin[i]*n);
			
			}
			if(remain==0)
				break;
		}
		
		System.out.print(cnt);
		scanner.close();
		
	}
	
}

