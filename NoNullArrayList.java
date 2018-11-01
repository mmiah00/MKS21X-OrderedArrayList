import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList <T>{
  public NoNullArrayList (){
    super();
  }

  public NoNullArrayList (int startingCapacity) {
    super(startingCapacity);
  }

  public T set (int index, T value) {
    if (value == null) {
      throw new IllegalArgumentException ("Can't set a null");
    }
    else {
      super.set (index, value);
    }
    return value;
  }

  public void add (int index, T value) {
    if (value == null) {
      throw new IllegalArgumentException ("Can't add a null");
    }
    else {
      super.add (index, value);
    }
  }

  public boolean add (T value) {
    if (value == null) {
       throw new IllegalArgumentException ("Can't add a null");
    }
    else {
      super.add (value);
    }
    return true;
  }
  
}
