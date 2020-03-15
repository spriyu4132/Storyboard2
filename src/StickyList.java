import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.Vector;

public class StickyList 
{
	private List<StickyNotes> list;
	Collection<StickyNotes>c=new Vector<StickyNotes>() ;

	public void setList(List<StickyNotes> arrayList) 
	{
		this.list=arrayList;
	}

	public void addRecord(StickyNotes s) 
	{
		/*for (Student student : s) 
		{
			this.list.add(student);
		}
		/*for(int i=0;i<list.size();i++)*/
			this.list.add(s);
	}

	public void printRecord() 
	{
		if(list!=null)
		{
			this.list.forEach(System.out::println);
		}
		
	}

	public StickyNotes findRecord(int i) 
	{
			if(this.list!=null)
			{
				for(StickyNotes st1:list)
					if(st1.getId()==i)
						return st1;
			}
		
		return null;
	}
	public boolean removeRecord(int i )
	{
		if( this.list != null )
		{
			StickyNotes key = new StickyNotes();
			key.setId(i);
			if( this.list.contains(key))
			{
				int index = this.list.indexOf(key);
				this.list.remove(index);
				return true;
			}
		}
		return false;
	}
	public StickyNotes accept() 
	{
		Scanner sc=new Scanner(System.in);
		StickyNotes s=new StickyNotes();
		System.out.println("Enter Id:=");
		s.setId(sc.nextInt());
		System.out.println("Enter Title:=");
		s.setTitle(sc.next());
		System.out.println("Enter Text:=");
		s.setText(sc.next());
		System.out.println("Enter Tag:=");
		s.setTag(sc.next());
		return s;
	}

	public void reverse() 
	{
		ListIterator<StickyNotes> itr = list.listIterator(list.size());
		StickyNotes ele=null;
		while(itr.hasPrevious())
		{
			ele=itr.previous();
			System.out.println(" "+ele); 
		}
		
	}

	public void addRecord(StickyNotes[] s) 
	{
		for (StickyNotes sticky : s) 
		{
			this.list.add(sticky);
		}
	}

	public StickyNotes findByTitle(String title) 
	{
		if(this.list!=null)
		{
			for(StickyNotes st1:list)
				if(st1.getTitle().equals(title))
					return st1;
		}
	
	return null;
	}
	

}
