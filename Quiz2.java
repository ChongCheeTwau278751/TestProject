
public class Quiz2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Q1.
				System.out.println("1.");
				int max=5,n=1;
				while(n<=max) {
					System.out.println(n);
					n++;
				}
				System.out.println();
			
				
				// Q2.
				System.out.println("2.");
				int total = 25, number=1;
				while(number<=(total/2)) {
					total=total-number;
					System.out.println(total+ " " +number);
					number++;
				}
				System.out.println();
				
				
				// Q3.
				System.out.println("3.");
				int i=1;
				while(i<=2) {
					int j=1;
					while(j<=3) {
						int k=1;
						while(k<=4) {
							System.out.print("*");
							++k;
						}
						System.out.print("!");
						++j;
					}
					System.out.println();
					++i;
				}
				System.out.println();
				
				
				// Q4.
				System.out.println("4.");
				int numbers = 4;
				int count=1;
				while(count<=numbers) {
					System.out.println(numbers);
					numbers=numbers/2;
					count++;
				}
			}
		
	}


