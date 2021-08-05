
import java.util.Arrays;


public class SelectionSort {
    public static void main(String[] args)
    {
      int[] a = ArrayUtil.randomIntArray(5, 15);
      System.out.println(Arrays.toString(a));
      SelectionSorter.sort(a);
      System.out.println(Arrays.toString(a));
    }
    public static void sort(int[] a)
    {
          for (int i = 0; i < a.length - 1; i++)
          {
             int minPos = minimumPosition(a, i);
             ArrayUtil.swap(a, minPos, i);
          }
    }
    private static int minimumPosition(int[] a, int from)
    {
       int minPos = from;
       for (int i = from + 1; i < a.length; i++)
       {
          if (a[i] < a[minPos]) { 
              minPos = i; 
          }
       }
       return minPos;
    }
    private static class SelectionSorter {
        private static void sort(int[] a) {}
        public SelectionSorter() {}
    }
    private static class ArrayUtil {
        private static int[] randomIntArray(int i, int i0) {return null;}
        private static void swap(int[] a, int minPos, int i){}
        public ArrayUtil() {}
    }
}