package com.example.tpo_lab3;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ResultsController implements Initializable {
    @FXML
    public TextArea resultsTextArea;
    @FXML
    public Button okButton;
    List<Disease> diseases = new ArrayList<Disease>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    public List<Disease> getDiseases() {
        return diseases;
    }

    public void setDiseases(List<Disease> diseases) {
        this.diseases = diseases;
    }

    void showResults() {
        NumberFormat formatter = new DecimalFormat("#0.00");
        String resultText = "Наиболее вероятный диагноз\n";
        resultText += "\nНазвание: " + diseases.get(0).getName() + "\nВероятность: " + formatter.format(diseases.get(0).getProbability() / diseases.get(0).getSymptoms().size() * 100) + "%\n";
        resultText += "\nМенее вероятные диагнозы\n";
        for (int i = 1; i < diseases.size(); i++) {
            resultText += "\nНазвание: " + diseases.get(i).getName() + "\nВероятность: " + formatter.format(diseases.get(i).getProbability() / diseases.get(i).getSymptoms().size() * 100) + "%\n";
        }
        resultsTextArea.setText(resultText);
    }
}
