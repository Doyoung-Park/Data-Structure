import java.util.Scanner;
// 18238번
public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String line = scanner.nextLine();
		
		int diff=26-Math.abs('A'-line.charAt(0));
		
		int total =0;
		
			if(diff>13)
				total+=26-diff;
			else
				total+=diff;
		
		for(int i=0; i<line.length()-1; i++) {
			
			diff = Math.abs(line.charAt(i) - line.charAt(i+1));
		
			if(diff>13)
				total += 26 - diff;
			else
				total += diff;
			
			}
		
		System.out.println(total);
			
		scanner.close();
		}

}
