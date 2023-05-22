package model;

public class Node {
    private Integer source;
    private Integer destination;
    private boolean isVisited;
    public Node (final Integer source, final  Integer destination, final boolean isVisited){
        this.source = source;
        this.destination = destination;
        this.isVisited = isVisited;
    }

    public Integer getSource() {
        return source;
    }

    public void setSource(Integer source) {
        this.source = source;
    }

    public Integer getDestination() {
        return destination;
    }

    public void setDestination(Integer destination) {
        this.destination = destination;
    }

    public boolean isVisited() {
        return isVisited;
    }

    public void setVisited(boolean visited) {
        isVisited = visited;
    }
}
