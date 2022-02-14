package Collection;


	


	import java.util.HashMap;
	import java.util.Map;

	public class MapInterface {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Map<Integer,String> map = new HashMap<Integer,String>();
			map.put(1,"Dinesh");
			map.put(2,"Kumar");
			map.put(3, "Mohan");
			System.out.println(map.get(1));
			for(Map.Entry<Integer, String> entry : map.entrySet())
			{
				System.out.println("value is"+entry.getValue()+""+"key is"+entry.getKey());
			}
		}

	}

