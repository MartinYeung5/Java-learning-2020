import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest
{
	public static void main(String [] argv)
	{
		Set<String> set = new HashSet<String>();
		
		set.add("張三");
		set.add("王五");
		set.add("李四");
		set.add("張三");
		
		//建立Iterator，Iterator的是針對在不同的物件(陣列、鏈結、雜湊集合)的公開存取介面
		//Iterator會先到物件內部收集資料再回傳到Iterator
		Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
	}
}
