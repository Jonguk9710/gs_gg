package miniPorject.gs_gg.service.test.impl;
import miniPorject.gs_gg.service.test.TestService;
import miniPorject.gs_gg.dao.test.TestDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.Map;



@Repository
public class TestServiceImpl implements TestService {

    @Autowired
    TestDAO testDAO;
// private final TestDAO testDAO;


    @Override
    public Map<String, Object> testSearch() {
          return testDAO.testSearch();
    }
}


