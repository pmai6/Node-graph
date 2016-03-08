import java.util.*;

public abstract class allNode implements GNode{	
	protected String name;
	protected ArrayList<GNode> children = new ArrayList<>();

	public allNode(String n){
		this.name = n;
	}

	public abstract String getName();

	public abstract ArrayList<GNode> getChildren();

	public String toString() {
        return name;
    }
}
    