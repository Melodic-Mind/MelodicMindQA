package helpers;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileHelper {

    public static void takeSnapShot(WebDriver webDriver) throws Exception{

        //Convert web driver object to TakeScreenshot
        TakesScreenshot scrShot =((TakesScreenshot)webDriver);

        //Call getScreenshotAs method to create image file
        File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Create new file name
        SimpleDateFormat formatter= new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());
        String curDate = formatter.format(date);
        String currentDate = curDate.replace(":", "-");
        String filePath = "test_logs/screenshots/screenshot_" + currentDate +".png";

        //Move image file to new destination
        File DestFile=new File(filePath);
        try {
            Files.copy(SrcFile, DestFile);
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }


    }
}
