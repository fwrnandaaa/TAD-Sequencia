public class TadSequenciaLL {
    private Node head;
    private Node tail;
    int size;

    public static class Node{
        Object value;
        Node prev; 
        Node next;
        int rank;

        Node(Object value) {
            this.value = value;
            this.prev = null;
            this.next = null;
           
        }
    }

  public TadSequenciaLL(){
    head = new Node(null);
    tail = new Node(null);
    head.next = tail;
    tail.prev = head;
    size=0;
  }
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    if(size==0){
        return true;
    }
    return false;
  }
  public void insertFirst(Node O){
    O.next = head.next;
    O.prev = head;
    head.next.prev = O;
    head.next = O;
    size++;
   
  }
  public void verSequenciaLL(){
    Node current = head.next;
    while(current != tail){
      System.out.println(current.value);
      current = current.next;
    }
  }
  public Object first(){
    if(isEmpty()){
      throw new SequenciaLLExcecao("Sequencia vazia.");
    }
    return head.next.value;
  }
  public Object last(){
    if(isEmpty()){
      throw new SequenciaLLExcecao("Sequencia vazia.");
    }
    return tail.prev.value;
    
  } 
  public Object before(Node O){
    if(head.next == O){
      throw new SequenciaLLExcecao("Nó informado é o primeiro da sequencia.");
    }
    return O.prev.value;
  }
  public Object after(Node O){
    if(tail.prev == O){
      throw new SequenciaLLExcecao("Nó informado é o último da sequencia.");
    }
    return O.next.value;
  }
  public Object elemAtRank(int r){
    if(isEmpty()){
      throw new SequenciaLLExcecao("A sequencia vazia.");
    }
    if(r <= (size/2)){
      Node current = head.next;
      for(int i=0; i<=r; i++){
        current = current.next;
      }
      return current.value;
    }
    else{
      Node current = tail.prev;
      for(int i = size-1; i>=0;i--){
        current = current.prev;
      }
      return current.value;
      
    }
    
  }
}