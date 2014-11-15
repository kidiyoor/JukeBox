
public class jukebox
{
public static void main(String args[])
{
Dlist songs =new Dlist();
System.out.println("entering song path ........ ");

char[] path="C:\Users\KiDiYoOr\Music\BEST SONGS\english";

songs.insert("C:\\Users\\KiDiYoOr\\Music\\BEST SONGS\\english","dangeorous");
songs.display();

 Path pathAbsolute = Paths.get("/var/data/stuff/xyz.dat");
        Path pathBase = Paths.get("/var/data");
        Path pathRelative = pathBase.relativize(pathAbsolute);
        System.out.println(pathRelative);
		  }
}
/*
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {

     public static void main(String[] args) {
        Path pathAbsolute = Paths.get("/var/data/stuff/xyz.dat");
        Path pathBase = Paths.get("/var/data");
        Path pathRelative = pathBase.relativize(pathAbsolute);
        System.out.println(pathRelative);
    }

}
*/