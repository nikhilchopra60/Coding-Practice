package ProbablisticCounting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class time {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        System.out.println("here1234");
        for(int a0 = 0; a0 < t; a0++){
            int R = in.nextInt();
            int C = in.nextInt();
            in.nextLine();
            String G[][] = new String[R][1000];
            for(int G_i=0; G_i < R; G_i++){
                for(int G_j=0; G_j < C; G_j++){
                  G[G_i][G_j] = in.next();
                      System.out.println( G[G_i][G_j] );
                }
            }
            System.out.println("here1");
            //System.out.println(Arrays.toString(G));
            int r = in.nextInt();
            int c = in.nextInt();
            in.nextLine();
            String P[][] = new String[r][1000];
            for(int P_i=0; P_i < r; P_i++){
                for(int P_j=0; P_j < c; P_j++){
                  P[P_i][P_j] = in.next();
                    System.out.println(P[P_i][P_j] );
                }
            }
            
            System.out.println("here");
            //System.out.println(Arrays.toString(G));
            
            for(int G_i=0; G_i < R-r; G_i++){
                for(int G_j=0; G_j < C-c; G_j++){
                  for(int P_i=0; P_i < r; P_i++){
                      for(int P_j=0; P_j < c; P_j++){
                            if ( G[G_i][G_j]==P[P_i][P_j] ){
                                 System.out.println("YES");
                              /*  for(int row=r;row>0;row--){
                                    
                                    for(int col=c;col>0;col--){
                                        
                                        if ( G[G_i+r][G_j+c]==P[P_i+r][P_j+c] ){
                                            
                                            System.out.println("YES");
                                        }
                                    }
                                }*/
                            }
                          else{
                              System.out.println("NO");
                          }
                              
                }
            }
                }
            }
            
            
            
            
            
        }
    }
}
