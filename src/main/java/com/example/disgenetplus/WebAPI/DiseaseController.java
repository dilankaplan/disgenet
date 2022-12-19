package com.example.disgenetplus.WebAPI;

import com.example.disgenetplus.Business.DiseaseService;
import com.example.disgenetplus.Entities.DiseaseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(
        value = "/api/v1",
        method = RequestMethod.GET,
        produces="application/json")
@CrossOrigin("http://localhost:8080")
public class DiseaseController {

    @Autowired
    private DiseaseService diseaseService;

    @GetMapping("/disease")
    public DiseaseModel[] getAllDisease(@RequestHeader(value = "Accept") String acceptHeader,
                                        @RequestHeader(value="Authorization") String authorizationHeader
    ){
        DiseaseModel[] response =diseaseService.getAllDisease();
        return response;
    }
}
