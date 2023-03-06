package com.example.tpo_lab3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiseaseTest {
    @Test
    void createTherapistTest() {
        Disease disease = new Disease();
        Assertions.assertNotNull(disease);
    }

}