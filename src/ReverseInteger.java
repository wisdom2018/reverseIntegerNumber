import java.util.Scanner;

/*
 * Reverse an integer number
 * according to translate an String to Integer
 * author:wisdom
 */
public class ReverseInteger
{
    public static void main(String args[]){
       int a[] = {49,38,65,97,76,13,27,49};
       quickSort(a);
        for (int i = 0; i <a.length ; i++) {
            System.out.print(a[i]+" ");
        }
    }


    public static void sort(int a[],int low,int high){
        int i,j,index;
        if(low>high){
            return ;
        }
        i=low;
        j=high;
        index = a[i];
        while(i<j)
        {
            while(i<j&&a[j]>=index){
                j--;
            }
            if(i<j)
                a[i++] = a[j];
            while(i<j&&a[i]<=index){
                i++;
            }
            a[j--] = a[i];
        }
        a[i] = index;
        sort(a,low,i-1);
        sort(a,i+1,high);

    }

    public static void quickSort(int a[]){
        sort(a,0,a.length-1);
    }
}

