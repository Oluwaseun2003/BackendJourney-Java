import java.lang.*;

class DataSizeRange{
    public static void main(String args[]){
        System.out.println("Int Min:" + Integer.MIN_VALUE);
        System.out.println("Int Min:" + Integer.MAX_VALUE);
        System.out.println("Int Min:" + Integer.BYTES);

        System.out.println("Float Min:" + Float.MIN_VALUE);
        System.out.println("Float Min:" + Float.MAX_VALUE);
        System.out.println("Float Min:" + Float.BYTES);


        System.out.println("Byte Min:" + Byte.MIN_VALUE);
        System.out.println("Byte Min:" + Byte.MAX_VALUE);
        System.out.println("Byte Min:" + Byte.BYTES);

        // Variables
        // Variables are used to store data, variables are names given to a datatype

        byte b =5;
        int s = 128;
        float f = 25.3f;
        double d = 25.666d;

        System.out.println(b + " " + s + " " + f 
        + " " + d);


    }
}