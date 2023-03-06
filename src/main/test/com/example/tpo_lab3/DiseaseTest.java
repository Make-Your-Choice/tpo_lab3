package com.example.tpo_lab3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiseaseTest {
    @Test
    void createDiseaseTest() {
        Disease disease = new Disease();
        Assertions.assertNotNull(disease);
    }

    @Test
    void createSpecificDiseaseTest() {
        Disease disease = new Disease();
        disease.setName("Простуда");
        disease.setSeverity("Легкая");
        Assertions.assertEquals("Простуда", disease.getName());
        Assertions.assertEquals("Легкая", disease.getSeverity());
    }

    @Test
    void addSymptomsTest() {
        Disease disease = new Disease();
        String symptom = "Температура";
        disease.addSymptom(symptom);
        Assertions.assertEquals(symptom, disease.getSymptoms().get(0));
    }
}