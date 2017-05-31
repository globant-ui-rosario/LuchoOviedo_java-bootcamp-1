package topic7.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue
    @Column(name = "courseid")
    private int courseId;

    @Column(name="name")
    private String name;

    @ManyToMany
    @JsonBackReference
    @JoinTable(name = "evaluation",joinColumns = @JoinColumn(name = "courseid",referencedColumnName = "courseid"), inverseJoinColumns = @JoinColumn(name = "studentid",referencedColumnName = "studentid"))
    private List<Student> students = new ArrayList<Student>();

    public int getCourseId() {
        return courseId;
    }

    public String getName() {
        return name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}
