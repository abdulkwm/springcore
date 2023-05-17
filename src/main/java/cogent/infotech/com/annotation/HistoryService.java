package cogent.infotech.com.annotation;

import org.springframework.stereotype.Component;

//putting the name is optional
@Component("history")
public class HistoryService {
    public void store() {
        System.out.println("store the history");
    }
}
