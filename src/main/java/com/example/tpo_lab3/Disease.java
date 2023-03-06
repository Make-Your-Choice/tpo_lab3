package com.example.tpo_lab3;

import java.util.ArrayList;
import java.util.List;

public class Disease {
    String name;
    String severity;
    List<String> symptoms;

    public Disease() {
        symptoms = new ArrayList<>();
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

    public void addSymptom(String symptom) {
        symptoms.add(symptom);
    }

    public List<String> getSymptoms() {
        return symptoms;
    }
}
