import java.util.*;

public class node extends allNode{	
	protected int size;

	public node(String n){
		super(n);
		this.size = children.size();
	}

	public String getName(){
		return name;
	}

	public int getSize(){
		return size;
	}


	public ArrayList<GNode> getChildren(){
		if (children == null){
			ArrayList<GNode> n = new ArrayList<>();
			return n;
		} else {
			// int count = 0;
			// for (Gnode n: children) {
			// 	System.out.println("child's name " + count + ": " + n.getName());
			// 	count++;
			// }
			return children;
		}

	}

    public void addChild(GNode n){
    	children.add(n);
    }

/**
* @return an ArrayList of Gnode which contains every GNode in the graph. Each node 
* should appear in the ArrayList exactly once (i.e. no duplicates).
* @param n the start Gnode
*/
	public ArrayList<GNode> walkGraph(GNode n){
        HashSet<GNode> setVisited = new HashSet<GNode>();
        ArrayList<GNode> walk = new ArrayList<>();
        GNode currentNode = n;
        ArrayList<GNode> current = new ArrayList<>(); // all the children of node n
        ArrayList<GNode> next = new ArrayList<>();

        if (currentNode == null){
            return walk;
        }else{
            while(currentNode != null){
                current.add(currentNode);
                setVisited.add(currentNode);
                for (int i = 0; i < currentNode.getChildren().size(); i++){
                    setVisited.add(currentNode.getChildren().get(i));
                    next.add(currentNode.getChildren().get(i));
                }
                for (int check = 0; check < next.size(); check++){
                    if (current.contains(next.get(check))){
                        next.remove(check);
                    }
                }
                currentNode = next.get(0);   
            }
            for (GNode inSet : setVisited) {
                walk.add(inSet);
            }
            return walk;
        }
        
    }

/**
* some sort of recursive method should be implemented here since the depth of the graph 
* is unknown   
* @return an ArrayList of ArrayLists, representing all possible paths through the 
* graph starting at 'node'. The ArrayList returned can be thought of as a ArrayList 
* of paths, where each path is represented as an ArrayList of GNodes.
* @param node the start Gnode
*/
    public ArrayList paths(GNode node){
        ArrayList<ArrayList<GNode>> thePath = new ArrayList<>();
        ArrayList<GNode> child = node.getChildren();
        int count = 0;
        if (child.isEmpty()){
            ArrayList<GNode> temp = new ArrayList<>();
            temp.add(node);
            thePath.add(temp);
        } else {
            while (count < child.size()){
                if (!(child.get(count).getChildren().isEmpty())){
                //totalPath = totalPath + child.get(k).getChildren().size();
                    for (int s = 0; s < child.get(count).getChildren().size(); s++){
                        ArrayList<GNode> temp = new ArrayList<>();
                        temp.add(node);
                        temp.add(child.get(count));
                        temp.add(child.get(count).getChildren().get(s));
                        thePath.add(temp);
                    }
                } else {
                    ArrayList<GNode> temp = new ArrayList<>();
                    temp.add(node);
                    temp.add(child.get(count));
                    thePath.add(temp);
                }
                count++;
            }
        }
        return thePath;
    }


// /**
// * some sort of recursive method should be implemented here since the depth of the graph is unknown   
// * @return an ArrayList of paths, representing all possible paths through the 
// * graph starting at the child 'node'. The ArrayList returned can be thought of as a ArrayList 
// * of paths, where each path is represented as an ArrayList of GNodes.
// * @param node the start Gnode
// */
//     public ArrayList addPaths(Gnode parent, Gnode child){
//         ArrayList<Gnode> p = new ArrayList<>();
//         //ArrayList<ArrayList<Gnode>> allPaths = new ArrayList<>();
//         if (child == null){
//             p. add(parent);
//         }else{
//             p.add(parent);
//             p.add(child);
//         }
//         return p;
//     }
}
    