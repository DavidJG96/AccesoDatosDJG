import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStream inputstream = new FileInputStream("C:\\Users\\david\\IdeaProjects\\DATA_ACCESS_DJG_2223\\Unit 2\\2.5\\ex_2.5\\img.png");
        byte[] data = new byte[6];
        int bytesRead = inputstream.read( data );
        if(data[0]==(byte)0x42 && data[1]==(byte)0x4D) {
            System.out.println("BMP image");
        }else
            if(data[0]==(byte)0x47 && data[1]==(byte)0x49 && data[2]==(byte)0x46 && data[3]==(byte)0x38 && data[4]==(byte)0x39  && data[5]==(byte)0x61 ){
                System.out.println("GIF image");
            }else
                if(data[0]==(byte)0xFF && data[1]==(byte)0xD8 && data[2]== (byte)0xFF){
                    System.out.println("JPG image");
                }else
                    if(data[0]==(byte)0x89 && data[1]==(byte)0x50 && data[2]==(byte)0x4E && data[3]==(byte)0x47){
                        System.out.println("PNG image");
                    }else
                        if(data[0]==(byte)0x00 && data[1]==(byte)0x00 && data[2]==(byte)0x01 && data[3]==(byte)0x00)
                            System.out.println("ICO image");
        inputstream.close();

    }
  /* public static byte[] method(File file)
           throws IOException
   {

       // Creating an object of FileInputStream to
       // read from a file
       FileInputStream fl = new FileInputStream(file);

       // Now creating byte array of same length as file
       byte[] arr = new byte[(int)file.length()];

       // Reading file content to byte array
       // using standard read() method
       fl.read(arr);

       // lastly closing an instance of file input stream
       // to avoid memory leakage
       fl.close();

       // Returning above byte array
       return arr;
   }

    // Method 2
    // Main driver method
    public static void main(String[] args)
            throws IOException
    {

        // Creating an object of File class and
        // providing local directory path of a file
        File path = new File(
                "C:\\Users\\david\\IdeaProjects\\DATA_ACCESS_DJG_2223\\Unit 2\\2.5\\ex_2.5\\img.png");

        // Calling the Method1 in main() to
        // convert file to byte array
        byte[] array = method(path);

        // Printing the byte array
        System.out.print(Arrays.toString(array));
    }*/
}