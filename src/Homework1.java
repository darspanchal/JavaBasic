import java.util.Scanner;

public class Homework1   {

    // No Return type - No Parameters STATIC METHOD
    public static void remove() {
        String sample = "This is very easy programme";
        sample = sample.replace("s","");
        System.out.println(sample); }

    // No Return type - No Parameters STATIC METHOD
    public static void findlength(){
        String sample = "This is very easy programme";
        System.out.println(sample.length()); }

    // No Return type - No Parameters STATIC METHOD
    public static void removespace(){
        String sample = "This is very easy programme";
        System.out.println(sample.replaceAll("\\s","")); } //

    public static void extractspechar(){
        String sample = "This $300 is equivalent of £200 but not for @100";
        System.out.println(sample.replaceAll(("[^a-zA-Z0-9]"), " "));  }

    public static void extractnumber(){
        String sample= "The cost of iPhone is £1,250";
        System.out.println(sample.replaceAll("[^0-9]", ""));}

    public static void inttonum(){

        int sample = 450;
        System.out.println((double)(sample)); }

    public static void stringtoint(){
        String sample = "125";
        System.out.println(Integer.parseInt(sample)); }

    public static void doubletostring (){
        double sample = 123.45;
        System.out.println(String.valueOf(sample)); }

    public static void stringtodouble (){
        String sample = "560.25";
        Double value = Double.parseDouble(sample);
        System.out.println(value);     }

    public static void divisionindecimal(double x, double y){
        String value1 =  "1";
        String value2 = "3";
        System.out.println(x/y);

        System.out.println(Double.parseDouble(value1) + Double.parseDouble(value2));}

    public static void replacecurrencysymbol(){
        String sample = "$250.00";
        System.out.println(sample.replace("$", "£")); }

    public static void extractFromMid(){

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

        remove();   // This Command Will remove "s" from string
        findlength();   // This Command count character from string
        removespace();  // This command will remove space from string
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
