public class Osoba {

    private String name;
    private String surname;
    private int group;
    private String spec;

    public Osoba(String name, String surname, int group, String spec) {
        this.name = name;
        this.surname = surname;
        this.group = group;
        this.spec = spec;
    }

    public Osoba() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group=" + group +
                ", spec='" + spec + '\'' +
                '}';
    }
}
