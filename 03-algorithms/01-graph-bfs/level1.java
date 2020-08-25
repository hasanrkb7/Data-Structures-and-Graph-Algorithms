import java.io.*;
import java.util.*;
public class level1 {
    public static void main (String[]args){
        int [][] graph;
        int source = 0;
        try{
            FileReader fr = new FileReader ("G:\\Summer20\\CSE221\\Lab\\A1_textFile\\task1.txt");
            BufferedReader obj = new BufferedReader(fr);

            String str = obj.readLine();
            int v = Integer.parseInt(str);

            str = obj.readLine();
            int e = Integer.parseInt(str);

            graph = new int[v][v];
            for(int i = 0; i < e; i++){
                str = obj.readLine();
                StringTokenizer st = new StringTokenizer(str," ");
                int token1 = Integer.parseInt(st.nextToken());
                int token2 = Integer.parseInt(st.nextToken());
                graph[token1][token2] = 1;
                graph[token2][token1] = 1;
            }
            int x = Integer.parseInt(obj.readLine());

            String [] color = new String[v];
            int [] level = new int[v];
            int [] parents = new int[v];
            Queue<Integer> q=new LinkedList<Integer>();
            for (int i = 0; i < v; i++){
                color[i] = "white";
                level[i] = -1;
                parents[i] = -1;
            }
            color[source] = "grey";
            level[source] = 0;
            parents[source] = -1;
            q.add(source);
            while(!q.isEmpty()){
                int adj = 0;
                int u = q.poll();
                for (int j = 0; j < graph[u].length; j++){
                    if (graph[u][j] == 1){
                        adj = j;
                        if (color[adj].equals("white")){
                            color[adj] = "grey";
                            level[adj] = level[u] + 1;
                            parents[adj] = u;
                            q.add(adj);
                        }
                    }
                }
                color[u] = "black";
            }
            System.out.println();
            System.out.print("Minimum Level of moves Nora need from 0 to 6 is " + level[x]+" ");
        }
        catch(IOException e){
            System.err.println(e);
        }
    }
}

