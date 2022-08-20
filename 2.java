
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
    public static void main(String[] args) {
        
        int vCount = 0;
        int conCount = 0;  
          
        String str = "My name is kunal kumar";  
          
          
        str = str.toLowerCase();  
          
        for(int i = 0; i < str.length(); i++) {  
            //for checking vowel  
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {  
                  
                vCount++;  
            }  
            //for checking consonant  
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {    
                 
                conCount++;  
            }  
        }  
        System.out.println("Number of vowels: " + vCount);  
        System.out.println("Number of consonants: " + conCount);  
    }  
       
}
