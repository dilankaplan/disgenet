package com.example.disgenetplus.Business;
import com.example.disgenetplus.Entities.DiseaseModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class DiseaseManager implements  DiseaseService{
    @Value("${external.api.url}")
    private String baseUrl;

    @Value("${API_KEY}")
    private String API_KEY;
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DiseaseModel diseaseModel;

    @Override
    public DiseaseModel[] getAllDisease() {


        DiseaseModel[] result = restTemplate.getForObject(baseUrl+"/api/v1/disease"+API_KEY,DiseaseModel[].class);
        List<DiseaseModel> diseasesList = new ArrayList<>();
        diseasesList.stream().limit(10L).sorted().forEach(diseases ->
                System.out.format(" %8 %8 %8  %8 %8","Id","Symbol Of Gene","Score","Year Initial","Year Final"));
                System.out.println();
        System.out.format("%-18 %8 %8 %-12",diseaseModel.gene_ncbi_id(),diseaseModel.gene_symbol(),diseaseModel.max_score()-diseaseModel.min_score(),
                diseaseModel.yearFinal(),diseaseModel.yearInitial());

        System.out.println(result);

        return result;
        }




    }

