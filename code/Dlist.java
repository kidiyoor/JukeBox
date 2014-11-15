import java.io.File;
public class Dlist
 {
   
	 dnode dlist;

    public Dlist()
	 {
        this.dlist = null;
    }

    public void insert(String src , String sn) 
	 {
	 File songSrc = new File(src);
	  dnode song = new dnode(songSrc,sn);
        if (dlist == null)
		   {
            dlist = song;
   		}

 		  else 
			{
           dnode temp;
			  temp=dlist;
			  while(temp.right!=null)
			  {
			  temp=temp.right;
			  }
           song.left=temp;
			  temp.right=song;
			}

    }

    public void delete(File src) 
   	{
		  if (dlist == null) 
		  {
                       
        }
		
		dnode temp=dlist;
		if(dlist.right==null)
		{ 
		if (dlist.equals(src) ) 
		  {
            dlist = null;
			            
        }
		}
		else
		{
		while(temp.right!=null&&(!temp.equals(src)))
		{
			temp=temp.right;
   	}
		  if (temp.equals(src) ) 
		  {
    		temp.left.right = temp.right;
				temp.right.left=temp.left;
         }
		
		} 
	}
    public void display() {
	    dnode temp = dlist;

        while (temp!= null) 
		  {
            System.out.print(temp.songName + "\n ");
            temp = temp.right;
        }

    }
	 }