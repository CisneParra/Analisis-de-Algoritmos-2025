/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4;

/**
 *
 * @author natsu
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Edge implements Comparable<Edge> {

    int src, dest, weight;

    Edge(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    public int compareTo(Edge other) {
        return this.weight - other.weight;
    }

    @Override
    public String toString() {
        return "(" + src + " - " + dest + ") Peso: " + weight;
    }
}

class Subset {

    int parent, rank;
}

public class RecubrimientoMinimoArbol {

    private int vertices;
    private List<Edge> edges = new ArrayList<>();

    public RecubrimientoMinimoArbol(int vertices) {
        this.vertices = vertices;
    }

    public void addEdge(int src, int dest, int weight) {
        edges.add(new Edge(src, dest, weight));
    }

    public void findMST() {
        List<Edge> result = new ArrayList<>();
        Collections.sort(edges);

        Subset[] subsets = new Subset[vertices];
        for (int v = 0; v < vertices; v++) {
            subsets[v] = new Subset();
            subsets[v].parent = v;
            subsets[v].rank = 0;
        }

        int index = 0;
        int i = 0;

        System.out.println("\n=== PROCESO DEL ALGORITMO DE KRUSKAL ===");

        while (index < vertices - 1 && i < edges.size()) {
            Edge nextEdge = edges.get(i++);
            int x = find(subsets, nextEdge.src);
            int y = find(subsets, nextEdge.dest);

            System.out.println("Evaluando arista: " + nextEdge);

            if (x != y) {
                result.add(nextEdge);
                union(subsets, x, y);
                index++;
                System.out.println("-> Arista añadida al MST");
            } else {
                System.out.println("-> Arista descartada (forma un ciclo)");
            }

            System.out.println("Árbol parcial: " + result + "\n");
        }

        System.out.println("=== ÁRBOL DE RECUBRIMIENTO MÍNIMO (MST) ===");
        int totalWeight = 0;
        for (Edge edge : result) {
            System.out.println(edge);
            totalWeight += edge.weight;
        }
        System.out.println("Peso total del MST: " + totalWeight);
    }

    private int find(Subset[] subsets, int i) {
        if (subsets[i].parent != i) {
            subsets[i].parent = find(subsets, subsets[i].parent);
        }
        return subsets[i].parent;
    }

    private void union(Subset[] subsets, int xroot, int yroot) {
        if (subsets[xroot].rank < subsets[yroot].rank) {
            subsets[xroot].parent = yroot;
        } else if (subsets[xroot].rank > subsets[yroot].rank) {
            subsets[yroot].parent = xroot;
        } else {
            subsets[yroot].parent = xroot;
            subsets[xroot].rank++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de vértices del grafo: ");
        int vertices = sc.nextInt();

        RecubrimientoMinimoArbol graph = new RecubrimientoMinimoArbol(vertices);

        System.out.print("Ingrese la cantidad de aristas: ");
        int numEdges = sc.nextInt();

        for (int i = 0; i < numEdges; i++) {
            System.out.println("Arista #" + (i + 1));
            System.out.print("Nodo origen: ");
            int src = sc.nextInt();
            System.out.print("Nodo destino: ");
            int dest = sc.nextInt();
            System.out.print("Peso de la arista: ");
            int weight = sc.nextInt();
            graph.addEdge(src, dest, weight);
        }

        graph.findMST();
    }
}


