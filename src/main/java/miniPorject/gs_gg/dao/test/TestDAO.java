package miniPorject.gs_gg.dao.test;

import org.springframework.stereotype.Repository;
import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Repository
@Mapper
public interface TestDAO {
    Map<String, Object> testSearch();
}

