package Practice;

import org.apache.xmlbeans.impl.xpath.Path;
import org.junit.Assert;
import org.junit.Test;

import java.nio.file.Files;
import java.nio.file.Paths;

public class FileExistNew {
    /*
Class: FileExistTest
Method: isExist
Pick a file on your desktop
And verify if that file exist on your computer or not
 */
    @Test
    public void test(){
        String homeDirectory=System.getProperty("user.home");
        String path=homeDirectory+"\\OneDrive\\Desktop\\atiyeJava.png";
        boolean isExists=Files.exists(Paths.get(path));
        Assert.assertTrue(isExists);


    }
}
