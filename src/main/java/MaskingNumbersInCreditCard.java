public class MaskingNumbersInCreditCard {

    //Excluding first 6 digits and last 4 digits, mask the remaining numbers in a credit card

    public static void main(String[] args) {
        String input = "5450647390918246";

       int len=input.length();

       String p1=input.substring(0,6);
       String p2= input.substring(len-4);
       String masking ="";

       for(int i=6;i<(len-4);i++){
           masking=masking+(input.substring(i,i+1).replaceAll("[0-9]","*"));
       }
       System.out.println(p1+masking+p2);
    }

}
