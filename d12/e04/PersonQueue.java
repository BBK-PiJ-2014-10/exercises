public interface PersonQueue {
    /**
    * Adds another person to the queue.
    */
    void insert(String person);

    /**
    * Removes a person from the queue.
    */
    String retrieve();
}