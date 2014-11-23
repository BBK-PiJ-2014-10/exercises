/**
 * Implementation of interface stack using a 
 * dynamic structure as support. 
 */
public class PointerPersonQueue implements PersonQueue {
    /**
     * The head of the stack: the visible node
     */
    private PointerPersonNode head;

    public PointerPersonQueue() {
      first = null;
      last = null;
    }

    public void insert(String name) {
      PointerPersonNode newPerson = new PointerPersonNode(name);
      if (last == null) {
        first = newPerson;
      } else {
        last.setBefore(newPerson);
      }
      last = newPerson;
    }

    public String retrieve() {
      if (first == null) {
        return null;
      }
      first = first.getBefore();
      String result = first.getName();
      return result;
    }