package com.diseaseprediction.dto.response;

import java.util.List;

public class PredictionExplanationResponse {

    private String method;
    private String summary;
    private String disclaimer;
    private List<String> selectedSymptoms;
    private List<ShapContributionDto> positiveContributors;
    private List<ShapContributionDto> negativeContributors;
    private List<ModelFeatureImportanceDto> modelImportantSymptoms;

    public PredictionExplanationResponse() {
    }

    public PredictionExplanationResponse(String summary, String disclaimer,
                                         List<String> selectedSymptoms,
                                         List<ModelFeatureImportanceDto> modelImportantSymptoms) {
        this.method = "SHAP TreeExplainer";
        this.summary = summary;
        this.disclaimer = disclaimer;
        this.selectedSymptoms = selectedSymptoms;
        this.modelImportantSymptoms = modelImportantSymptoms;
    }

    public PredictionExplanationResponse(String method, String summary, String disclaimer,
                                         List<String> selectedSymptoms,
                                         List<ShapContributionDto> positiveContributors,
                                         List<ShapContributionDto> negativeContributors,
                                         List<ModelFeatureImportanceDto> modelImportantSymptoms) {
        this.method = method;
        this.summary = summary;
        this.disclaimer = disclaimer;
        this.selectedSymptoms = selectedSymptoms;
        this.positiveContributors = positiveContributors;
        this.negativeContributors = negativeContributors;
        this.modelImportantSymptoms = modelImportantSymptoms;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public List<String> getSelectedSymptoms() {
        return selectedSymptoms;
    }

    public void setSelectedSymptoms(List<String> selectedSymptoms) {
        this.selectedSymptoms = selectedSymptoms;
    }

    public List<ShapContributionDto> getPositiveContributors() {
        return positiveContributors;
    }

    public void setPositiveContributors(List<ShapContributionDto> positiveContributors) {
        this.positiveContributors = positiveContributors;
    }

    public List<ShapContributionDto> getNegativeContributors() {
        return negativeContributors;
    }

    public void setNegativeContributors(List<ShapContributionDto> negativeContributors) {
        this.negativeContributors = negativeContributors;
    }

    public List<ModelFeatureImportanceDto> getModelImportantSymptoms() {
        return modelImportantSymptoms;
    }

    public void setModelImportantSymptoms(List<ModelFeatureImportanceDto> modelImportantSymptoms) {
        this.modelImportantSymptoms = modelImportantSymptoms;
    }
}
