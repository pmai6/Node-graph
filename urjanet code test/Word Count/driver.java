import java.util.*;
import java.io.*;

public class driver {
    public static void main(String[] args){
        //countWord.readFile("test.txt");
        //String s = "This is a sample sentence. Make it more simple?? Add more!";
        try{
           HashSet<String> h = countWord.makeWordDic("c.txt");
           ArrayList<String> c = countWord.count("c.txt", h); 
        }catch (FileNotFoundException ex) {
            System.out.println("Cannot open file");
        }
      
    }


}