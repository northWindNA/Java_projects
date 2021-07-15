public class Person implements Comparable<Person>{
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (id != person.id) return false;
        return name.equals(person.name);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + name.hashCode();
        return result;
    }

    @Override
    public int compareTo(Person o) {
        if (this.name.length() > o.getName().length()) {
            return 1;
        }
        else if (this.name.length() < o.getName().length()) {
            return -1;
        } else {
            return 0;
        }
//        if (this.id > o.getId()) {
//            return 1;
//        }
//        else if (this.id < o.getId()) {
//            return -1;
//        } else {
//            return 0;
//        }
    }
}
