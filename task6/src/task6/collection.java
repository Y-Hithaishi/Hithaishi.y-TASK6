package task6;
import java.util.ArrayList;
import java.util.Arrays;
 class DataList<E> 
{
  private int s = 0;
  private static final int DEFAULT_CAPACITY = 10;
  private Object elements[];
  public DataList() {
      elements = new Object[DEFAULT_CAPACITY];
  }
  public void add(E e) {
      if (s == elements.length) {
          ensureCapacity();
      }
      elements[s++] = e;
  }
  public E get(int i) {
      if (i >= s|| i < 0) {
          throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
      }
      return (E) elements[i];
  }
  public E remove(int i) {
      if (i >= s|| i < 0) {
          throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
      }
      Object item = elements[i];
      int num = elements.length - ( i + 1 ) ;
      System.arraycopy( elements, i + 1, elements, i, num ) ;
      s--;
      return (E) item;
  }
  public int size() {
      return s;
  }
  public String toString() 
  {
       StringBuilder sb = new StringBuilder();
       sb.append('[');
       for(int i = 0; i < s ;i++) {
           sb.append(elements[i].toString());
           if(i<s-1){
               sb.append(",");
           }
       }
       sb.append(']');
       return sb.toString();
  }
   
  private void ensureCapacity() {
      int newSize = elements.length * 2;
      elements = Arrays.copyOf(elements, newSize);
  }
}
public class collection {
		  public static void main(String[] args) 
		  {
			 
		      DataList<Integer> l = new DataList<Integer>();
		DataList<String> sList=new DataList<String>();
		      l.add(3);
		      l.add(4);
		      l.add(6);
		      l.add(9);
		      l.add(1);
		      l.add(8);

		      l.add(1);
		      l.add(2);
		      l.add(5);

		      l.add(0);
		      l.add(7);
		      l.add(1);
		      sList.add("kitkat");
		      sList.add("peak");
		      sList.add(" milk bar");
		      sList.add("five star");
		      sList.add("Dairy milk");
		      System.out.println("Elements in String List : "+sList);
		      System.out.println("Elements in the Integer List: "+l);
		       
		   
		     
		      
		      l.remove(2);
		      
		      System.out.println("Elements after removing: "+l);
		      
		      System.out.println( "Element at 0TH INDEX : "+l.get(2) );
		      System.out.println("Element at 1ST INDEX : "+ l.get(6) );
		      System.out.println("Element at 5TH INDEX : "+ l.get(10) );
		      System.out.println("SIZE OF THE STRING LIST : "+sList.size());
		      System.out.println("SIZE OF THE INTEGER LIST : "+l.size());
		  }
}