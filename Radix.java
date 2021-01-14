
public class Radix {
    public static void main(String[] args) {
        System.out.println(nth(-3210, 0));
        System.out.println(nth(-3210, 1));
        System.out.println(nth(-3210, 2));
        System.out.println(nth(-3210, 3));

    }
    public static int nth(int n, int col) {
        return (Math.abs(n) / (int)(Math.pow(10, col))) % 10;
    }

    public static int length(int n) {
        if (n == 0) return 1;
        else return (int) (Math.log10(Math.abs(n)) + 1);
    }

    public static void merge( SortableLinkedList original, SortableLinkedList[]buckets){
        for (int i  = 0; i < buckets.length; i++){
            original.extend(buckets[i]);
        }
    }

    public static void radixSortSimple(SortableLinkedList data) {
        SortableLinkedList buckets[] = new SortableLinkedList[10];
        for (int i = 0; i <= 9; i++) buckets[i] = new SortableLinkedList();
        int passes = 0;
        int size = data.size();
        for (int i = 0; i < size; i++) {
            passes = Math.max(passes, data.get(0));
            // if we remove the first index, then this would maintain O(n) since we're getting the first index each time
            data.add(data.remove(0));
        }
        passes = length(passes);
        // we're gonnna be looping from 0 to one less than passes
        for (int digit=0; digit < passes; digit++) {
            for (int i = 0; i < size; i++) {
                buckets[nth(data.get(0), digit)].add(data.get(0));
                data.remove(0);
                //use same method we did before where we only take first index,keeping it as constant
            }
            merge(data, buckets);
        }
    }

    public static void radixSort(SortableLinkedList data){
        SortableLinkedList pos = new SortableLinkedList();
        SortableLinkedList neg = new SortableLinkedList();
        // fill em up
        for (int i = 0; i < data.size(); i++) {
            pos.add(data.get(0));
            data.add(data.remove(0));
        }
        radixSortSimple(pos);


    }





}
