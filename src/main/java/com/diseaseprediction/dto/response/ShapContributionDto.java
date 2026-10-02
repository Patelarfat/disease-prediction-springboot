package com.diseaseprediction.dto.response;

public class ShapContributionDto {

    private String symptom;
    private Double shapValue;
    private String direction;
    private Boolean selected;

    public ShapContributionDto() {
    }

    public ShapContributionDto(String symptom, Double shapValue, String direction, Boolean selected) {
        this.symptom = symptom;
        this.shapValue = shapValue;
        this.direction = direction;
        this.selected = selected;
    }

    public String getSymptom() {
        return symptom;
    }

    public void setSymptom(String symptom) {
        this.symptom = symptom;
    }

    public Double getShapValue() {
        return shapValue;
    }

    public void setShapValue(Double shapValue) {
        this.shapValue = shapValue;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }
}
