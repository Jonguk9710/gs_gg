package miniPorject.gs_gg.mbTest.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MbMapper {
    List<Map<String, Object>> mbtest();
}
