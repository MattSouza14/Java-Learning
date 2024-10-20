package entities;

public class Pessoa {
   private String name;
   private Integer age;

    public Pessoa(String name, Integer age) {
        super();
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Meu nome é "
                + name
                + " e tenho "
                + age
                + " anos";
    }
}
