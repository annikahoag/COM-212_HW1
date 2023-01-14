import java.util.Scanner;

//main class
public class HelloPrinter{
	public static void main(String [] args){

		//class with printCount methods
		class PrintLoops{
			//instance variables
			int [] nums = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
			int sum;

			//constructor
			public PrintLoops(){
				sum = 0;
			}

			//printCount method with for loop
			public void printCount(int n){
				System.out.println("For Loop: ");

				for (int i=0; i<nums.length; i++){

					if (nums[i] % 2 == 0){
						sum = (nums[i] / 2) + n;
						System.out.print(sum + " ");

					}else if (nums[i] % 3 == 0){
						System.out.print("0" + " ");

					}else{
						System.out.print(nums[i] + " ");
					}
					
				}//close for loop
			}

			//printCount method with while loop
			public void printCountWhile(int n){
				int k=0;
				System.out.println("\nWhile Loop: ");

				while (k<nums.length){

					if (nums[k] % 2 == 0){
						sum = (nums[k] / 2) + n;
						System.out.print(sum + " ");

					}else if (nums[k] % 3 == 0){
						System.out.print("0" + " ");

					}else{
						System.out.print(nums[k] + " ");
					}

					k++;
				}//close while loop
			}

		}//close PrintLoops


		PrintLoops print = new PrintLoops();
		Scanner scn = new Scanner(System.in);
		int num;

		System.out.print("Please enter a number: ");
		num = scn.nextInt();
		print.printCount(num);
		print.printCountWhile(num);

	}//close main
}//close HelloPrinter class