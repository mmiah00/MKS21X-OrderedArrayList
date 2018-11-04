import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList () {
    super();
  }

  public OrderedArrayList (int startingCapacity) {
    super (startingCapacity);
  }

  public void add (int index, T value) {
    super.add (index, value);
  }

  public boolean add (T value)  {
    super.add (value);
  }

  private boolean bigger (T val1, T val2) {
     // returns if first param is greater than second param
     return (val1.compareTo (val2) > 0);
  }

  private void sort (T value) {
    //function to sort the array
    int x = 0;
    while (x < size ()) {
      if (compare (value, get (x))) {
        super.add (x, value);
        x = size ();
      }
      else {
        x += 1;
      }
    }
  }


/*
  private void sort () {
    int x = 0;
    while (x < size ())  {
      T now = get (x);
      T next = get (x + 1);
      if (! bigger (now, next)) {
        set (x, next);
        set (x + 1, now);
      }
      x += 1;
    }
  }
*/

  public T set (int index, T value) {
    super.set (index, value);

  }

}
