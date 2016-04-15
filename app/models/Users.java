package models;

import com.avaje.ebean.Model;
import play.mvc.Result;
import play.data.validation.Constraints;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by rexromoloyeung on 2016-01-13.
 */

@Entity
public class Users extends Model {

    @Id
    @Constraints.MinLength(10)
    public int uid;

    @Constraints.Required
    String email;

    String firstName;
    String lastName;
    String phoneNumber;

    public static Result saveit() {
        return null;
    }

}
