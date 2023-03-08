package com.example.tpo_lab3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

class TherapistControllerTest {
    @Test
    void createTherapistControllerTest() {
        TherapistController therapistController = new TherapistController();
        Assertions.assertNotNull(therapistController);
    }

    @Test
    void checkAnswersTest() {
        TherapistController therapistController = new TherapistController();
        therapistController.fillDiseases();
        therapistController.checkAnswers(1, 1);
        List<Disease> diseases = therapistController.getDiseases();

        Assertions.assertEquals("Грипп", diseases.get(0).getName());
        Assertions.assertEquals("ОРВИ", diseases.get(1).getName());

        Disease disease = new Disease();
        for(int i = 0; i < diseases.size(); i++) {
            if(diseases.get(i).getName().equals("Грипп")) {
                disease = diseases.get(i);
            }
        }
        Assertions.assertEquals(1.0, disease.getProbability());

        for(int i = 0; i < diseases.size(); i++) {
            if(diseases.get(i).getName().equals("ОРВИ")) {
                disease = diseases.get(i);
            }
        }
        Assertions.assertEquals(0.5, disease.getProbability());
    }

}