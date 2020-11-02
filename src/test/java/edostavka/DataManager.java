package edostavka;

import lombok.Data;
import lombok.experimental.Accessors;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;

@Data
@Accessors(chain = true)
public class DataManager extends DataReader {
    @DataProvider
    public Object[][] dataForInput(){
        Object[][] data = new Object[5][2];
        data[0][0] = (By.xpath("//a[contains(text(),'Кофе молотый молотый')]"));
        data[0][1] = (By.xpath("//span[contains(text(),'353.65')]"));
        data[1][0] = (By.xpath("//a[contains(text(),'Чай зеленый «Матча» молотый, 100 г.')]"));
        data[1][1] = (By.xpath("//span[contains(text(),'211.9')]"));
        data[2][0] = (By.xpath("//a[contains(text(),'Кофе молотый «Lavazza» Qualita Oro, 250 г.')]"));
        data[2][1] = (By.xpath("//span[contains(text(),'64.2')]"));
        data[3][0] = (By.xpath("//a[contains(text(),'Кофе «Жокей» молотый, 250 г.')]"));
        data[3][1] = (By.xpath("//span[contains(text(),'21.96')]"));
        data[4][0] = (By.xpath("//a[contains(text(),'Кофе молотый «Жокей» традиционный, 250 г.')]"));
        data[4][1] = (By.xpath("//span[contains(text(),'20.36')]"));
        return data;
    }

}
