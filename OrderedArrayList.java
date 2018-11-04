import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList () {
    super();
  }

  public OrderedArrayList (int startingCapacity) {
    super (startingCapacity);
  }

  public boolean add (T value)  {
    if (value == null) {
      throw new IllegalArgumentException ("Can't add a null");
    }
    int ans = 0;
    for (int x = 0; x < size (); x ++) {
      if (bigger (value, get (x))) {
        ans = x + 1;
      }
    }
    super.add (ans, value);
    return true;
  }

  public void add (int index, T value) {
    if (index < 0 || index > size ()) {
      throw new IndexOutOfBoundsException ("Check index");
    }
    add (value);
  }

  private boolean bigger (T val1, T val2) {
     // returns if first param is greater than second param
     return (val1.compareTo (val2) > 0);
  }
  
  public T set (int index, T value) {
    if (value == null) {
      throw new IllegalArgumentException ("Can't add a null");
    }
    if (index < 0 || index >= size ()) {
      throw new IndexOutOfBoundsException ("Check index");
    }
    T now = get (index);
    super.remove (index);
    add (value);
    return now;
  }

}
