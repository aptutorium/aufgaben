
# Termin 9

## Verkettete Liste

### Aufgabe 1
Die bisher gezeigte Implementierung der verketteten Liste soll um die folgenden Methoden ergänzt werden:
 
```java
public boolean contains(T obj)
public void addLast(T obj)
public boolean remove(T obj)
```

Orientieren Sie sich an der vorgegebenen Klasse `SinglyLinkedList`:
 
 ```java
public class SinglyLinkedList<T> {

  private int size = 0;
  Node<T> first = null;

  private static class Node<T> {
    T value;
    Node<T> next;

    private Node(T value, Node<T> next) {
      this.value = value;
      this.next = next;
    }
  }
}
```

![](./linked_list.png)

Welche Laufzeit haben die drei Methoden?
