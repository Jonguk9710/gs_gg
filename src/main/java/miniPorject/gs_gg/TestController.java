package miniPorject.gs_gg;

import miniPorject.gs_gg.service.test.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @GetMapping("/api")
    public String testMethod() {
        return "test view";
    }

    @GetMapping("/api/test")
    public Map<String, Object> testMethod2() {

        return Map.of("data1", "data1",
                        "data2", 2,
                        "data3", true);
    }

    @GetMapping("/api/test3")
    public Map<String, Object> testMethod3() {
        System.out.println(" test 123 ");
        // 작업중
        Map<String, Object> test = testService.testSearch();
        System.out.println(" test tset " + test);
        return test;
    }

}
