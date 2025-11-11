package Bytestreams;

import java.io.FileOutputStream;

public class fileoutputsteam {
    public static void main(String[] args){
        try{
            FileOutputStream fout= new FileOutputStream("output.txt");
            String s="Hello World! This is a file output stream example.";
            fout.write(s.getBytes()); 
            fout.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
