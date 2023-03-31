package assignment.six.generics.generic;

public class Student<N> {
    private final N salary;

    public Student(N salary) {
        this.salary = salary;
    }

    public N getSalary() {
        return salary;
    }

}
