import java.io.File;
class dnode
 {
 dnode right;
 dnode left;
 File src;
 int playCount;
 String songName;
 
 //File src = new File("C:/Users/59th Street Bridge Song.mp3"); 
  public dnode(File songSrc ,String sn)
  {
  	 this.src=songSrc;
  	 this.right=null;
    this.songName=sn;
	 this.playCount=0;
    this.left=null;
  }

 
}