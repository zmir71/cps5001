import java.util.*;


public class graph<T> {
    private final Map<T, List<T>> adjacencyList;

    public graph() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(T vertex) {
        adjacencyList.putIfAbsent(vertex, new ArrayList<>());
    }

    public void addEdge(T v1, T v2) {
        adjacencyList.putIfAbsent(v1, new ArrayList<>());
        adjacencyList.putIfAbsent(v2, new ArrayList<>());
        adjacencyList.get(v1).add(v2);
        adjacencyList.get(v2).add(v1);
    }

    public void removeVertex(T v1, T v2) {
        adjacencyList.remove(v1);
    }

    public void removeEdge(T v1, T v2) {
        adjacencyList.get(v1).remove(v1);
        adjacencyList.get(v2).remove(v2);
    }
}