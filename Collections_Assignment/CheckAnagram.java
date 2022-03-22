import java.util.HashMap;
import java.util.List;
import java.util.Scanner;



public class CheckAnagram {

    static boolean checkingAnagram(String str1,String str2){

        char array1[] = str1.toCharArray();
        char array2[] = str2.toCharArray();
        HashMap<Character,Integer> hmap1= new HashMap<Character,Integer>();
        HashMap<Character,Integer> hmap2= new HashMap<Character,Integer>();

        for(int i=0; i< array1.length; i++){
            if (hmap1.get(array1[i]) == null){
                hmap1.put(array1[i],1);
            }
            else {
                Integer c=(int)hmap1.get(array1[i]);
                hmap1.put(array1[i],++c);
            }
        }

        for(int j=0; j< array2.length; j++){
            if (hmap2.get(array2[j]) == null){
                hmap2.put(array2[j],1);
            }
            else {
                Integer d=(int)hmap2.get(array2[j]);
                hmap2.put(array2[j],++d);
            }
        }

        if(hmap1.equals(hmap2))
            return true;
        else
            return false;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a first string");
        String str1=sc.nextLine();
        System.out.println("enter a second string");
        String str2=sc.nextLine();
        if(str1.length()==str2.length()) {
            if (checkingAnagram(str1, str2)) {
                System.out.println("the two strings are anagram of each other");
            } else
                System.out.println("the two strings are not anagram of each other");
        }
        else
            System.out.println("given two strings are invalid");


    }
}