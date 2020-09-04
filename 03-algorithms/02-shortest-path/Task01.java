import java.util.*;
import java.io.*;
public class Task01{
    public static void main(String[] args){
        try{
            int [][] graph;
            int n = 0;
            int m = 0;
            int x = 0;
            int q = 0;
            FileReader fr = new FileReader("G:\\Summer20\\CSE221\\LAB\\Lab 02\\task1.txt");
            BufferedReader obj = new BufferedReader(fr);
            String string = obj.readLine();
            StringTokenizer st = new StringTokenizer(string, " ");
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            x = Integer.parseInt(st.nextToken()) - 1;
            q = Integer.parseInt(st.nextToken());

            graph = new int[n][n];
            for (int i = 0; i < m; i++){
                string = obj.readLine();
                st = new StringTokenizer(string, " ");
                int token1 = Integer.parseInt(st.nextToken()) - 1;
                int token2 = Integer.parseInt(st.nextToken()) - 1;
                int token3 = Integer.parseInt(st.nextToken());
                graph[token1][token2] = token3;
            }
            for(int k = 1; k <= q; k++){
                string = obj.readLine();
                st = new StringTokenizer(string, " ");
                int s = Integer.parseInt(st.nextToken());
                int t = Integer.parseInt(st.nextToken());
                Dijkstra dij = new Dijkstra();
                int d1 = dij.dijkstra(graph, s-1, x-1);
                int d2 = dij.dijkstra(graph, x-1, t-1);
                System.out.println("Case: " + k + "\n" + (d1+d2));
            }
        }
        catch (IOException e){
            System.err.println(e);
        }
    }
}
