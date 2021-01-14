public class ATester {
     public static void main(String[] args) {
          int[] negs = {-87,-1,-46,-7,-8,-22,0};
          SortableLinkedList test = new SortableLinkedList();
          for (int i : negs) test.add(i);
          System.out.println("Before: " + test);
          Radix.radixSortSimple(test);
          System.out.println("After: " + test);
     }
}
