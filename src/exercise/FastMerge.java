public static void merge(Comparable[] a, int lo, int mid, int hi) {
	/***************************
	old merge
	***************************/
	/*int i = lo,j = mid+1;
	for(int k = lo; k<=hi; k++) {
		aux[k] = a[k];
	}
	for(int k = lo; k<=hi; k++) {
		if(i>mid) a[k] = aux[j++];
		else if (j>hi) a[k] = aux[i++];
		else if (less(aux[j],aux[i])) a[k] = aux[j++];
		else a[k] = aux[i++];
	}*/
	for (int i = lo; i <= mid; i++)  //FastMerge
		  aux[i] = a[i]; 
	   
	   for (int j = mid+1; j <= hi; j++)
		  aux[j] = a[hi-j+mid+1];
	  
	   int i = lo, j = hi; 
	   for (int k = lo; k <= hi; k++) 
		  if (less(aux[j], aux[i])) a[k] = aux[j--];
		  else                      a[k] = aux[i++];
}