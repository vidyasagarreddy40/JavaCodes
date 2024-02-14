public class FirstLetterCaps {

    //print first letter as uppercase letter in every word in a string

    public static void main(String[]args){
        String p="we are automation engineers",p1="";

        String ar[]=p.split(" ");

        for(int i=0;i<ar.length;i++){
            p1=p1+" "+ar[i].substring(0,1).toUpperCase()+ar[i].substring(1);
        }
        System.out.println(p1);

    }

}
