package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.*;

import static co.com.choucair.certification.proyectobase.userinterface.SearchCoursePage.*;

public class Answer implements Question<Boolean> {
    private String question;

    public Answer(String question){
        this.question = question;
    }
    public static Answer toThe(String question){
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        //String nameCouse = Text.of(NAME_COURSE).viewedBy(actor).assString();
        //String nameCourse= Text.of(SearchCoursePage.NAME_COURSE)(actor).asString();

        String nameCourse = NAME_COURSE.resolveFor(actor).getText();
        if (question.equals(nameCourse)){
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
