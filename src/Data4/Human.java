package Data4;

import java.time.LocalDate;
import java.time.Period;


public class Human<T> implements Child {
    private T gender;
    private static int count;
    private int id = 0;
    private String surname;
    private String name;
    private String patronimic;
    private int birthYear;
    private int birthMonth;
    private int birthDay;
    private int age;
    private int spouse;
    private int father;
    private int mother;


    static {
        Human.count = 0;
    }


    public Human(String name, String surname, String patronimic, int birthYear, int birthMonth,
                 int birthDay, T gender) {
        this.surname = surname;
        this.name = name;
        this.patronimic = patronimic;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.age = setAge(birthYear, birthMonth, birthDay);
        this.id = ++Human.count;
        this.gender = gender;
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.id = ++Human.count;
    }

    public Human() {
        this.id = ++Human.count;
    }

    public T getGender() {
        return gender;
    }

    public void setGender(T gender) {
        this.gender = gender;
    }

    public int setAge(int birthYear, int birthMonth, int birthDay) {
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);
        LocalDate currentDate = LocalDate.now();
        int age = Period.between(birthDate, currentDate).getYears();
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }


    public String getBirthday() {
        return "День рождения " + name + ' ' + surname + ": " + birthDay + '.' + birthMonth + '.' + birthYear;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void surname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBirthday(int birthDay, int birthMonth, int birthYear) {
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.age = setAge(birthYear, birthMonth, birthDay);
    }

    public int getSpouse() {
        return spouse;
    }

    public void setSpouse(int spouse) {
        this.spouse = spouse;
    }

    public void setMarried(Human spouse) {
        this.spouse = spouse.id;
        spouse.setSpouse(this.id);
    }

    public void setMother(Human mother) {
        this.mother = mother.id;
    }

    public int getFather() {
        return father;
    }

    public int getMother() {
        return mother;
    }

    public static void setCount(int count) {
        Human.count = count;
    }

    public void setFather(Human father) {
        this.father = father.id;
    }

    public int getId() {
        return id;
    }

    public String getMatrimonialStatus() {
        String text = "";
        String text2 = "";
        if (gender == GenderType.male) {
            text = "не женат";
            text2 = "женат";
        } else if (gender == GenderType.female) {
            text = "не замужем";
            text2 = "замужем";
        }
        if (spouse == 0) {
            return text;
        } else {
            return text2;
        }
    }

    @Override
    public String toString() {
        String text = "";
        if (gender == GenderType.male) {
            text = ", мужчина";
        } else if (gender == GenderType.female) {
            text = ", женщина";
        }

        return "id: " + id + ", " + name + ' ' + patronimic + ' ' + surname + ", " + age + " лет" + ", "
                + getMatrimonialStatus() + text;
    }
}