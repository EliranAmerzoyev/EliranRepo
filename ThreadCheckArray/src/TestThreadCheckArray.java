import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class Description of TestThreadCheckArray
 * 
 * @author Eliran Amerzoyev
 * @author Danielle sarusi
 * @version v1.1
 */

/**
 * 
 * @author eliran
 * {@summary} param: args
 * @since 2021
 * {@summary} Description of Main
 *
 */
public class TestThreadCheckArray {
	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in))
		{
			/**Description of threads*/
			Thread thread1, thread2;
			System.out.println("Enter array size");
			/**Description of num*/
			int num = input.nextInt();
			/**Description of array*/
			ArrayList<Integer> array = new ArrayList<>();
			System.out.println("Enter numbers for array");

			/**
			 * Loop to enter all the values from user.
			 */
			for (int index = 0; index < num; index++)
				array.add(input.nextInt());

			System.out.println("Enter number");
			// Number that we want to check/
			num = input.nextInt();

			SharedData sd = new SharedData(array, num);

			/**
			 * Create 2 threads to check values and start them if one of the threads finish
			 * catch exception and continue
			 */
			thread1 = new Thread(new ThreadCheckArray(sd), "thread1");
			thread2 = new Thread(new ThreadCheckArray(sd), "thread2");
			thread1.start();
			thread2.start();
			try {
				thread1.join();
				thread2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (!sd.getFlag()) {
				System.out.println("Sorry");
				return;
			}

			/**
			 * Print result with all the values. Using in loops
			 */
			System.out.println("Solution for b : " + sd.getB() + ",n = " + sd.getArray().size());
			System.out.print("I:    ");
			for (int index = 0; index < sd.getArray().size(); index++)
				System.out.print(index + "    ");
			System.out.println();
			System.out.print("A:    ");
			for (int index : sd.getArray()) {
				System.out.print(index);
				int counter = 5;
				while (true) {
					index = index / 10;
					counter--;
					if (index == 0)
						break;
				}
				for (int i = 0; i < counter; i++)
					System.out.print(" ");
			}

			System.out.println();
			System.out.print("C:    ");
			for (boolean index : sd.getWinArray()) {
				if (index)
					System.out.print("1    ");
				else
					System.out.print("0    ");
			}
		}
	}

}