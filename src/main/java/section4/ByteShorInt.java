package section4;

public class ByteShorInt {
    public static void main(String[] args) {
        // 1. Create a byte variable and set it to any valid byte number.
        byte aByte = 10;
        System.out.println("aByte: " + aByte);
        // 2. Create a short variable and set it to any valid short number.
        short aShort = 20;
        System.out.println("aShort: " + aShort);
        // 3. Create a int variable and set it to any valid in number.
        int anInt = 50;
        System.out.println("anInt: " + anInt);
        // 4. Create a variable of type long and make it equal to
        // 50000 + 10 times the sum of the byte, plus the short plus the int
        long aLong = 50000L + 10L * (aByte + aShort + anInt);
        System.out.println("aLong: " + aLong);

        byte byteValue = 10;
        short shortValue = 20;
        int intValue = 50;

        long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
        short shortTotal = (short) (1000 + 10 * (byteValue + shortValue + intValue));
        System.out.println("longTotal = " + longTotal);
        System.out.println("shortTotal = " + shortTotal);

    }

}