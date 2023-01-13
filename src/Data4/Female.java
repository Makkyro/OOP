package Data4;

public class Female extends Human {
    private int husband;
    private GenderType gender;

    public Female(String name, String surname, String patronimic, int birthYear, int birthMonth, int birthDay) {
//        super(name, surname, patronimic, birthYear, birthMonth, birthDay);
        this.gender = GenderType.female;
    }

    public Female(String name, String surname) {
        super(name, surname);
        this.gender = GenderType.female;
    }

    public Female() {
        this.gender = GenderType.female;
    }

    public String toString() {
        return super.toString() + ", женщина";
    }

    public int getHusband() {
        return husband;
    }

    public void setHusband(int husband) {
        this.husband = husband;
    }

    @Override
    public String getMatrimonialStatus() {
        if (getSpouse() == 0) {
            return "не замужем";
        } else {
            return "замужем";
        }
    }


}