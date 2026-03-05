package Pruebas.IOstreams;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class App{
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("lipu_mi.txt");
            out = new FileOutputStream("sona_lili.txt");

            int c;
            int i;
            while ((c = in.read()) != -1){
                out.write(c);
            }
        } catch(IOException ex){
            System.out.println("Error! Was not possible to instance Object in");
            System.out.println(ex.getMessage());
            ex.getMessage();
            ex.printStackTrace();
        } finally{
            if ( in != null ){
                in.close(); 
            } 
            
            if ( out != null ){
                out.close(); 
            }
        }
    }
}