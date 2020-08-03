/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securiot2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
/**
 *
 * @author HP
 */
public class Locate {
     public static void main(String[] args) throws IOException
    {
     
        Runtime runtime = Runtime.getRuntime();
        String cmd = (String) "C:\\Users\\HP\\Desktop\\SecurIOT2";
        
        Process proc = runtime.exec(cmd);
        InputStream inputstream = proc.getInputStream();
        InputStreamReader inputstreamreader = new InputStreamReader(inputstream);
        BufferedReader bufferedreader = new BufferedReader(inputstreamreader); 
         String line;
         
         while ((line = bufferedreader.readLine())!= null){
             System.out.print(line);
         }
        
    }
}
