
import java.util.*;

public class driver{
	public static void main(String[] args){
        ArrayList<GNode> myInt = new ArrayList<>();
        //myInt = null;
        // node one = new node("cookie");
        // node myNode = new node("sweet");
        // node two = new node("cake");
        // node three = new node("cupcake");
        // node four = new node("muffin");
        // myNode.addChild(one);
        // myNode.addChild(two);
        // myNode.addChild(three);
        // myNode.addChild(four);

        // one.addChild(two);
        // one.addChild(myNode);
        // two.addChild(myNode);
        // two.addChild(one);
        // three.addChild(myNode);
        // four.addChild(myNode);
       
        // HashSet<Gnode> setVisited = new HashSet<Gnode>();
        // ArrayList<Gnode> walk = new ArrayList<>();
        // Gnode currentNode = one;
        // ArrayList<Gnode> current = new ArrayList<>(); // all the children of node n
        // ArrayList<Gnode> next = new ArrayList<>();

        // if (currentNode == null){
        //     System.out.println(walk);
        // }else{
        //     current.add(currentNode);
        //     setVisited.add(currentNode);
        //     for (int i = 0; i < currentNode.getChildren().size(); i++){
        //         setVisited.add(currentNode.getChildren().get(i));
        //         next.add(currentNode.getChildren().get(i));
        //     }
        //     for (int check = 0; check < next.size(); check++){
        //         if (current.contains(next.get(check))){
        //             next.remove(check);
        //         }
        //     }
        //     currentNode = next.get(0);
        //     System.out.println(setVisited);
        //     System.out.println(next);
        //     System.out.println(currentNode);
        // }
        node a = new node("A");
        node b = new node("B");
        node c = new node("C");
        node d = new node("D");
        node e = new node("E");
        node f = new node("F");
        node g = new node("G");
        node h = new node("H");
        node i = new node("I");
        node j = new node("J");
        node l = new node("L");
        node m = new node("M");
        a.addChild(b);
        a.addChild(c);
        a.addChild(d);
        b.addChild(e);
        b.addChild(f);
        c.addChild(g);
        c.addChild(h);
        c.addChild(i);
        d.addChild(j);
        j.addChild(l);
        j.addChild(m);
        System.out.println(a.getChildren());
        System.out.println(b.getChildren());
        System.out.println(c.getChildren());
        System.out.println(d.getChildren());
        System.out.println(j.getChildren());

        
        
        // for (int k = 0; k < child.size(); k++){
            
        // }
            
        System.out.println(thePath);
        System.out.println(a.getChildren().size());

        //System.out.println(addPaths(b, b.getChildren().get(0)));


    }
}
