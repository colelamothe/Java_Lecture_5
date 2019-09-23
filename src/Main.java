

public class Main {

    public static void main(String[] args){
        // This program uses a custom class "Die"
        Die die1, die2; // initializes two new variables of the new Die type
        int sum;

        die1 = new Die(); // creates a new die object from our custom definition
        die2 = new Die();

        die1.roll(); // calls one of the methods from the Die class to roll the die
        die2.roll();
        // When adding these objects to a string it automatically uses the toString method to allow concatenation
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);

        die1.roll();
        die2.setFaceValue(4); // Calls one of the methods from the die class to manually set the face value
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);

        sum = die1.getFaceValue() + die2.getFaceValue(); // uses the method to retrieve the value of these variables
        System.out.println("Sum: " + sum);

        sum = die1.roll() + die2.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);
        System.out.println("New sum: " + sum);


        // Uses Account class

        Account acct1 = new Account ("Ted Murphy",72354, 123.20);
        Account acct2 = new Account ("Jane Smith",5487, 40.00);
        Account acct3 = new Account ("Matt Smith",85241, 759.32);

        acct1.deposit(25.85);

        double smithBalance = acct2.deposit(500.00);
        System.out.println("Smith Balance aftwe deposit: " + smithBalance);

        System.out.println("Smith balance after withdrawal: " + acct2.withdraw (430.75, 1.50));

        acct1.addInterest();
        acct2.addInterest();
        acct3.addInterest();

        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);

    }
}
