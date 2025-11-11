package Bytestreams;

import java.io.FileInputStream;

public class fileinputsteam {
    public static void main(String[] args){
        try {
            FileInputStream fin=new FileInputStream("input.txt");
            int b; 
            while((b=fin.read())!=-1){
                System.out.print((char)b);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
}
