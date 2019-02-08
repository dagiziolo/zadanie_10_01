import java.util.Objects;

public class Toy {
    private String nameToy;
    private long id;

    public Toy(String nameToy, long id) {
        this.nameToy = nameToy;
        this.id = id;
    }

    public String getNameToy() {
        return nameToy;
    }

    public void setNameToy(String nameToy) {
        this.nameToy = nameToy;
    }

    public long getId() {
        return id;
    }

    public void setId(int number) {
        this.id = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toy toy = (Toy) o;
        return id == toy.id &&
                nameToy.equals(toy.nameToy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameToy, id);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "nameToy='" + nameToy + '\'' +
                ", id=" + id +
                '}';
    }
}
