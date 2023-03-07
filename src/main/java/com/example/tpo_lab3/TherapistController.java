package com.example.tpo_lab3;

import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

import java.net.URL;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ResourceBundle;

public class TherapistController implements Initializable {
    List<Disease> diseases = new ArrayList<>();
    List<String> questions = new ArrayList<>();

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

        //заполнение списка вопросов
        questions.add("Наблюдается ли у вас повышенная температура?");
        questions.add("Присутствует ли у вас кашель?");
        questions.add("Присутствует ли у вас боль в горле?");
        questions.add("Присутствует ли у вас насморк?");
        questions.add("Наблюдается ли у вас слабость?");
        questions.add("Присутствует ли у вас одышка?");
        questions.add("Наблюдается ли у вас повышенное артериальное давление?");
        questions.add("Присутствуют ли у вас головные боли?");
        questions.add("Наблюдается ли у вас тошнота?");
        questions.add("Присутствует ли у вас шум в ушах?");
        questions.add("Наблюдается ли у вас снижение остроты зрения?");
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
    }

    void showResults() {
        //todo вывести модальное окно, где будут выводиться три наиболее вероятные болезни с процентным соотношением для каждой
    }
}
