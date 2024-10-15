package section4;

public class Variable {
    public static void main(String[] args) {
        System.out.println("Hello Riki!");

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - myTotal;

        System.out.println("int myFirstNumber = (10 + 5) + (2 * 10); // output =  " + myFirstNumber);
        System.out.println("int mySecondNumber = 12; // output = " + mySecondNumber);
        System.out.println("int myThirdNumber = myFirstNumber * 2 // output = " + myThirdNumber);
        System.out.println("int myTotal = myFirstNumber + mySecondNumber + myThirdNumber; // output = " + myTotal);
        System.out.println("int myLastOne = 1000 - myTotal; // output = " + myLastOne);
    }
}
