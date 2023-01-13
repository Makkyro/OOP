package Data4;

public class Main {
    public final static GenderType male = GenderType.male;
    public final static GenderType female = GenderType.female;
    public final static TextFormatS fDoc = TextFormatS.doc;
    public final static TextFormatS fMd = TextFormatS.md;
    public final static TextFormatS fTxt = TextFormatS.txt;

    public static void main(String[] args) {


        Human<GenderType> person1 = new Human("Иван", "Иванов", "Петрович", 1977, 11, 3, male);
        Human<GenderType> person2 = new Human("Анна", "Иванова", "Cергеевна", 1982, 3, 30, female);
        Human<GenderType> person3 = new Human("Андрей", "Иванов", "Иванович", 2012, 12, 20, male);
        Human<GenderType> person4 = new Human("Мария", "Иванова", "Ивановна", 2007, 12, 05, female);
        Human<GenderType> person5 = new Human("Мария", "Петрова", "Сергеевна", 1984, 8, 03, female);
        Human<GenderType> person6 = new Human("Aнтон", "Петров", "Петрович", 1985, 11, 7, male);

        setMarry(person1, person2);

        Family ivanov = new Family();
        ivanov.addPerson(person1);
        ivanov.addPerson(person2);
        ivanov.addPerson(person3);
        ivanov.addPerson(person4);

        person3.setFather(person1);
        person3.setMother(person2);
        person4.setFather(person1);
        person4.setMother(person2);

        // вывод
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
        System.out.println();
        System.out.println(ivanov);
        ivanov.saveFamily(fDoc, "file1");
        ivanov.saveFamily(fMd, "file2");
        ivanov.saveFamily(fTxt, "file3");

        System.out.println(ivanov.findSpouse(person1));
        System.out.println(ivanov.findSpouse(person2));
        System.out.println();

        System.out.println(ivanov.findParents(person3));
        System.out.println();
        System.out.println(ivanov.findParents(person4));
        System.out.println();

        setMarry(person5, person6);

        Family petrov = new Family();
        petrov.addPerson(person5);
        petrov.addPerson(person6);

        // вывод
        System.out.println(person5);
        System.out.println(person6);
        System.out.println();
        System.out.println(petrov);

        System.out.println(petrov.findSpouse(person5));
        System.out.println(petrov.findSpouse(person6));
    }

    private static void setMarry(Human spouse1, Human spouse2) {
        spouse1.setMarried(spouse2);
    }

}