package comparable;


	


	import java.util.Comparator;

	public class StudentComparator implements Comparator{
		Bean_Class1 b1,b2;

		@Override
		public int compare(Object o1, Object o2) {
			b1 = (Bean_Class1)o1;
			b2 = (Bean_Class1)o2;
			if(b1.getId()==b2.getId())
			{
				return 0;
			}
			else if(b1.getId()>b2.getId())
			{
				return 1;
			}
			else
			{
				return -1;
			}
		}

	}


