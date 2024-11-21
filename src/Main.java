package src;

public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hi World");
//    }
    public static String sayHello(String name) {
        // You can print to STDOUT for debugging if you need to:
        System.out.print("Hello "+name);

        // but you need to return the correct value in order to pass the challenge
        return name; // TODO: return the correct value
    }
    public static void main(String[]args){
//        firstNonRepeatingLetter("sTreSs");
//        System.out.println(firstNonRepeatingLetter("moonmen"));
        reverseNumber(98);
        palindromeChainLength(121);
    }


    public static String firstNonRepeatingLetter(String str) {
        String strLowerCase = str.toLowerCase();
        for(int i =0; i<str.length();i++){
            var charOriginal = str.charAt(i);
            var charLower = strLowerCase.charAt(i);
//            System.out.println(strLowerCase.lastIndexOf(charLower));
//            System.out.println(charLower);
            if (strLowerCase.lastIndexOf(charLower)==i && strLowerCase.indexOf(charLower) == i) {

                return String.valueOf(charOriginal); // Return the original case
            }
        }
        return "";
    }

    public static int palindromeChainLength(long n) {
        // reverse the given number
        long reversedNumber = reverseNumber(n);
        int i =0;

            //break the addition loop if the result number's reversed is the same as original
            while(n!= reverseNumber(n)){
                n= n+reverseNumber(n);
                i++;
            }

        //return the iterations number
        System.out.println(i);
        return i;
    }

    public static long reverseNumber(long n){
        String strNumber = String.valueOf(n);
        String strReverseNumber = new StringBuilder(strNumber).reverse().toString();
        long reversedNumber = Long.parseLong(strReverseNumber);
        //continue the reverse process
//        System.out.println(reversedNumber);
        return reversedNumber;
    }
}
