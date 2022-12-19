package com.example.disgenetplus.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class DiseaseModel implements Serializable {

    private String gene_ncbi_id;
    private String gene_ensembl_id;
    private String gene_symbol;
    private String source;
    private double min_score;
    private double max_score;
    private double min_ei;
    private double max_ei;
    private double min_dsi;
    private double max_dsi;
    private double min_dpi;
    private double max_dpi;
    private double max_pli;
    private String dis_class_list;
    private int page_number;
    private int yearInitial;
    private int yearFinal;

    public DiseaseModel(){

    }
   public DiseaseModel(String gene_ncbi_id,String gene_ensembl_id,String source,double min_ei,
                       double max_ei,double min_dsi,double max_dsi,double min_dpi,double max_dpi,
                       double max_pli,String dis_class_list,int page_number,String gene_symbol, double min_score,double max_score,int yearInitial, int yearFinal){
        this.gene_ensembl_id =gene_ensembl_id;
        this.gene_ncbi_id=gene_ncbi_id;
       this.source=source;
       this.min_ei =min_ei;
       this.max_ei =max_ei;
       this.min_dsi =min_dsi;
       this.max_dsi =max_dsi;
       this.min_dpi =min_dpi;
       this.max_dpi =max_dpi;
       this.max_pli =max_pli;
       this.dis_class_list =dis_class_list;
        this.gene_symbol =gene_symbol;
        this.min_score = min_score;
       this.max_score = max_score;
        this.yearInitial = yearInitial;
        this.yearFinal =yearFinal;
   }
    public String gene_ncbi_id() {
        return gene_ncbi_id;
    }

    public DiseaseModel setGene_ncbi_id(String gene_ncbi_id) {
        this.gene_ncbi_id = gene_ncbi_id;
        return this;
    }
    public String gene_ensembl_id() {
        return gene_ensembl_id;
    }

    public DiseaseModel setGene_ensembl_id(String gene_ensembl_id) {
        this.gene_ensembl_id = gene_ensembl_id;
        return this;
    }
    public String gene_symbol() {
        return gene_symbol;
    }

    public DiseaseModel setGene_symbol(String gene_symbol) {
        this.gene_symbol = gene_symbol;
        return this;
    }
    public String source() {
        return source;
    }

    public DiseaseModel setSource(String source) {
        this.source = source;
        return this;
    }
    public double min_ei() {
        return min_ei;
    }

    public DiseaseModel setMin_ei(double min_ei) {
        this.min_ei = min_ei;
        return this;
    }
    public double max_ei() {
        return max_ei;
    }

    public DiseaseModel setMax_ei(double max_ei) {
        this.max_ei = max_ei;
        return this;
    }
    public double min_dsi() {
        return min_dsi;
    }

    public DiseaseModel setMin_dsi(double min_dsi) {
        this.min_dsi = min_dsi;
        return this;
    }
    public double max_dsi() {
        return max_dsi;
    }

    public DiseaseModel setMax_dsi(double max_dsi) {
        this.max_dsi = max_dsi;
        return this;
    }

    public double min_dpi() {
        return min_dpi;
    }

    public DiseaseModel setMin_dpi(double min_dpi) {
        this.min_dpi = min_dpi;
        return this;
    }
    public double max_dpi() {
        return max_dpi;
    }

    public DiseaseModel setMax_dpi(double max_dpi) {
        this.max_dpi = max_dpi;
        return this;
    }
    public double max_pli() {
        return max_pli;
    }

    public DiseaseModel setMax_pli(double max_pli) {
        this.max_pli = max_pli;
        return this;
    }

    public String dis_class_list() {
        return dis_class_list;
    }

    public DiseaseModel setDis_class_list(String dis_class_list) {
        this.dis_class_list = dis_class_list;
        return this;
    }

    public int page_number() {
        return page_number;
    }

    public DiseaseModel setPage_number(int page_number) {
        this.page_number = page_number;
        return this;
    }

    public double min_score() {
        return min_score;
    }

    public DiseaseModel setMin_score(double min_score) {
        this.min_score = min_score;
        return this;
    }
    public double max_score() {
        return max_score;
    }

    public DiseaseModel setMax_score(double max_score) {
        this.max_score = max_score;
        return this;
    }
    public int yearInitial() {
        return yearInitial;
    }

    public DiseaseModel setYearInitial(int yearInitial) {
        this.yearInitial = yearInitial;
        return this;
    }
    public int yearFinal() {
        return yearFinal;
    }

    public DiseaseModel setYearFinal(int yearFinal) {
        this.yearFinal = yearFinal;
        return this;
    }


}
