package com.example.tpo_lab3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

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

        List<String> symptom = new ArrayList<>();
        symptom.add("Высокая температура");
        symptom.add("<=38");

        disease.addSymptom(symptom);

        Assertions.assertEquals(symptom, disease.getSymptoms().get(0));
    }

    @Test
    void checkSymptomTest() {
        Disease disease = new Disease();

        List<String> symptom = new ArrayList<>();
        symptom.add("Высокая температура");
        symptom.add("<=38");

        disease.addSymptom(symptom);
        disease.checkSymptom(symptom);

        Assertions.assertEquals(1.0, disease.getProbability());
    }

    @Test
    void checkProbabilityPercentCalculationTest() {
        Disease disease = new Disease();

        List<String> symptom = new ArrayList<>();
        symptom.add("Высокая температура");
        symptom.add("<=38");

        disease.addSymptom(symptom);

        symptom = new ArrayList<>();
        symptom.add("Кашель");
        symptom.add("Сухой");

        disease.addSymptom(symptom);
        disease.setProbability(1.0);

        Assertions.assertEquals(50.00, disease.calculateProbabilityPercent());
    }
}