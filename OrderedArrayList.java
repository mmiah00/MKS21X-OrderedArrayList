import java.util.ArrayList;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  public OrderedArrayList () {
    super();
  }

  public OrderedArrayList (int startingCapacity) {
    super (startingCapacity);
  }

  public void add (T value) {
  }

  public boolean add (T value)  {
    return true;
  }

  public boolean compareTo (T val1, T val2) {
     return false;
  }
  
  public T set (int index, T value) {
    super.set (index, value);
  }
}
