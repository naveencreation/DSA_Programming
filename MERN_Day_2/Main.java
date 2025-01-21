import java.util.*;
public class Main{
    public static void addedge(ArrayList<Integer>[] graph,int src,int end){
        graph[src].add(end);
    }
    public static void display(ArrayList<Integer>[] graph){
        for(int i =0;i<5;i++){
            System.out.print(i+"-->");
            for(int nbr:graph[i]){
                System.out.print(nbr+" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[]){
        int vertices = 5;
        ArrayList<Integer>[] graph = new ArrayList[vertices];
        for(int i =0;i<vertices;i++){
            graph[i]= new ArrayList<>();
        }

        addedge(graph,0,1);
        addedge(graph,0,2);
        addedge(graph,1,0);
        addedge(graph,1,3);
        addedge(graph,2,0);
        addedge(graph,2,3);
        addedge(graph,2,4);
        addedge(graph,3,1);
        addedge(graph,3,2);
        addedge(graph,3,4);
        addedge(graph,4,2);
        addedge(graph,4,3);
        display(graph);
    }
}