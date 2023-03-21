/**
 * When and why do we use hashcode method? Two equal intances produce the same hash code.
 * Can two intances which are not equal have the same hashcode?
 * Please explain your answers briefly.
 */
public class HashCode {
}

/*
is an integer representation of an
object that can be used to efficiently store and retrieve objects in a hash-based data structure,
such as a HashMap or HashSet.

The hashCode() method is used by these data structures to determine the initial bucket location where an
object will be stored, based on its hash code value. This initial bucket location is then used to quickly
locate the object in the data structure, rather than searching through all the elements.

Two equal instances of an object should always produce the same hash code, as the hash code should be
 based on the object's fields and state that determine its equality with other objects.
 This ensures that the equal objects are stored in the same bucket location, allowing efficient retrieval.

However, two instances which are not equal can still have the same hash code.
This is called a hash collision, and it can occur when two objects have different fields and states,
 but generate the same hash code. In this case, the data structure may need to use additional methods,
 such as equals(), to determine the correct object to retrieve from the bucket.

To minimize the risk of hash collisions, it is recommended to implement the hashCode()
method consistently with the equals() method, ensuring that two equal objects produce the same hash code,
and that two objects with different fields and states produce different hash codes whenever possible.
 */