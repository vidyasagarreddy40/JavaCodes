public class multiplePalindromesInString {

    public static void main(String [] arsg){
        System.out.println(getPalindromes("malayalam"));
    }

    public static int getPalindromes(String name){
        int palindromes=0;
        int expected=0;
        for(int i=0;i<name.length();i++){
            for(int j=i+1;j<=name.length();j++){
                String temp=name.substring(i,j);
                if(temp.length()>1) {
                    String rev = "";
                    for (int k = temp.length() - 1; k >= 0; k--) {
                        rev = rev + temp.charAt(k);
                        if (rev.equalsIgnoreCase(temp)) {
                            System.out.println(temp + " is a palindrome");
                            palindromes++;
                            if(rev.equalsIgnoreCase("ala")){
                                expected++;
                            }
                        }
                    }
                }
            }
        }
return palindromes + expected;
    }

}
