import java.util.*;  // Ensure correct import of Java utilities

class Graph {
    private int vertices; // Number of vertices
    private ArrayList<ArrayList<Integer>> adjList; // Adjacency list

    // Constructor to initialize the graph with a given number of vertices
    public Graph(int v) {
        vertices = v;
        adjList = new ArrayList<>(v);

        // Initialize adjacency lists for each vertex
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Add an edge between two vertices (undirected graph)
    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest);
        adjList.get(dest).add(src); // Remove this line for directed graphs
    }

    // Iterative DFS using a Stack
    public void dfsIterative(int startVertex) {
        boolean[] visited = new boolean[vertices]; // Track visited vertices
        Stack<Integer> stack = new Stack<>(); // Stack for DFS traversal

        stack.push(startVertex); // Start DFS from the given vertex

        System.out.println("DFS (Iterative):");
        while (!stack.isEmpty()) {
            int vertex = stack.pop(); // Pop a vertex from the stack

            if (!visited[vertex]) {
                visited[vertex] = true; // Mark the vertex as visited
                System.out.print(vertex + " "); // Print the vertex

                // Push all unvisited neighbors onto the stack
                for (int neighbor : adjList.get(vertex)) {
                    if (!visited[neighbor]) {
                        stack.push(neighbor);
                    }
                }
            }
        }
        System.out.println(); // End of output
    }

    // Recursive DFS function
    private void dfsRecursive(int vertex, boolean[] visited) {
        visited[vertex] = true; // Mark the vertex as visited
        System.out.print(vertex + " "); // Print the vertex

        // Recurse for all adjacent vertices
        for (int neighbor : adjList.get(vertex)) {
            if (!visited[neighbor]) {
                dfsRecursive(neighbor, visited);
            }
        }
    }

    // Public method to start recursive DFS
    public void dfsRecursiveStart(int startVertex) {
        boolean[] visited = new boolean[vertices]; // Track visited vertices

        System.out.println("DFS (Recursive):");
        dfsRecursive(startVertex, visited); // Start DFS from the given vertex
        System.out.println(); // End of output
    }

    // Main method to run the DFS
    public static void main(String[] args) {
        Graph g = new Graph(5); // Graph with 5 vertices (0 to 4)

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);

        g.dfsIterative(0); // Start Iterative DFS from vertex 0
        g.dfsRecursiveStart(0); // Start Recursive DFS from vertex 0
    }
}
