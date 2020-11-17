package the_internet;

import com.codeborne.selenide.*;

import java.io.FileNotFoundException;

import static com.codeborne.selenide.Selenide.$;

public class DownloadPage {

    SelenideElement helloWorldTextLink = $("a[href='download/some-file.txt']");

    public void downloadFile() throws FileNotFoundException {
        helloWorldTextLink.download();
    }

}
