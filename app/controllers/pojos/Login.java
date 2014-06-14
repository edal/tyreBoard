package controllers.pojos;


public class Login {
    public String username;
    public String password;

    public String validate() {
        if (username.isEmpty() && password.isEmpty()) {
            return "login.error.invalidUserOrPassword";
        }
        return null;
    }
}
