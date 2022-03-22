import java.util.*;
class Array{
    public static void main(String[] args){
        int[] array=new int[]{1,3,-1,2,-3};
        int result=0;
        int sum=0;
        for (int i=0;i<5;i++){
            sum=0;
            sum=sum+array[i];
            if(sum<0){
                result++;
            }
            for (int j=i+1;j<5;j++){
                sum=sum+array[j];
                if(sum<0){
                    result++;
                }
            }
        }
        System.out.println(result);

    }
}