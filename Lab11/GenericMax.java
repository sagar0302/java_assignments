import java.util.*;

class GenericMax
{
    public static <T extends Comparable<T>> void Largest(T[] arr)
    {
        T element = arr[0];
        int pos = 0;

        for (int i = 1; i < arr.length; i++)
        {
            if (arr[i].compareTo(element) > 0)
            {
                element = arr[i];
                pos = i;
            }
        }

        System.out.println("Largest element: " + element + ", position: " + pos);
    }

    public static void main(String[] args)
    {
        Integer[] n = {10, 88, 23};
        Largest(n);

        String[] str = {"Apple", "Orange", "Banana"};
        Largest(str);
    }
}
