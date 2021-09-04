package ru.cherry.springhomework4.shell;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import ru.cherry.springhomework4.service.QuestionnaireService;

@ShellComponent
public class ShellService {

    private final QuestionnaireService questionnaireService;

    public ShellService(QuestionnaireService questionnaireService) {
        this.questionnaireService = questionnaireService;
    }

    @ShellMethod(value = "Start", key = {"s", "start"})
    public void start() {
        questionnaireService.runQuiz();
    }

}
