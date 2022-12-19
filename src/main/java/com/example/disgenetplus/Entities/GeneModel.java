package com.example.disgenetplus.Entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeneModel implements Serializable {

    private String gene_ncbi_id;
    private String gene_ensembl_id;
    private String symbolOfGene;
    private String gene_free_text_search_string;
    private double min_dsi;
    private double max_dsi;
    private double min_dpi;
    private double max_dpi;
    private double max_pli;
    private int page_number;
    private String geneToVariants;

    public String symbolOfGene() {
        return symbolOfGene;
    }

    public GeneModel(){

    }
    public GeneModel(String gene_ncbi_id,String gene_ensembl_id,String symbolOfGene,String gene_free_text_search_string,
                     double min_dsi,double max_dsi,double min_dpi,double max_dpi,
                     double max_pli,String geneToVariants){
        this.gene_ncbi_id= gene_ncbi_id;
        this.gene_ensembl_id=gene_ensembl_id;
        this.gene_free_text_search_string=gene_free_text_search_string;
        this.min_dsi=min_dsi;
        this.max_dsi=max_dsi;
        this.min_dpi=min_dpi;
        this.max_dpi=max_dpi;
        this.max_pli=max_pli;
        this.symbolOfGene =symbolOfGene;
        this.geneToVariants = geneToVariants;

    }
    public String gene_ncbi_id() {
        return gene_ncbi_id;
    }

    public String gene_ensembl_id() {
        return gene_ensembl_id;
    }

    public GeneModel setGene_ensembl_id(String gene_ensembl_id) {
        this.gene_ensembl_id = gene_ensembl_id;
        return this;
    }
    public GeneModel setGene_ncbi_id(String gene_ncbi_id) {
        this.gene_ncbi_id = gene_ncbi_id;
        return this;
    }

    public GeneModel setSymbolOfGene(String symbolOfGene) {
        this.symbolOfGene = symbolOfGene;
        return this;
    }
    public String gene_free_text_search_string() {
        return gene_free_text_search_string;
    }

    public GeneModel setGene_free_text_search_string(String gene_free_text_search_string) {
        this.gene_free_text_search_string = gene_free_text_search_string;
        return this;
    }
    public double min_dsi() {
        return min_dsi;
    }

    public GeneModel setMin_dsi(double min_dsi) {
        this.min_dsi = min_dsi;
        return this;
    }
    public double max_dsi() {
        return max_dsi;
    }

    public GeneModel setMax_dsi(double max_dsi) {
        this.max_dsi = max_dsi;
        return this;
    }

    public double min_dpi() {
        return min_dpi;
    }

    public GeneModel setMin_dpi(double min_dpi) {
        this.min_dpi = min_dpi;
        return this;
    }
    public double max_dpi() {
        return max_dpi;
    }

    public GeneModel setMax_dpi(double max_dpi) {
        this.max_dpi = max_dpi;
        return this;
    }
    public double max_pli() {
        return max_pli;
    }

    public GeneModel setMax_pli(double max_pli) {
        this.max_pli = max_pli;
        return this;
    }






    public String geneToVariants() {
        return geneToVariants;
    }

    public GeneModel setGeneToVariants(String geneToVariants) {
        this.geneToVariants = geneToVariants;
        return this;
    }

}
