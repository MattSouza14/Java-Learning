package entities;

public class Emplyoee {
   private Integer id;
   private String name;
   private Double salary;
    public Emplyoee(){

    }
    public Emplyoee(Integer id,String name) {
        super();

        this.name = name;
        this.id = id;
    }
    public Emplyoee(Integer id,String name,Double salary) {
        super();
        this.salary = salary;
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double salaryIncrement(Double increment){
        return this.salary += this.salary * increment/100;
    }

    public String toString() {
        return   "Nome: "
                + name
                +", id:"
                + String.format("%d", id)
                + ", Salario "
                + String.format("%.2f", salary)
                + " R$ ";
    }

}
