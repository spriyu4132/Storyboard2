

public class StickyNotes implements Comparable<StickyNotes>
{
	private int id;
	private String title;
	private String text;
	private String tag;
	public StickyNotes() 
	{
		// TODO Auto-generated constructor stub
	}
	public StickyNotes(int id,String title, String text, String tag) 
	{
		super();
		this.id=id;
		this.title = title;
		this.text = text;
		this.tag = tag;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() 
	{
		return title;
	}
	public void setTitle(String title) 
	{
		this.title = title;
	}
	public String getText() 
	{
		return text;
	}
	public void setText(String text) 
	{
		this.text = text;
	}
	public String getTag() 
	{
		return tag;
	}
	public void setTag(String tag) 
	{
		this.tag = tag;
	}
	@Override
	public String toString() 
	{
		//return super.toString();
		return String.format("%-10d%-10s%-15s%-12s",this.id,this.title,this.text,this.tag );
	}
	@Override
	public boolean equals(Object obj) 
	{
		//return super.equals(obj);
		if(obj!=null)
		{
			StickyNotes s=(StickyNotes) obj;
			if(this.title==s.title);
				return true;
		}
		return false;
	}
	@Override
	public int compareTo(StickyNotes arg0) 
	{
		return this.id - arg0.id;
	}
	
}
