import java.util.*;
public class Leetcode_1832 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sentence=sc.nextLine();
        boolean[] alpha=new boolean[26];
        for(int i=0;i<sentence.length();i++){
            char ch=sentence.charAt(i);
            alpha[ch-'a']=true;
        }

        for(int i=0;i<26;i++){
            if(alpha[i]==false){
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}