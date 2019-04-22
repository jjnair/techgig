import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class TechGig_Test1 {

    public static void main(String args){

        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(inp);
        try {
             Integer loops =  Integer.valueOf(buff.readLine());


        } catch (IOException e) {
            System.out.println("Input error");
        }


    }
}
