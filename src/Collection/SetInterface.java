package Collection;



	import java.util.HashSet;
	import java.util.Iterator;
	import java.util.Set;

	public class SetInterface {

		public static void main(String[] args) {
			Set<Double> set = new HashSet<Double>();
			set.add(2.4);
			set.add(3.5);
			set.add(8.8);
			set.add(2.4);
			for(double d : set)
			{
				System.out.println(d);
			}
			Iterator itr = set.iterator();
			while(itr.hasNext())
			{
				System.out.println(itr.next());
			}
			}

	}


