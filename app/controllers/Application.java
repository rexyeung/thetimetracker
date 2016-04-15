package controllers;

import models.Users;
import play.data.Form;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    Form<Users> userForm = Form.form(Users.class);

    public Result index() {
        return ok(home.render());
    }

    public Result contact() {
        return ok(contact.render(userForm));
    }

    public Status save() {

        Form<Users> boundForm = userForm.bindFromRequest();
        Users user = boundForm.get();

        flash("Done");
        return ok("okay");
    }

}
