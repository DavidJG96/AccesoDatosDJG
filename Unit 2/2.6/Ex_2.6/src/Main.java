import java.io.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
//function to convert indian to int
static Integer  indianToInt(byte fir, byte sec, byte thr,byte fou){
    Integer intNumber =  Byte.toUnsignedInt(fou);
            intNumber = intNumber*256 + Byte.toUnsignedInt(thr);
            intNumber = intNumber*256 + Byte.toUnsignedInt(sec);
            intNumber = intNumber*256 + Byte.toUnsignedInt(fir);
    return intNumber;
}
//read + result  of the conversion
    public static void main(String[] args) throws IOException {
        InputStream inputstream = new FileInputStream("C:\\Users\\david\\IdeaProjects\\DATA_ACCESS_DJG_2223\\Unit 2\\2.5\\ex_2.5\\bmp.png");
        byte[] data = new byte[34];
        int bytesRead = inputstream.read( data );
        if(data[0]==(byte)0x42 && data[1]==(byte)0x4D) {
        System.out.println("Size  of the image" + indianToInt(data[2],data[3],data[4],data[5]).toString());
            System.out.println("Height of the image" + indianToInt(data[22],data[23],data[24],data[25]).toString());
            System.out.println("Width  of the image" + indianToInt(data[18],data[19],data[20],data[21]).toString());
            System.out.println("Compression  of the image" + indianToInt(data[30],data[31],data[32],data[33]).toString());
        }else{
        }
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