import java.io.*;
import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
        String str="Geeks", nstr="";
        char ch;
        System.out.println("Original word: ");
        System.out.println("scope_VIT");
        for(int i=0;i<str.length();i++){
            ch=str.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println("REversed string"+nstr);
    }
}
