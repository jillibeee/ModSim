import java.util.Scanner;
public class MidSquare {

	public static void main(String[] args) {
		
		System.out.println("Enter seed: ");
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		for(int i=0;i<5;i++)
				{
					int sqn = num*num;
					
					System.out.println("Square: " + sqn);
					
					int middle = (sqn % 1000000 / 100);
					System.out.println("MidSquare: " + middle);
					num = middle;
				}
			}
		
		
	}


