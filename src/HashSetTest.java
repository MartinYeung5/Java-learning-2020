import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest
{
	public static void main(String [] argv)
	{
		Set<String> set = new HashSet<String>();
		
		set.add("�i�T");
		set.add("����");
		set.add("���|");
		set.add("�i�T");
		
		//�إ�Iterator�AIterator���O�w��b���P������(�}�C�B�쵲�B���궰�X)�����}�s������
		//Iterator�|���쪫�󤺳�������ƦA�^�Ǩ�Iterator
		Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
	}
}
