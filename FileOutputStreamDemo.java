package com.tutorialspoint;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {
   public static void main(String[] args) throws IOException {
      FileOutputStream fos = null;
      
      try {
         // create new file output stream
         fos = new FileOutputStream("C://text.txt");
         
         // close stream
         fos.close();
         
         // try to write into underlying stream
         fos.write(65);
         fos.flush();
         fos.close();
   
      } catch(Exception ex) {
         // if any error occurs
         System.out.print("IOException: File output stream is closed");
      } finally {
         // releases all system resources from the streams
         if(fos!=null)
            fos.close();
      }
   }
}
