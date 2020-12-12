package entity;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(schema = "public", name = "breed")
public class Breed {
    private long id;
    private String breedName;
    private List<Cat> cats;

    public Breed() {
    }

    @Id
    @Column(name = "id", nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "breedName", nullable = false, length = 100)
    public String getBreedName() {
        return breedName;
    }

    public void setBreedName(String breedName) {
        this.breedName = breedName;
    }

    @OneToMany(mappedBy = "breed", cascade = {CascadeType.ALL})
    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Breed breed = (Breed) o;
        return id == breed.id &&
                Objects.equals(breedName, breed.breedName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, breedName);
    }
}
