package too;

// Prime number 
public class Trial {

	public static void main(String[] args) {
		System.out.println("hello");
		//String[] arr = new String[5];
		//String[] arr1= new String[] {"ram", "shyam", "sundar"};
		//System.out.println(arr1.length);
		//for(int i =0;i<arr1.length;i++) {
			//System.out.println(arr1[i]);
		//}
		//int val= 2;
		//int remainder=0;
		/*
		 * for (int i=1;i<100;i++) { remainder=i%val; if (remainder==0) {
		 * System.out.println("even.." + i); } }
		 */
		long startTime= System.nanoTime();
		int i =899;
		
		int[] arr = new int[] {2,3,5,7,11,13,17,19,23,29};
		//int i1=899;
		int remain1=0;
		boolean prime1=true;
		int divisor1=1;
		
		for (int j=0; j<arr.length; j++) {
			remain1=i%arr[j];
			if(remain1==0) {
				prime1 = false;
				divisor1=arr[j];
				System.out.println("not prime");
				break;
			}
		}
		if (prime1==true) {
			//int remain=0;
			//int divisor =1;
			//boolean prime = true;
			for (int j=2;j<i;j++) {
				remain1= i%j;
				if(remain1==0) {
					prime1 = false;
					divisor1 = j;
					break;
				}
			}
			
		}
		if(prime1) {
			System.out.println(i + " is Prime");
		}else {
			System.out.println(i + " is not Prime");
			System.out.println(divisor1 + " is divisor");
		}	
		long elapsedTime= System.nanoTime() - startTime;
		System.out.println("Total Time taken.."+ elapsedTime + "/ 1000000 millisecond");
		
		/*
		 * long startTime1= System.nanoTime();
		 * 
		 * long elapsedTime1= System.nanoTime() - startTime1;
		 * System.out.println("Total Time taken.."+ elapsedTime1 +
		 * "/ 1000000 millisecond");
		 */
}
	
	
}
