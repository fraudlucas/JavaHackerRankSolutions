package java8.dataStructures.priorityQueue;


import java.util.*;

/*
 * Create the Student and Priorities classes here.
 */
class Student implements Comparable<Student> {

    private final int id;
    private final String name;
    private final double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getCgpa() {
        return this.cgpa;
    }

    @Override
    public int compareTo(Student other) {
        if (this.cgpa > other.getCgpa()) return -1;
        if (this.cgpa < other.getCgpa()) return 1;

        int compare = this.name.compareTo(other.getName());
        if (compare != 0) return compare;

        return other.getId() - this.id;
    }
}

class Priorities {


    PriorityQueue<Student> students = new PriorityQueue<>();
    static final int EVENT = 0;
    static final int NAME = 1;
    static final int CGPA = 2;

    static final int ID = 3;

    public List<Student> getStudents(List<String> events) {

        for (String event : events) {
            String[] e = event.split(" ");

            switch (e[EVENT]) {
                case "ENTER":
                    Student student = new Student(Integer.parseInt(e[ID]), e[NAME],
                            Double.parseDouble(e[CGPA]));
                    this.students.add(student);
                    break;
                case "SERVED":
                    this.students.poll();
                    break;
            }
        }

        ArrayList<Student> students = new ArrayList<>(this.students);
        Collections.sort(students);
        return students;
    }

}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getCgpa() + " " + st.getName() + " " + st.getId());
            }
        }
    }
}