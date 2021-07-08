package com.sandon.multi.api.controllers;

import com.sandon.multi.api.data.CreateDummyData;
import com.sandon.multi.api.data.GetAllDummyData;
import com.sandon.multi.api.controllers.forms.CreateDummyDataForm;
import com.sandon.multi.api.domain.Dummy;
import lombok.AllArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class DummyController {

    private final CreateDummyData createDummyData;

    private final GetAllDummyData getAllDummyData;

    @GetMapping(value = "/api/dummy", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Dummy> getAllDummyData() {
        return getAllDummyData.getAll();
    }

    @PostMapping(value = "/api/dummy", produces = MediaType.APPLICATION_JSON_VALUE)
    public Dummy createDummyData(@RequestBody CreateDummyDataForm createDummyDataForm) {
        return createDummyData.create(createDummyDataForm.toDummy());
    }
}