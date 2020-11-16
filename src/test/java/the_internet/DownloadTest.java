package the_internet;

import com.codeborne.selenide.*;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;

public class DownloadTest {

    SelenideElement helloWorldTextLink = $("a[href='download/hello_world.txt']");

    public void downloadFile() throws FileNotFoundException {
        helloWorldTextLink.download();
    }

}
