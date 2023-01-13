package Data4;

import java.util.ArrayList;

public class Family {

    private ArrayList<Human> family = new ArrayList<>();

    @Override
    public String toString() {
        return "Семья: {" +
                 family +
                '}';
    }

    public ArrayList<Human> getFamily() {
        return family;
    }

    public void addPerson(Human person) {
        family.add(person);
    }

    private Human findPerson(int id) {
        for (Human human : family) {
            if (human.getId() == id)
                return human;
        }
        throw new IllegalStateException("Такого человека в семье нет");
    }

    public String findParents(Human person) {
        Human mother = findPerson(person.getMother());
        Human father = findPerson(person.getFather());
        return String.format("Ребенок: %s %s\nМать - %s\nОтец - %s", person.getName(), person.getSurname(), mother.toString(), father.toString());
    }

    public String findSpouse(Human person) {
        Human spouse = findPerson(person.getSpouse());
        return String.format("%s %s в браке с: %s", person.getName(), person.getSurname(), spouse.toString());
    }

    public void saveFamily(TextFormatS fileFormat, String fileName) {
        SaveAs<TextFormatS> file = new SaveAs<>(fileFormat,fileName, family.toString());
    }
}
