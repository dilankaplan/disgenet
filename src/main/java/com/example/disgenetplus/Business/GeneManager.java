package com.example.disgenetplus.Business;

import com.example.disgenetplus.Entities.DiseaseModel;
import com.example.disgenetplus.Entities.GeneModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class GeneManager implements GeneService{
    @Value("${external.api.url}")
    private String baseUrl;

    @Value("${API_KEY}")
    private String API_KEY;
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public GeneModel[] getAllGene() {

        GeneModel[] result = restTemplate.getForObject(baseUrl+"/api/v1/gene"+API_KEY,GeneModel[].class);
        System.out.println(result);

        return result;
    }
}
