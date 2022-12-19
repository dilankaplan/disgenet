package com.example.disgenetplus.WebAPI;

import com.example.disgenetplus.Business.GeneService;
import com.example.disgenetplus.Entities.GeneModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(
        value = "/api/v1",
        method = RequestMethod.GET,
        produces="application/json")
@CrossOrigin("http://localhost:8080")
public class GeneController {
    @Autowired
    private GeneService geneService;

    @GetMapping("/gene")
    public GeneModel[] getAllDisease(@RequestHeader(value = "Accept") String acceptHeader,
                                     @RequestHeader(value="Authorization") String authorizationHeader
    ){
        GeneModel[] response =geneService.getAllGene();
        return response;
    }
}
