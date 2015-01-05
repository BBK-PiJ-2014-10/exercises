/**
 * A node in a dynamic singly-linked list of Strings
 */
public class PointerPersonNode {
    private String name;
    private PointerPersonNode before;

    public PointerPersonNode(String txt) {
      name = txt;
      before = null;
    }

    /**
     * Returns the string in this node
     */
    public String getName() {
      return name;
    }

    /**
     * Set the next node to point to the given node
     */
    public void setBefore(PointerPersonNode node) {
      before = node;      
    }

    /**
     * Set the next node to point to the given node
     */
    public PointerPersonNode getBefore() {
      return before;      
    }
}