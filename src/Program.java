import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Vector;

public class Program 
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) 
	{
		StickyList list=new StickyList();
		list.setList(new Vector<StickyNotes>());
		int[] id=new int[1];
		String[] title=new String[1];
		int ch;
		while((ch=Program.menu())!=0)
		{
			switch(ch)
			{
			case 1:
					StickyNotes s=list.accept();//Program.accept();
						list.addRecord(s);
				break;
			case 2:
					StickyNotes[] s1=Program.accept();
					list.addRecord(s1);
					break;
			case 3:
					list.printRecord();
					break;
			case 4:
					Program.acceptRecord(id);
					StickyNotes s2=list.findRecord(id[0]);
					Program.printRecord(s2);
					break;
			case 5:
					Program.acceptRecord(id);
					boolean remv=list.removeRecord(id[0]);
					Program.printRecord(remv);
					break;
			case 6:
				list.reverse();
				break;
			case 7:
				Program.acceptString(title);
				StickyNotes s3=list.findByTitle(title[0]);
				Program.printRecord(s3);
				break;
			}	
		}
	}
	private static void acceptString(String[] title) 
	{
		System.out.println("Enter Title:=");
		title[0]=(sc.next());
		
	}
	private static void printRecord(boolean remv) 
	{
		if(remv)
			System.out.println("Record Removed");
		else
			System.out.println("Record not Removed");
	}
	private static void acceptRecord(int[] rno) 
	{
		System.out.println("Enter Id to find:=");
		 rno[0]=sc.nextInt();
	}
	private static void printRecord(StickyNotes s1) 
	{
		if(s1!=null)
			System.out.println("Record Found"+s1.toString());
		else
			System.out.println("Record Not Found");
		
	}
	private static StickyNotes[] accept() 
	{
		StickyNotes[] s=new StickyNotes[5];
		s[0]=new StickyNotes(1,"pp","sssss","aaa");
		s[1]=new StickyNotes(2,"aa","eeeee","iii");
		s[2]=new StickyNotes(3,"bb","fffff","jjj");
		s[3]=new StickyNotes(4,"cc","ggggg","kkk");
		s[4]=new StickyNotes(5,"dd","hhhhh","lll");
	
		return s;
	}
	private static int menu() 
	{
		System.out.println("0.Exit");
		System.out.println("1.AcceptRecord");
		System.out.println("2.AddRecord");
		System.out.println("3.PrintRecord");
		System.out.println("4.FindRecord");
		System.out.println("5.RemoveRecord");
		System.out.println("6.Reverese");
		System.out.println("7.FindByTitle");
		System.out.println("Enter Choice:=");
		return sc.nextInt();
	}

}
