package com.example.tpo_lab3;

import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TherapistController implements Initializable {
    List<Disease> diseases = new ArrayList<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //заполнение справочника болезней
        //ОРВИ
        Disease disease = new Disease();
        disease.setName("ОРВИ");
        disease.setSeverity("Легкая");

        List<String> symptomsDisease = new ArrayList<>();

        symptomsDisease.add("Высокая температура");
        symptomsDisease.add("<=38");
        disease.addSymptom(symptomsDisease);

        symptomsDisease = new ArrayList<>();

        symptomsDisease.add("Кашель");
        symptomsDisease.add("Сухой");
        disease.addSymptom(symptomsDisease);

        symptomsDisease = new ArrayList<>();

        symptomsDisease.add("Боли в горле");
        symptomsDisease.add("Средние");
        disease.addSymptom(symptomsDisease);

        symptomsDisease = new ArrayList<>();

        symptomsDisease.add("Насморк");
        symptomsDisease.add("Сильная заложенность");
        disease.addSymptom(symptomsDisease);

        diseases.add(disease);

        //Грипп
        disease = new Disease();
        disease.setName("Грипп");
        disease.setSeverity("Средняя");

        symptomsDisease = new ArrayList<>();

        symptomsDisease.add("Высокая температура");
        symptomsDisease.add(">=38");
        disease.addSymptom(symptomsDisease);

        symptomsDisease = new ArrayList<>();

        symptomsDisease.add("Слабость");
        symptomsDisease.add("Сильная");
        disease.addSymptom(symptomsDisease);

        symptomsDisease = new ArrayList<>();

        symptomsDisease.add("Кашель");
        symptomsDisease.add("Влажный");
        disease.addSymptom(symptomsDisease);

        symptomsDisease = new ArrayList<>();

        symptomsDisease.add("Боли в горле");
        symptomsDisease.add("Сильные");
        disease.addSymptom(symptomsDisease);

        symptomsDisease = new ArrayList<>();

        symptomsDisease.add("Одышка");
        symptomsDisease.add("Слабая");
        disease.addSymptom(symptomsDisease);

        diseases.add(disease);

        //Артериальная гипертония
        disease = new Disease();
        disease.setName("Артериальная гипертония");
        disease.setSeverity("Высокая");

        symptomsDisease = new ArrayList<>();

        symptomsDisease.add("Высокое арткриальное давление");
        symptomsDisease.add(">=140");
        disease.addSymptom(symptomsDisease);

        symptomsDisease = new ArrayList<>();

        symptomsDisease.add("Головная боль");
        symptomsDisease.add("Средняя");
        disease.addSymptom(symptomsDisease);

        symptomsDisease = new ArrayList<>();

        symptomsDisease.add("Тошнота");
        symptomsDisease.add("Средняя");
        disease.addSymptom(symptomsDisease);

        symptomsDisease = new ArrayList<>();

        symptomsDisease.add("Шум в ушах");
        symptomsDisease.add("Слабый");
        disease.addSymptom(symptomsDisease);

        symptomsDisease = new ArrayList<>();

        symptomsDisease.add("Снижение остроты зрения");
        symptomsDisease.add("Слабое");
        disease.addSymptom(symptomsDisease);

        diseases.add(disease);

    }
}
