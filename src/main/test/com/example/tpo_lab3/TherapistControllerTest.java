package com.example.tpo_lab3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TherapistControllerTest {
    @Test
    void createTherapistTest() {
        Therapist therapist = new Therapist();
        Assertions.assertNotNull(therapist);
    }

}