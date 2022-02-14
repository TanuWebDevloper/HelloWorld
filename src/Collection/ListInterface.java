package Collection;


	
	

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class ListInterface {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			List<Integer> arr = new ArrayList<Integer>();
			List<Integer> Dub = new ArrayList<Integer>();
			arr.add(10);
			arr.add(30);
			arr.add(20);
			arr.add(10);
			for(Integer x : arr) {			
				if(Collections.frequency(arr, x)>1) {
			
					Dub.add(x);
		
					}		
			}
			System.out.println("Duplicate element is "+Dub);
	}
	}

