public class PhoneNumberValidation {

    /** Check phone number is valid or not
     *  shouldn't be lessthan 10 digits
     *  shouldn't be greaterthan 10 digits
     *  no alphabetics
     */
    public static void main(String [] args){

        String num="912345678f";  //scenario - negative case - invalid phone number - with alphabet
        boolean check=false;

        for(int i=0;i<num.length();i++){
            if(Character.isAlphabetic(num.charAt(i))){
                check=true;
            }
        }
        if(num.length()<10){
            throw new IllegalArgumentException(num+" is having lessthan 10 numbers");
        }
        else if(num.length()>10){
            throw new IllegalArgumentException(num+" is having greaterthan 10 numbers");
        }
        else if(check){
            throw new IllegalArgumentException(num+" is invalid phone number");
        }
        else{
            System.out.println(num+" is a valid phone number");
        }


    }


}
