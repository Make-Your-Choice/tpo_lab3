package com.example.tpo_lab3;

import java.util.ArrayList;
import java.util.List;

public class Disease {
    String name;
    String severity;
    List<List<String>> symptoms;

    public Disease() {
        symptoms = new ArrayList<List<String>>();
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

    public void addSymptom(List<String> symptom) {
        symptoms.add(symptom);
    }

    public List<List<String>> getSymptoms() {
        return symptoms;
    }
}
