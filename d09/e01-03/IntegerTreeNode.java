public class IntegerTreeNode {
    int value;
    IntegerTreeNode left;
    IntegerTreeNode right;

    public IntegerTreeNode(int number) {
        value = number;
    }

    public void add(int newNumber) {
        if (newNumber > this.value) {
            if (right == null) {
                right = new IntegerTreeNode(newNumber);
            } else {
                right.add(newNumber);
            }
        } else {
            if (left == null) {
                left = new IntegerTreeNode(newNumber);
            } else {
                left.add(newNumber);
            }
        }
    }

    public boolean contains(int n) {
        if (n == this.value) {
            return true;
        } else if (n > this.value) {
            if (right == null) {
                return false;
            } else {
                return right.contains(n);
            }
        } else {
            if (left == null) {
                return false;
            } else {
                return left.contains(n);
            }
        }
    }

    public int getMax() {
        if (right == null) {
            return this.value;
        } else {
            return right.getMax();
        }
    }

    public int getMin() {
        if (left == null) {
            return this.value;
        } else {
            return left.getMin();
        }
    }

    public String toString() {
        String representation = "[";
        representation += Integer.toString(this.value);
        if (left != null && right != null) {
            representation += " L" + left.toString();
            representation += " R" + right.toString();
        } else if (left != null && right == null) {
            representation += " L" + left.toString();
            representation += " R[]";
        } else if (right != null && left == null) {
            representation += " R" + right.toString();
            representation += " L[]";
        } else if (left == null && right == null) {
             representation += " L[]";
             representation += " R[]";
        }
        representation += "]";
        return representation;
    }

    public String toSimpleString() {
        String representation = "[";
        representation += Integer.toString(this.value);
        if (left != null && right != null) {
            representation += left.toSimpleString();
            representation += right.toSimpleString();
        } else if (right != null) {
            representation += right.toSimpleString();
        } else if (left != null) {
            representation += left.toSimpleString();
        }
        representation += "]";
        return representation;
    }

    public static void main(String [] args) {
        IntegerTreeNode node = new IntegerTreeNode(1);
        node.add(2);
        node.add(3);
        node.add(4);
        node.add(5);
        node.add(6);
        node.add(7);
        node.add(8);
        node.add(9);
        node.add(10);
        node.add(0);
        node.add(-1);
        node.add(-2);
        node.add(-3);
        node.add(-4);
        node.add(-5);
        System.out.println(node.getMin());
        System.out.println(node.getMax());

        System.out.println(node.toString());
        System.out.println(node.toSimpleString());
    }
}

