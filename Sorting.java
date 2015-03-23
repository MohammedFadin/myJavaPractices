/**
 * Created by mohammedfadin on 3/22/15.
 */
import java.util.Arrays;

public class Sorting
{
    /*
        Insertion, means insert a missplaced element
        between the previous elemens (in its correct position)
        {3,1,2,4,0}
     */
    public void insertionSort(int[] array)
    {
        for (int i = 1; i < array.length; i++)
        {
            int tmp = array[i];
            for (int j = i; j> 0 && tmp < array[j-1]; j--)
            {
                array[j] = array[j-1];
                array[j-1] = tmp;
            }
        }

        for(int elem : array)
        {
            System.out.println(elem);
        }
    }
}
