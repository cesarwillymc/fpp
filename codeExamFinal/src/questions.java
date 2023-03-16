public class questions {
}
/*
ArrayList: se usa cuando necesita una lista ordenada que permita el acceso a los elementos por índice,
y no necesita insertar o eliminar elementos en el medio de la lista con frecuencia.

Cola: se utiliza cuando se necesita una colección que represente una estructura de datos de cola,
con orden de acceso primero en entrar, primero en salir (FIFO). Puede usar una LinkedList como una cola
 o usar la interfaz Queue integrada con clases como ArrayDeque o PriorityQueue.

Pila: se utiliza cuando se necesita una colección que represente una estructura de datos de pila,
 con orden de acceso de último en entrar, primero en salir (LIFO). Puede usar una LinkedList como una
 pila o usar la clase Stack integrada.

HashMap: se usa cuando necesita una colección que permita búsquedas eficientes de clave-valor.
HashMap utiliza una tabla hash internamente para almacenar pares clave-valor y proporciona un rendimiento O(1)
 en tiempo constante para la mayoría de las operaciones como put, get y containsKey.

HashSet: se utiliza cuando se necesita una colección que represente un conjunto de elementos únicos,
sin un orden en particular. HashSet utiliza una tabla hash internamente para almacenar los elementos
y proporciona un rendimiento O(1) en tiempo constante para la mayoría de las operaciones, como agregar,
contener y eliminar.

TreeSet: se usa cuando necesita una colección que represente un conjunto ordenado de elementos únicos.
 TreeSet utiliza un árbol binario equilibrado (específicamente, un árbol rojo-negro) internamente
 para almacenar los elementos y proporciona un rendimiento O (log n) para la mayoría de las operaciones como
  agregar, contener y eliminar.

LinkedList: se usa cuando necesita una colección que permita inserciones y eliminaciones
frecuentes en el medio de la lista, y no necesita acceso aleatorio a elementos por índice. LinkedList usa
 una lista doblemente enlazada internamente para almacenar los elementos y proporciona un rendimiento O(1)
 de tiempo constante para la mayoría de las operaciones como addFirst, addLast, removeFirst y removeLast.

BST (Árbol de búsqueda binaria): se usa cuando necesita una colección que permita búsquedas, inserciones
y eliminaciones ordenadas eficientes basadas en una clave comparable. BST es una estructura de datos de
 árbol binario donde cada nodo tiene un hijo izquierdo y derecho, y el subárbol izquierdo contiene solo
 claves menores que la clave del nodo, mientras que el subárbol derecho contiene solo claves mayores que
  la clave del nodo. Esto proporciona rendimiento O(log n) para la mayoría de las operaciones como poner,
  obtener y eliminar.
 */

/*
ArrayList: is used when you need an ordered list that allows access to elements by index, and you don't need to frequently insert or remove elements in the middle of the list.
Queue: is used when you need a collection that represents a queue data structure, with first-in-first-out (FIFO) access order. You can use a LinkedList as a queue, or use the built-in Queue interface with classes like ArrayDeque or PriorityQueue.
Stack: is used when you need a collection that represents a stack data structure, with last-in-first-out (LIFO) access order. You can use a LinkedList as a stack, or use the built-in Stack class.
HashMap: is used when you need a collection that allows efficient key-value lookups. HashMap uses a hash table internally to store key-value pairs, and provides constant-time O(1) performance for most operations like put, get, and containsKey.
HashSet: is used when you need a collection that represents a set of unique elements, with no particular order. HashSet uses a hash table internally to store the elements, and provides constant-time O(1) performance for most operations like add, contains, and remove.
TreeSet: is used when you need a collection that represents a sorted set of unique elements. TreeSet uses a balanced binary tree (specifically, a red-black tree) internally to store the elements, and provides O(log n) performance for most operations like add, contains, and remove.
LinkedList: is used when you need a collection that allows frequent insertions and removals in the middle of the list, and you don't need random access to elements by index. LinkedList uses a doubly-linked list internally to store the elements, and provides constant-time O(1) performance for most operations like addFirst, addLast, removeFirst, and removeLast.
BST (Binary Search Tree): is used when you need a collection that allows efficient ordered lookups, insertions, and removals based on a comparable key. BST is a binary tree data structure where each node has a left and right child, and the left subtree contains only keys less than the node's key, while the right subtree contains only keys greater than the node's key. This provides O(log n) performance for most operations like put, get, and remove.
 */