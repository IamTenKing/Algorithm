package QuickSort;/** * @author: jt * @date: 2018-10-10 */public class QuickSort {    private static int length;    private static void quickSort(int[] a,int p,int r){        if(p<r){            int q = partition(a,p,r);            quickSort(a,p,q-1);            quickSort(a,q+1,r);        }    }    private static int partition(int[] a,int p,int r){        int x =a[r];        int i=p-1;        for (int j = p; j < r; j++) {            if(a[j]<x){                i++;                exchange(a,i,j);            }        }        exchange(a,i+1,r);        return i+1;    }    private static void exchange(int[] a, int i, int j) {        int temp=a[i];         a[i]=a[j];         a[j]=temp;    }     private static void Sort(int[] a){        if(a==null || a.length ==0){            return;        }        length=a.length;        quickSort(a,0,length-1);    }    public static void main(String[] args) {        int[] arr={9,5,6,12,0,10};        Sort(arr);        for (int i : arr) {            System.out.print(i+" ");        }    }}