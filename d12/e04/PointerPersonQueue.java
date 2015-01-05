/**
 * Implementation of interface stack using a 
 * dynamic structure as support. 
 */
public class PointerPersonQueue implements PersonQueue {
    /**
     * The head of the stack: the visible node
     */
    private PointerPersonNode head;
    private PointerPersonNode first;
    private PointerPersonNode last;

    public PointerPersonQueue() {
      this.first = null;
      this.last = null;
    }

    public void insert(String name) {
      PointerPersonNode newPerson = new PointerPersonNode(name);
      if (this.last == null) {
        this.first = newPerson;
      } else {
        this.last.setBefore(newPerson);
      }
      this.last = newPerson;
    }

    public String retrieve() {
      if (this.first == null) {
        return null;
      }
      String result = this.first.getName();
      this.first = this.first.getBefore();
      return result;
    }
}