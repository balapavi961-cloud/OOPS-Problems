import java.util.Scanner;

public class Main{
    boolean palindrome(String s){
        char ch[]=s.toCharArray();
        for(int i=ch.length-1,j=0;i>j;i--,j++){
            if(ch[j]!=ch[i]) return  false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Main m = new Main();
        System.out.println(m.palindrome(s)?"Palindrome":"Not a Palindrome");
    }
}