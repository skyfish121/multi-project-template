package com.sandon.multi.api.data;

import com.sandon.multi.api.repository.Dummy;
import com.sandon.multi.api.repository.DummyRepository;
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
