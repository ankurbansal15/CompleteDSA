package graphs;

public class Edge{
    public int src;
    public int dest;
    public int wt;
    public Edge(int src, int dest){
        this.src = src;
        this.dest = dest;
        this.wt = 1;
    }
    public Edge(int src, int dest, int wt) {
        this.src = src;
        this.dest = dest;
        this.wt = wt;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "src=" + src +
                ", dest=" + dest +
                ", wt=" + wt +
                '}';
    }
}