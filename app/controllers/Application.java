package controllers;

import controllers.pojos.Login;
import play.*;
import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }



    /*
     * GET /login
     */
    public static Result showLogin() {
        return ok(

                login.render(Form.form(Login.class))
        );
    }

    /*
     * POST /login
     */
    public static Result login() {
        Form<Login> loginForm = Form.form(Login.class).bindFromRequest();
        if (loginForm.hasErrors()) {
            return badRequest(login.render(loginForm));
        } else {
            session().clear();
            session("email", loginForm.get().username);
            return redirect(
                    routes.Application.index()
            );
        }
    }
}