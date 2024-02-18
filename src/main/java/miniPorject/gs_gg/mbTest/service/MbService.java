package miniPorject.gs_gg.mbTest.service;

import lombok.AllArgsConstructor;
import miniPorject.gs_gg.mbTest.mapper.MbMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class MbService {

    private final MbMapper mbMapper;

    public List<Map<String, Object>> mbtest() {
        return this.mbMapper.mbtest();
    }
}
