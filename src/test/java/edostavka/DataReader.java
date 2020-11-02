package edostavka;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class DataReader {
    protected  Object readFromFile(String path){
        return null;
    }
}
