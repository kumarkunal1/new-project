
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
    public static void main(String[] args)
     {
        int [] arr =  new int  [] {10,20,30,40,50};  
        int sum = 0;  
        
        for (int i = 0; i < arr.length; i++) 
        {  
           sum = sum + arr[i];  
        }  
        System.out.println("sum of all the elements of array:" + sum);
    }
}
