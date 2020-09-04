public class Dijkstra{
    public int dijkstra(int [][] graph, int source, int destination){
        int array = graph.length;
        boolean [] visited = new boolean[array];
        int [] distance = new int[array];
        distance[source] = 0;
        for (int i = 0; i < array; i++){
            if(i != source){
                distance[i] = Integer.MAX_VALUE;
            }
        }
        for (int i = 1; i < array; i++){
            int minimumVertex = findMinimumVertex(distance, visited);
            visited[minimumVertex] = true;
            for (int j = 0; j < array; j++){
                if (graph[minimumVertex][j] != 0 && !visited[j] && distance[minimumVertex]!= Integer.MAX_VALUE){
                    int minimum = distance[minimumVertex] + graph[minimumVertex][j];
                    if(minimum < distance[j]){
                        distance[j] = minimum;
                    }
                }
            }
        }
        return distance[destination];
    }
    public int findMinimumVertex(int [] distance, boolean [] visited){
        int minimumVertex = -1;
        for (int i = 0; i < distance.length; i++){
            if(!visited[i] && (minimumVertex == -1 || distance[i] < distance[minimumVertex])){
                minimumVertex = i;
            }
        }
        return minimumVertex;
    }
}
