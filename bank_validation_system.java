import java.util.Scanner;

// Custom Exceptions
class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
        super(msg);
    }
}

class InvalidNumberException extends Exception {
    InvalidNumberException(String msg) {
        super(msg);
    }
}

class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}

public class BankValidationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            System.out.print("Enter Account Number: ");
            String accNo = sc.next();

            System.out.print("Enter Balance: ");
            double balance = sc.nextDouble();

            if (age < 18)
                throw new InvalidAgeException("Invalid Age! Must be 18+");

            if (accNo.length() < 5)
                throw new InvalidNumberException("Invalid Account Number!");

            if (balance < 1000)
                throw new InsufficientBalanceException("Insufficient Balance!");

            System.out.println("All inputs are valid!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
