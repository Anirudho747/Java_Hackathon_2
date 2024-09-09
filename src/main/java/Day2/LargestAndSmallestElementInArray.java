package Day2;

public class LargestAndSmallestElementInArray {

    public static void main(String[] args)
    {
        int a[] = {10,12,2,134,70,23,21,56,78,9,74};

        int Largest = Integer.MIN_VALUE;
        int Smallest = Integer.MAX_VALUE;

        for(int i=0;i<a.length;i++)
        {
            if(a[i]>Largest)
            {
                Largest = a[i];
            }

            if(a[i]<Smallest)
            {
                Smallest = a[i];
            }
        }

        System.out.println(Largest);
        System.out.println(Smallest);
    }
}
