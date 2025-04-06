package assignment.qkrehdwns;

import java.io.BufferedReader;
import java.io.*;

public class BOJ2439 {
    public static void main(String[] args) throws IOException {
        //123
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        for(int i=n;i>0;i--){
            for(int j=0;j<i-1;j++){
                bw.write(" ");
            }
            for(int j=0;j<n-i+1;j++){
                bw.write("*");
            }
            bw.write("\n");
        }

        br.close();
        bw.close();
    }
}
