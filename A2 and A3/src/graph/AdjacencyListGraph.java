import java.util.*;
import java.util.stream.Collectors;

public class AdjacencyListGraph implements Graph {

  private Map<Vertex, List<Vertex>> adjacencyMapList = new HashMap<>();

  @Override
  public void addVertex(Vertex v) {
    // only add the vertex if it does not exist
    if (!adjacencyMapList.containsKey(v)) {
      adjacencyMapList.put(v, new ArrayList<>());
    }
  }

  @Override
  public void addEdge(Vertex v1, Vertex v2) {
    // only add an edge if the v1 and v2 vertex exist and the edge has not been
    // added
    if (adjacencyMapList.containsKey(v1) && adjacencyMapList.containsKey(v2) && !edgeExists(v1, v2)) {
      adjacencyMapList.get(v1).add(v2);
    }
  }

  @Override
  public boolean edgeExists(Vertex v1, Vertex v2) {
    // check whether v1 exists and it contains v2
    if (adjacencyMapList.containsKey(v1)) {
      return adjacencyMapList.get(v1).contains(v2);
    }
    return false;
  }

}
