package switchCase;

public class test {

	public static void main(String[] args) {
		
		
		System.out.println("Q1");
        int max = 5;
        for (int n = 1; n <= max; n++) {
            System.out.println(n);
        }
        System.out.println();
        
		System.out.println("Exercise 1");
		int maxis=5;
		int n=1;
		while (n<=maxis) {
			System.out.println(n);
			n=n+1;
		}
		System.out.println();
		
		System.out.println("Q2");
        int total = 25;
        for (int counter = 1; counter <= (total / 2); counter++) {
            total = total - counter;
            System.out.println(total + " " + counter);
        }
        System.out.println();
        
		System.out.println("Exercise 2");
		int sum = 25;
		int nom=1;
		while (nom <= (sum/2)) {
			sum = sum-nom;
			System.out.println(sum + " " + nom);
			nom=nom+1;
		}
		System.out.println();
	
		System.out.println("Q3");
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                for (int k = 1; k <= 4; k++) {
                    System.out.print("*");
                }
                System.out.print("!");
            }
            System.out.println();
        }
        System.out.println();
        
        
		System.out.println("Exercise 3");
		int i=1;
		while (i <= 2) {
			int j=1;
			while(j <= 3) {
				int k=1;
				while(k <= 4) {
					System.out.print("*");
					k=k+1;
				}
				System.out.print("!");
				j=j+1;
			}
			System.out.println();
			i=i+1;
		}
		System.out.println();
		
		
		System.out.println("Q4");
        int number = 4;
        for (int count = 1; count <= number; count++) {
            System.out.println(number);
            number = number / 2;
        }
        System.out.println();
        
		System.out.println("Exercise 4");
		int num=4;
		int count=1;
		while (count <= num) {
			System.out.println(num);
			num=  num / 2;
			count=count+1;
				
			}
		}
	}