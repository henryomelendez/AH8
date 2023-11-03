
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
    int i = 0;
   while (curr != null && i < index){
     curr = curr.next;
     i++;
   }
   if(curr == null){
      return  null;
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

    Node<String> a = new Node<>("a");
    Node<String> b = new Node<>("b");
    Node<String> c = new Node<>("c");
    Node<String> d = new Node<>("d");

    a.next = b;
    b.next = c;
    c.next = d;

// a -> b -> c -> d

    System.out.println(ECSource.getNodeValue(a, 7)); // null
  }
}