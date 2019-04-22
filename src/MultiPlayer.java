import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class MultiPlayer {

    public static void main(String[] args) {


        System.out.println("Hello World!");

        InputStreamReader inp = new InputStreamReader(System.in);
        BufferedReader buff = new BufferedReader(inp);
        try {
            System.out.print("Enter number of cases: ");
            Integer loops = Integer.valueOf(buff.readLine());

            ArrayList<Integer> player[] = new ArrayList[loops];
            ArrayList<Integer> villan[] = new ArrayList[loops];
            for (int k = 0; k <loops; k++) {
                System.out.print("Enter number number of player and villan pair: ");
                String villan_Player_no = buff.readLine();
                Integer v_p_no = Integer.valueOf(villan_Player_no);


                int j = v_p_no;
                villan[k] = new ArrayList<Integer>();
                player[k] = new ArrayList<Integer>();
                for (int i = v_p_no; i > 0; i--) {
                    System.out.print("Enter Villan Energy level" + (j + 1 - i) + " :");
                    villan[k].add(Integer.valueOf(buff.readLine()));
                }
                Collections.sort(villan[k]);
                j = v_p_no;
                for (int i = v_p_no; i > 0; i--) {
                    System.out.print("Enter Player Energy level " + (j + 1 - i) + " :");
                    player[k].add(Integer.valueOf(buff.readLine()));
                }
                Collections.sort(player[k]);


                int result[] = new int[v_p_no];
                int finalresult = 65536;

                    for (int s = 0; s < v_p_no; s++) {
                        result[s] = (player[k].get(s)) > (villan[k].get(s)) ? 65536 : 0;
                        finalresult = finalresult & result[s];
                    }
                    System.out.println(finalresult > 0 ? "WIN" : "LOSE");

            }
        } catch (IOException e) {
            System.out.println("Input error");
        }

        }
    }

