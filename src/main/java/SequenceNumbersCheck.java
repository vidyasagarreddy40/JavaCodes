public class SequenceNumbersCheck {

    public static void main(String[]args){


        int[] nums={0,1,2,3,4,5,6,7,8,9,0};

        int num, maxLength;

        for(int i=0;i<nums.length;i++){
            num=0;
            maxLength=nums.length-i;

            for(int j=i;j<=i+2 && maxLength>=3;j++){
                num=(num*10)+nums[j];
            }
            if(num>=100 && num<=300){
                System.out.println(num);
            }
        }
    }
}
