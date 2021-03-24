import java.util.Scanner;

public class AddandEven {

    public static void main(String[] args) {
	// TODO Auto-generated method stub

	int number, remainder;
	System.out.println("Enter an integer number");
	Scanner scan = new Scanner(System.in);
	number = scan.nextInt();
	scan.close();
	remainder = number % 2;
	if (remainder == 0) {
	    System.out.println(number + " is Even Number");
	} else {
	    System.out.println(number + " is Odd Number");
	}

    }

}
