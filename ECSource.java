
/*class Node<T> {
  T val;
  Node<T> next;
  
  public Node(T val) {
    this.val = val;
    this.next = null;
  }
}*/


class ECSource {
  public static <T> T getNodeValue(Node<T> head, int index) {
    // todo - note the return type, but don't overthink it
    Node<T> curr = head;
    for(int i = 0; i < index; i++){
      curr = curr.next;
    }

    return curr.val;
  }
  
  public static void main(String[] args) {
    Node<String> node1 = new Node<>("banana");
    Node<String> node2 = new Node<>("mango");
    Node<String> node3 = new Node<>("kiwi");

    node1.next = node2;
    node2.next = node3;

    // banana -> mango -> kiwi

    System.out.println(ECSource.getNodeValue(node1, 1));

    Node<String> node4 = new Node<>("banana");
    Node<String> node5 = new Node<>("mango");
    Node<String> node6 = new Node<>("kiwi");

    node4.next = node5;
    node5.next = node6;

// banana -> mango -> kiwi

    System.out.println(ECSource.getNodeValue(node1, 0)); // "banana"
  }
}