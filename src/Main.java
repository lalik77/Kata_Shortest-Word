import java.util.Scanner;

public class Main {

    private Scanner sc;

    public static int findShort(String s) {


        int len = Integer.MAX_VALUE;
        String[] words=s.split("\\s");

        for(int i=0; i<words.length;i++) {

            len=Math.min(len,words[i].length());
        }

        return len;

    }





    public static void main(String[] args) {

        // int l=Integer.MAX_VALUE; // 2147483647

        String str = "Hello i am a string" ;
        String[] s1=str.split("\\s");

        for (int i=0;i<s1.length;i++) {

            System.out.println(s1[i]);
        }
        System.out.println("Hello World!");

        String s2="Hello this is the second string";

        System.out.println(findShort(s2));

        Scanner sc = new Scanner(System.in);

        System.out.println("Введите предложение : ");
        String s3=sc.nextLine();

        System.out.println("В вашем предложении самое короткое слово имеет "+  findShort(s3) + " символов");



    }
}
