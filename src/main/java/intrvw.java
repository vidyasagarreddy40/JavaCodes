public class intrvw {

    public static void main(String[]args){


        String input= "5450595638154862";

        int len= input.length();

        String p1= input.substring(0,6);
        String p2=input.substring(len-4);

        String p3=input.substring(7,len-4);

        String masking="";
        for(int i=7;i<(len-4);i++){
            masking=masking+(input.substring(i,i+1).replaceAll("[0-9]","*"));
        }
        String output= p1+masking+p2;
        System.out.println(output);


    }
}
