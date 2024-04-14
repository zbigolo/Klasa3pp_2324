package Z4ElementsGUI;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

class Person{
    private String name;
    private int age;
    private boolean isStudent;
    private String numberTel;

    public Person() {
        setName("Joe");
        setAge(10);
        setStudent(false);
        setNumberTel("00000000000");

    }

    public Person(String name, int age, boolean isStudent, String numberTel) {
        this.name = name;
        this.age = age;
        this.isStudent = isStudent;
        this.numberTel = numberTel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public void setStudent(boolean student) {
        isStudent = student;
    }

    public String getNumberTel() {
        return numberTel;
    }

    public void setNumberTel(String numberTel) {
        this.numberTel = numberTel;
    }
}


public class Sample13_Table{


    public static void main(String[] args){
        JFrame frame = new JFrame();

        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person("Ken", 5, false,"11111111111"));
        people.add(new Person("Tom", 3, true,""));
        people.add(new Person("Susan", 2, false,"22222222222"));
        people.add(new Person("Mark",20, true,"33333333333"));
        people.add(new Person());

        String[] columnNames = {"Name", "Age", "Student","Telefon"};

     int countRow = people.size();
     int countColumn = columnNames.length;

     Person [] dane = new Person[countRow];

     for (int i = 0; i < people.size(); i++)
         dane[i] = people.get(i);

        Object[][] data = new Object[countRow][countColumn];

        for (int i = 0; i < countRow; i++) {
            data[i][0] = dane[i].getName();
            data[i][1] = dane[i].getAge();
            data[i][2] = dane[i].isStudent();
            data[i][3] = dane[i].getNumberTel();
        }

        JTable table = new JTable(data , columnNames);
      //  table.setRowHeight(100);
        table.setBackground(new Color(100,100,100));
        table.setForeground(Color.white);
        table.setShowGrid(false);

        JScrollPane scrollPanel =new JScrollPane(table);

        frame.add(scrollPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


    }
}
