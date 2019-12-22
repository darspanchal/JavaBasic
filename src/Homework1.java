import java.util.Scanner;

public class Homework1 {

        // No Return type - No Parameters STATIC METHOD
        public static void remove() { // Method for remove targeted character
            String sample = "This is very easy programme";
            sample = sample.replace("s","");
            System.out.println(sample); }

        // No Return type - No Parameters STATIC METHOD
        public static void findlength(){ // Method for finiding character lenght
            String sample = "This is very easy programme";
            System.out.println(sample.length()); }

        // No Return type - No Parameters STATIC METHOD
        public static void removespace(){ // Method for remove space in between character
            String sample = "This is very easy programme";
            System.out.println(sample.replaceAll("\\s","")); } //

        // No Return type - No Parameters STATIC METHOD
        public static void extractspechar(){ // Method for extracting special character
            String sample = "This $300 is equivalent of £200 but not for @100";
            System.out.println(sample.replaceAll(("[^a-zA-Z0-9]"), " "));  }

         // No Return type - No Parameters STATIC METHOD
        public static void extractnumber(){ // Method for extracting number from string
            String sample= "The cost of iPhone is £1,250";
            System.out.println(sample.replaceAll("[^0-9]", ""));}
            public static void inttonum(){
            int sample = 450;
            System.out.println((double)(sample)); }

        // No Return type - No Parameters STATIC METHOD
        public static void stringtoint(){//method created to convert String value to Integer
            String sample = "125";
            System.out.println(Integer.parseInt(sample)); }

        // No Return type - No Parameters STATIC METHOD
        public static void doubletostring (){// // method created to convert double value to String
            double sample = 123.45;
            System.out.println(String.valueOf(sample)); }

        // No Return type - No Parameters STATIC METHOD
        public static void stringtodouble (){// method will convert string value to double
            String sample = "560.25";
            Double value = Double.parseDouble(sample);
            System.out.println(value);     }


        public static void divisionindecimal(double x, double y){ //method to get answer in decimal value
            String value1 =  "1";
            String value2 = "3";
            System.out.println(x/y);

            System.out.println(Double.parseDouble(value1) + Double.parseDouble(value2));}

         // No Return type - No Parameters STATIC METHOD
        public static void replacecurrencysymbol(){
            String sample = "$250.00";
            System.out.println(sample.replace("$", "£")); }

        // No Return type - No Parameters STATIC METHOD
        public static void extractFromMid(){// // method will extract middle character from string
            Scanner in = new Scanner(System.in);
            System.out.print("Enter a name : ");
            String str=in.next();

            int position;
            int length;
            if (str.length() % 2 == 1) {
                position = str.length() / 2;
                length = 1; }
            else { position = str.length() / 2 - 1;
                length = 2; }

            String results = str.substring(position, position + length);
            System.out.println("middle character of string is = " + results); }

        public static void main(String[] args) {

            remove();
            findlength();
            removespace();
            extractspechar();
            extractnumber();
            inttonum();
            stringtoint();
            doubletostring();
            stringtodouble();
            divisionindecimal(1,3);
            replacecurrencysymbol();
            extractFromMid();
        }

    
}
