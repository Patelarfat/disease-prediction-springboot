package com.diseaseprediction.dto.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class DiseasePredictionResponse {

    private String prediction;
    private Double probability;

    @JsonProperty("selected_symptoms")
    private List<String> selectedSymptoms;

    private String message;
    private String error;
    private PredictionExplanationResponse explanation;

    public DiseasePredictionResponse() {
    }

    public DiseasePredictionResponse(String prediction, Double probability, List<String> selectedSymptoms, String message) {
        this.prediction = prediction;
        this.probability = probability;
        this.selectedSymptoms = selectedSymptoms;
        this.message = message;
    }

    public DiseasePredictionResponse(String prediction, Double probability, List<String> selectedSymptoms, String message,
                                     PredictionExplanationResponse explanation) {
        this(prediction, probability, selectedSymptoms, message);
        this.explanation = explanation;
    }

    public String getPrediction() {
        return prediction;
    }

    public void setPrediction(String prediction) {
        this.prediction = prediction;
    }

    public Double getProbability() {
        return probability;
    }

    public void setProbability(Double probability) {
        this.probability = probability;
    }

    public List<String> getSelectedSymptoms() {
        return selectedSymptoms;
    }

    public void setSelectedSymptoms(List<String> selectedSymptoms) {
        this.selectedSymptoms = selectedSymptoms;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public PredictionExplanationResponse getExplanation() {
        return explanation;
    }

    public void setExplanation(PredictionExplanationResponse explanation) {
        this.explanation = explanation;
    }
}
