#Sortieralgorithmen

###Bubblesort

```java
public void sort(int[] array) {
	boolean unsortiert = true;
	int tmp;

	while(unsortiert) {    
		unsortiert = false;
		for(int i = 0; i < array.length-1; i++)
			if(array[i] > array[i+1]) {
				tmp = array[i];
				array[i] = array[i + 1];
				array[i + 1] = tmp;
				unsortiert = true;
			}
	}
}
```

###Insertion Sort

```java
public void sort(int[] array) {
	int einsortieren;
	for (int i = 1; i < array.length; i++) {
		einsortieren = array[i];
		int j = i;
    while (j > 0 && array[j-1] > einsortieren) {	
       array[j] = array[j-1];
       j--;
    }
    array[j] = einsortieren;
  }
}
```
###Selection Sort

```java
public void sort(int[] array) {
	for (int i = 0; i < array.length - 1; i++){
		int min = array[i];
		int stelle = i;
		for (int j = i + 1; j < array.length; j++)
			if (array[j] < min) {
				min = array[j];
				stelle = j;
			}
		int temp = array[i];
		array[i] = min;
		array[stelle] = temp;
	}
}
```

###Merge Sort

```java
public class MergeSort {
    public void sort(int[] a) {
        int[] help = new int[a.length];
        System.arraycopy(a, 0, help, 0, a.length);
        mergeSort(help, a, 0, a.length);
    }

    protected void mergeSort(int[] src, int[] dest, int lo, int hi) {
        int length = hi - lo;
        if (length >= 2) {
            int mid = (lo + hi) / 2;
            mergeSort(dest, src, lo, mid);
            mergeSort(dest, src, mid, hi);
            merge(src, dest, lo, mid, hi);
        }
    }

    protected void merge(int[] src, int[] dest, int lo, int mid, int hi) {
        int leftEnd = mid - 1;
        int tmpPos = lo;
        
        while( lo <= leftEnd && mid <= hi-1 )
            if( src[lo] <= src[mid] )
                dest[tmpPos++] = src[lo++];
            else
                dest[tmpPos++] = src[mid++];
        
        while( lo <= leftEnd )    
            dest[tmpPos++] = src[lo++];
        
        while( mid <= hi-1 )
            dest[tmpPos++] = src[mid++];
		}
}
```
