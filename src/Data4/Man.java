package Data4;

public class Man extends Human {
    private int wife;
    private GenderType gender;

    public Man(String name, String surname, String patronimic, int birthYear, int birthMonth, int birthDay) {
//        super(name, surname, patronimic, birthYear, birthMonth, birthDay);
        this.gender = GenderType.male;
    }

    public Man(String name, String surname) {
        super(name, surname);
        this.gender = GenderType.male;
    }

    public Man() {
        this.gender = GenderType.male;
    }

    public String toString() {
        return super.toString() + ", мужчина";
    }

    public int getWife() {
        return wife;
    }

    public void setWife(int wife) {
        this.wife = wife;
    }

    @Override
    public String getMatrimonialStatus() {
        if (getSpouse() == 0) {
            return "не женат";
        } else {
            return "женат";
        }
    }

}