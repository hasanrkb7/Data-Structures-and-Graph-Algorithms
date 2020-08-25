import java.io.*;
import java.util.*;
public class level4 {
    public static void main (String[]args){
        int [][] graph;
        try{
            FileReader fr = new FileReader ("G:\\Summer20\\CSE221\\Lab\\A1_textFile\\task4.txt");
            BufferedReader obj = new BufferedReader(fr);

            String str = obj.readLine();
            int v = Integer.parseInt(str);

            str=obj.readLine();
            int e = Integer.parseInt(str);

            graph = new int[v][v];
            for(int i = 0; i < e; i++){

                str=obj.readLine();
                StringTokenizer st = new StringTokenizer(str," ");
                int token1 = Integer.parseInt(st.nextToken());
                int token2 = Integer.parseInt(st.nextToken());
                graph[token1][token2] = 1;
            }
            for(int i = 0; i < graph.length; i++){
                int inDegree = 0;
                for(int j = 0; j < graph[0].length; j++){
                    inDegree += graph[j][i];
                }
                if(inDegree == 0){
                    System.out.println();
                    System.out.println("If Nora start from  " + i + "rd position  that would be Suitable for her.");
                }
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}