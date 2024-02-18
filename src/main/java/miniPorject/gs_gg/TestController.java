package miniPorject.gs_gg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @Autowired

    @GetMapping("/api")
    public String testMethod() {
        return "test view";
    }

//    @GetMapping("/api/test")
    public Map<String, Object> testMethod2() {

        return Map.of("data1", "data1",
                        "data2", 2,
                        "data3", true);
    }
}
