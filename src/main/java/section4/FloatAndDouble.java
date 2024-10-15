package section4;

public class FloatAndDouble {
    public static void main(String[] args) {
        // width of int = 32 (4 bytes)
        int myIntValue = 5/3;
        // width of float = 32 (4 bytes)
        float myFloatValue = 5f / 3f;
        // width of double = 64 (8 bytes)
        double myDoubleValue = 5d / 3d;

        System.out.println("myIntValue = " + myIntValue); // output: myIntValue = 1
        System.out.println("myFloatValue = " + myFloatValue); // output: myFloatValue = 1.6666666
        System.out.println("myDoubleValue = " + myDoubleValue); // output: myDoubleValue = 1.6666666666666667

        // Convert a given number of pounds to kilograms
        // 1. Create a variable to store the number of pounds
        // 2. Calculate the number of Kilograms for the number above and store in variable
        // 3. Print the result.
        //
        // NOTES: 1 pound is equal to 0.45359237 kilograms.

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);
    }
}
