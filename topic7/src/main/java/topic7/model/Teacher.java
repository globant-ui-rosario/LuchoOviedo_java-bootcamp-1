package topic7.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "teacher")
public class Teacher {
    @Id
    @GeneratedValue
    @Column(name = "teacherid")
    private int teacherId;

    @Column(name ="firstname")
    private String firstName;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "dateofbirth")
    private Date dateOfBirth;

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
