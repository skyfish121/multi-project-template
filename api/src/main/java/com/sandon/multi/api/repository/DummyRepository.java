package com.sandon.multi.api.repository;

import java.util.List;

public interface DummyRepository {

    Dummy save(Dummy dummy);

    List<Dummy> findAll();

}
