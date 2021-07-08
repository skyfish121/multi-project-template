package com.sandon.multi.api.data;

import com.sandon.multi.api.domain.Dummy;
import com.sandon.multi.api.domain.DummyRepository;
import java.util.List;
import javax.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@Transactional
@AllArgsConstructor
public class GetAllDummyData {

    private final DummyRepository dummyRepository;

    public List<Dummy> getAll() {
        return dummyRepository.findAll();
    }
}
