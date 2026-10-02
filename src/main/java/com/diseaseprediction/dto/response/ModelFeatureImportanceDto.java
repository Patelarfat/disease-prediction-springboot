package com.diseaseprediction.dto.response;

public class ModelFeatureImportanceDto {

    private String symptom;
    private Double importance;

    public ModelFeatureImportanceDto() {
    }

    public ModelFeatureImportanceDto(String symptom, Double importance) {
        this.symptom = symptom;
        this.importance = importance;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public Double getImportance() {
        return importance;
    }

    public void setImportance(Double importance) {
        this.importance = importance;
    }
}
