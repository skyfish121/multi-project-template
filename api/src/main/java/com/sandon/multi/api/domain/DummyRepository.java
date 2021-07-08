package com.sandon.multi.api.domain;

import java.util.List;

public interface DummyRepository {

    Dummy save(Dummy dummy);

    List<Dummy> findAll();

}
