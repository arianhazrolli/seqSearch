
public class seqSearch {

	/**
	 * @param args
	 */
	// kerkkimi i cili pergjijget me true/false
	public static boolean SeqSearch(int[] arr, int sValue) 
	{
		for (int i = 0; i <= arr.length-1; i++)
		    if (arr[i] == sValue)
			    return true;
		
		return false;    
	}
	
	public static int SeqSearchIndex(int[] arr, int sValue) 
	{
		int r = -1;
		for (int i = 0; i <= arr.length-1; i++)
	  	    if (arr[i] == sValue){
			    //System.out.println(i);
			    r=i;
			   
	  	    }
		
		if(r==-1) return -1;
		else return r;
	}
	
	// kerkimi me pergjigjen e indexit
	
	public static int SeqSearchSO2(int[] arr, int sValue) 
	{
		for(int index = 0; index < arr.length-1; index++)
			if (arr[index] == sValue && index > (arr.length * 0.2)) 
			{
				int tmp = arr[index];
				arr[index] = arr[index-1];
				arr[index-1] = tmp;
			    return index;
			 } 
			
			else {
			        if (arr[index] == sValue)
			        return index;}
		
		return -1;
	}

	
	
	public static boolean SeqSearchSO(int[] arr, int sValue) 
	{
		for(int index = 0; index <= arr.length-1; index++)
			if (arr[index] == sValue) {
			
				int tmp = arr[index];
				arr[index] = arr[index-1];
				arr[index-1] = tmp;
				
			return true;
		    }
		return false;
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int[] arr1 = {7,3,9,6,0,1,4,5,0,1};
			
				
			System.out.println( SeqSearchSO(arr1, 6));
	}

}
