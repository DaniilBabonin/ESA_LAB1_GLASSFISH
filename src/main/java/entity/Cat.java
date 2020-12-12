package entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(schema = "public", name = "cat")
public class Cat {
    private String name;
    private String color;
    private int age;
    private Breed breed;

    public Cat() {
    }

    @Id
    @Column(name = "name", nullable = false, length = 50)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "color", nullable = false, length = 50)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Column(name = "age", nullable = false)
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @ManyToOne(fetch = FetchType.EAGER, optional = false, cascade = {CascadeType.ALL})
    @JoinColumn(name = "breed_id")
    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age &&
                Objects.equals(name, cat.name) &&
                Objects.equals(color, cat.color);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(name, color, age);
    }
}