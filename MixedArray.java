package com.keyword;

import java.util.*;

public class MixedArray
{
    public static void MixedArrayBallon(int size,String array[])
    {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        ArrayList<String> list = new ArrayList<String>();
        for(int i=0;i<size;i++)
        {
            set.add(array[i]);
        }
        for(String stringSetElement : set)
        {
            int counter=0;
            for(String arrayElement : array)
            {
                if(stringSetElement.equals(arrayElement))
                {
                    counter++;
                }
            }
            while(counter!=0)
            {
                list.add(stringSetElement);
                counter--;
            }
        }
        System.out.println("The required list is "+list);
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = in.nextInt();
        String array[] = new String[size];
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++)
        {
            array[i] = in.next();
        }
        System.out.println("User Entered array is "+ Arrays.toString(array));
        MixedArrayBallon(size,array);

    }
}
