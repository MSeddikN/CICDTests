package src;

public class Main {
//    public static void main(String[] args) {
//        System.out.println("Hi World");
//    }
    public static String sayHello(String name) {
        // You can print to STDOUT for debugging if you need to:
        System.out.print("Hello 1"+name);

        // but you need to return the correct value in order to pass the challenge
        return name; // TODO: return the correct value
    }
    public static void main(String[]args){
//        firstNonRepeatingLetter("sTreSs");
        System.out.println(firstNonRepeatingLetter("moonmen"));
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
}
