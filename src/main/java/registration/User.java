package registration;

import com.googlecode.objectify.Key;
import com.googlecode.objectify.annotation.Entity;
import com.googlecode.objectify.annotation.Id;
import com.googlecode.objectify.annotation.Index;
import com.googlecode.objectify.annotation.Parent;

import java.lang.String;
import java.util.Date;
import java.util.List;

@Entity
public class User {
    @Id public Long id;

    public String name;
    public String surname;
    public String email;
    public String password;

    public User() {}

    public User(String name, String surname, String email, String password)
    {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
    }
}
