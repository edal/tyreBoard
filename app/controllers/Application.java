package controllers;

import controllers.pojos.Login;
import models.User;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.dashboard;
import views.html.login;

public class Application extends Controller {


    /*
     * GET  /
     *      /login
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
            models.User u = new User();
            u.username=loginForm.get().username;
            u.name="Sales Manager";

            return redirect(
                    routes.Application.dashboard(u.username)
            );
        }
    }

    public static Result dashboard(String username) {

            models.User user = new User();
            user.username=username;
            user.name="Sales Manager";

            return ok(dashboard.render(user));

    }

    /*
     * GET /forgotPassword
     */
    public static Result forgotPassword() {
        return TODO;
    }

    /*
     * GET /newUser
     */
    public static Result newUser() {
        return TODO;
    }
}