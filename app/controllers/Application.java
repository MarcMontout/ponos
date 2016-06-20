package controllers;

import play.mvc.*;

import views.html.*;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class Application extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render("Ponos"));
    }

    public Result monespace() {
        return ok(views.html.monespace.render("Mon espace"));
    }

    public Result espaceprof() {
        return ok(views.html.espaceprof.render("Espace professeur"));
    }

    public Result entrainer() {
        return ok(views.html.sentrainer.render("Entrainer"));
    }

    public Result login() {
        return ok(views.html.connexion.render("Connexion"));
    }

    public Result question1() {
        return ok(views.html.questions.q1.render("Question"));
    }

    public Result question2() {
        return ok(views.html.questions.q2.render("Question2"));
    }

    public Result question3() {
        return ok(views.html.questions.q3.render("Question3"));
    }

    public Result question4() {
        return ok(views.html.questions.q4.render("Question4"));
    }

    public Result question5() {
        return ok(views.html.questions.q5.render("Question5"));
    }

}
