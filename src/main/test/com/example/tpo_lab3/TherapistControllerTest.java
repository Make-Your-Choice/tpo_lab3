package com.example.tpo_lab3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TherapistControllerTest {
    @Test
    void createTherapistControllerTest() {
        TherapistController therapistController = new TherapistController();
        Assertions.assertNotNull(therapistController);
    }

}