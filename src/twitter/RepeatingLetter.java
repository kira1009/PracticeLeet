package twitter;

import java.util.Scanner;

/**
 * Created by cagekira on 3/20/16.
 */
public class RepeatingLetter {

    public static void main(String[] args){
        String s = "";
        char[] c = s.toCharArray();
        int[] arrpos = new int[256];
        int[] arrcount = new int[256];
        int pos = 1;
        for(char character : c){
            if(arrcount[character - 'A'] == 0){
                arrpos[character - 'A'] = pos;
                pos++;
            }
            arrcount[character - 'A']++;
        }
        int minpos = Integer.MAX_VALUE;
        for(int i = 0; i < arrpos.length; i++){
            if(arrcount[i] == 1){
                minpos = Math.min(minpos,arrpos[i]);
            }
        }
        for(int i = 0; i < arrpos.length; i++){
            if(arrpos[i] == minpos){
                System.out.print((char) i);
            }
        }

    }
}
