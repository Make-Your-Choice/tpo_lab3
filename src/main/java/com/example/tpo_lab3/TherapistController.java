package com.example.tpo_lab3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.*;

public class TherapistController implements Initializable {
    @FXML
    public Label questionLabel;
    @FXML
    public RadioButton firstRadioButton;
    @FXML
    public ToggleGroup answersGroup;
    @FXML
    public RadioButton secondRadioButton;
    @FXML
    public RadioButton thirdRadioButton;
    @FXML
    public Button nextButton;
    @FXML
    public Button restartButton;
    List<Disease> diseases = new ArrayList<>();
    List<List<String>> questions = new ArrayList<List<String>>();
    int questionNumber;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //заполнение справочника болезней
        fillDiseases();

        //заполнение списка вопросов
        fillQuestions();

        //загрузка первого вопроса
        questionLabel.setText(questions.get(0).get(0));
        firstRadioButton.setText(questions.get(0).get(1));
        secondRadioButton.setText(questions.get(0).get(2));
        thirdRadioButton.setText(questions.get(0).get(3));
        questionNumber = 1;

        restartButton.setVisible(false);
    }

    void checkAnswers(int questionNumber, int answerNumber) {
        switch (questionNumber) {
            case 1: {
                List<String> symptom = new ArrayList<>();
                symptom.add("Высокая температура");
                switch (answerNumber) {
                    case 1: {
                        symptom.add(">38");
                    } break;
                    case 2: {
                        symptom.add("<=38");
                    }
                }
                if(symptom.size() == 2) {
                    for (int i = 0; i < diseases.size(); i++) {
                        diseases.get(i).checkSymptom(symptom);
                    }
                }
            } break;
            case 2: {
                List<String> symptom = new ArrayList<>();
                symptom.add("Кашель");
                switch (answerNumber) {
                    case 1: {
                        symptom.add("Влажный");
                    } break;
                    case 2: {
                        symptom.add("Сухой");
                    }
                }
                if(symptom.size() == 2) {
                    for (int i = 0; i < diseases.size(); i++) {
                        diseases.get(i).checkSymptom(symptom);
                    }
                }
            } break;
            case 3: {
                List<String> symptom = new ArrayList<>();
                symptom.add("Боли в горле");
                switch (answerNumber) {
                    case 1: {
                        symptom.add("Слабые");
                    } break;
                    case 2: {
                        symptom.add("Сильные");
                    }
                }
                if(symptom.size() == 2) {
                    for (int i = 0; i < diseases.size(); i++) {
                        diseases.get(i).checkSymptom(symptom);
                    }
                }
            } break;
            case 4: {
                List<String> symptom = new ArrayList<>();
                symptom.add("Насморк");
                switch (answerNumber) {
                    case 1: {
                        symptom.add("Слабая заложенность");
                    } break;
                    case 2: {
                        symptom.add("Сильная заложенность");
                    }
                }
                if(symptom.size() == 2) {
                    for (int i = 0; i < diseases.size(); i++) {
                        diseases.get(i).checkSymptom(symptom);
                    }
                }
            } break;
            case 5: {
                List<String> symptom = new ArrayList<>();
                symptom.add("Слабость");
                switch (answerNumber) {
                    case 1: {
                        symptom.add("Слабая");
                    } break;
                    case 2: {
                        symptom.add("Сильная");
                    }
                }
                if(symptom.size() == 2) {
                    for (int i = 0; i < diseases.size(); i++) {
                        diseases.get(i).checkSymptom(symptom);
                    }
                }
            } break;
            case 6: {
                List<String> symptom = new ArrayList<>();
                symptom.add("Одышка");
                switch (answerNumber) {
                    case 1: {
                        symptom.add("Слабая");
                    } break;
                    case 2: {
                        symptom.add("Сильная");
                    }
                }
                if(symptom.size() == 2) {
                    for (int i = 0; i < diseases.size(); i++) {
                        diseases.get(i).checkSymptom(symptom);
                    }
                }
            } break;
            case 7: {
                List<String> symptom = new ArrayList<>();
                symptom.add("Высокое артериальное давление");
                switch (answerNumber) {
                    case 1: {
                        symptom.add(">140");
                    } break;
                    case 2: {
                        symptom.add("<=140");
                    }
                }
                if(symptom.size() == 2) {
                    for (int i = 0; i < diseases.size(); i++) {
                        diseases.get(i).checkSymptom(symptom);
                    }
                }
            } break;
            case 8: {
                List<String> symptom = new ArrayList<>();
                symptom.add("Головная боль");
                switch (answerNumber) {
                    case 1: {
                        symptom.add("Слабая");
                    } break;
                    case 2: {
                        symptom.add("Сильная");
                    }
                }
                if(symptom.size() == 2) {
                    for (int i = 0; i < diseases.size(); i++) {
                        diseases.get(i).checkSymptom(symptom);
                    }
                }
            } break;
            case 9: {
                List<String> symptom = new ArrayList<>();
                symptom.add("Тошнота");
                switch (answerNumber) {
                    case 1: {
                        symptom.add("Слабая");
                    } break;
                    case 2: {
                        symptom.add("Сильная");
                    }
                }
                if(symptom.size() == 2) {
                    for (int i = 0; i < diseases.size(); i++) {
                        diseases.get(i).checkSymptom(symptom);
                    }
                }
            } break;
            case 10: {
                List<String> symptom = new ArrayList<>();
                symptom.add("Шум в ушах");
                switch (answerNumber) {
                    case 1: {
                        symptom.add("Слабый");
                    } break;
                    case 2: {
                        symptom.add("Сильный");
                    }
                }
                if(symptom.size() == 2) {
                    for (int i = 0; i < diseases.size(); i++) {
                        diseases.get(i).checkSymptom(symptom);
                    }
                }
            } break;
            case 11: {
                List<String> symptom = new ArrayList<>();
                symptom.add("Снижение остроты зрения");
                switch (answerNumber) {
                    case 1: {
                        symptom.add("Слабое");
                    } break;
                    case 2: {
                        symptom.add("Сильное");
                    }
                }
                if(symptom.size() == 2) {
                    for (int i = 0; i < diseases.size(); i++) {
                        diseases.get(i).checkSymptom(symptom);
                    }
                }
            } break;
        }
        diseases.sort(Comparator.comparing(Disease::getProbability));
        Collections.reverse(diseases);
    }

    void showResults() throws IOException {
        restartButton.setVisible(true);
        nextButton.setDisable(true);

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("results.fxml"));
        Parent parent = fxmlLoader.load();
        ResultsController dialogController = fxmlLoader.<ResultsController>getController();
        dialogController.setDiseases(diseases);
        dialogController.showResults();

        Scene scene = new Scene(parent, 600, 400);
        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setScene(scene);
        stage.showAndWait();
    }

    public void onNextButtonClick(ActionEvent actionEvent) throws IOException {
        if(firstRadioButton.isSelected()) {
            checkAnswers(questionNumber, 1);
        } else if (secondRadioButton.isSelected()) {
            checkAnswers(questionNumber, 2);
        } else if (thirdRadioButton.isSelected()) {
            checkAnswers(questionNumber, 3);
        }
        if(questionNumber == questions.size()) {
            showResults();
        }
        else {
            questionLabel.setText(questions.get(questionNumber).get(0));
            firstRadioButton.setText(questions.get(questionNumber).get(1));
            secondRadioButton.setText(questions.get(questionNumber).get(2));
            thirdRadioButton.setText(questions.get(questionNumber).get(3));
            questionNumber++;
        }
    }

    public List<Disease> getDiseases() {
        return diseases;
    }

    public void fillDiseases() {
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
        symptomsDisease.add("Сильные");
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
        symptomsDisease.add(">38");
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

        symptomsDisease.add("Высокое артериальное давление");
        symptomsDisease.add(">140");
        disease.addSymptom(symptomsDisease);

        symptomsDisease = new ArrayList<>();

        symptomsDisease.add("Головная боль");
        symptomsDisease.add("Сильная");
        disease.addSymptom(symptomsDisease);

        symptomsDisease = new ArrayList<>();

        symptomsDisease.add("Тошнота");
        symptomsDisease.add("Сильная");
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

    public void fillQuestions() {
        //заполнение списка вопросов
        List <String> question = new ArrayList<>();

        question.add("Наблюдается ли у вас повышенная температура?");
        question.add("Да, >38 С");
        question.add("Да, <=38 C");
        question.add("Нет");
        questions.add(question);

        question = new ArrayList<>();
        question.add("Присутствует ли у вас кашель?");
        question.add("Да, влажный");
        question.add("Да, сухой");
        question.add("Нет");
        questions.add(question);

        question = new ArrayList<>();
        question.add("Присутствует ли у вас боль в горле?");
        question.add("Да, слабая");
        question.add("Да, сильная");
        question.add("Нет");
        questions.add(question);

        question = new ArrayList<>();
        question.add("Присутствует ли у вас насморк?");
        question.add("Да, со слабой заложенностью");
        question.add("Да, с сильной заложенностью");
        question.add("Нет");
        questions.add(question);

        question = new ArrayList<>();
        question.add("Наблюдается ли у вас слабость?");
        question.add("Да, слабая");
        question.add("Да, сильная");
        question.add("Нет");
        questions.add(question);

        question = new ArrayList<>();
        question.add("Присутствует ли у вас одышка?");
        question.add("Да, слабая");
        question.add("Да, сильная");
        question.add("Нет");
        questions.add(question);

        question = new ArrayList<>();
        question.add("Наблюдается ли у вас повышенное артериальное давление?");
        question.add("Да, >140");
        question.add("Да, <=140");
        question.add("Нет");
        questions.add(question);

        question = new ArrayList<>();
        question.add("Присутствуют ли у вас головные боли?");
        question.add("Да, слабые");
        question.add("Да, сильные");
        question.add("Нет");
        questions.add(question);

        question = new ArrayList<>();
        question.add("Наблюдается ли у вас тошнота?");
        question.add("Да, слабая");
        question.add("Да, сильная");
        question.add("Нет");
        questions.add(question);

        question = new ArrayList<>();
        question.add("Присутствует ли у вас шум в ушах?");
        question.add("Да, слабый");
        question.add("Да, сильный");
        question.add("Нет");
        questions.add(question);

        question = new ArrayList<>();
        question.add("Наблюдается ли у вас снижение остроты зрения?");
        question.add("Да, слабое");
        question.add("Да, сильное");
        question.add("Нет");
        questions.add(question);
    }

    public void onRestartButtonClick(ActionEvent actionEvent) {
        nextButton.setDisable(false);
        for(int i = 0; i < diseases.size(); i++) {
            diseases.get(i).setProbability(0);
        }
        questionLabel.setText(questions.get(0).get(0));
        firstRadioButton.setText(questions.get(0).get(1));
        secondRadioButton.setText(questions.get(0).get(2));
        thirdRadioButton.setText(questions.get(0).get(3));
        questionNumber = 1;
        restartButton.setVisible(false);
    }
}
