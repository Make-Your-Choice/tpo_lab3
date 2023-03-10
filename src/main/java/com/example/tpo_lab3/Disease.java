package com.example.tpo_lab3;

import java.util.ArrayList;
import java.util.List;

public class Disease {
    String name;
    String severity;
    double probability;
    List<List<String>> symptoms;

    public Disease() {
        symptoms = new ArrayList<List<String>>();
        probability = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public double getProbability() {
        return probability;
    }

    public void setProbability(double probability) {
        this.probability = probability;
    }

    public void addSymptom(List<String> symptom) {
        symptoms.add(symptom);
    }

    public List<List<String>> getSymptoms() {
        return symptoms;
    }

    public void checkSymptom(List<String> symptom) {
        for (List <String> symptomVal: symptoms) {
            if(symptomVal.get(0).equals(symptom.get(0))) {
                probability += 0.5;
                if(symptomVal.get(1).equals(symptom.get(1))) {
                    probability += 0.5;
                }
            }
        }
    }

    public double calculateProbabilityPercent() {
        return probability / symptoms.size() * 100;
    }
}
