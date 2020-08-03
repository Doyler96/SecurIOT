/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package securiot2;

import java.io.IOException;

/**
 *
 * @author HP
 */
public class test2 {
    
    public static void method(){
       try{    
    Process p = Runtime.getRuntime().exec("C:/Users/HP/Desktop/SecurIOT2/src//securiot2/Test2.bat");
    p.waitFor();

        }catch( IOException ex ){
    //Validate the case the file can't be accesed (not enought permissions)

        }catch( InterruptedException ex ){
    //Validate the case the process is being stopped by some external situation     

}
    }
            }
     
