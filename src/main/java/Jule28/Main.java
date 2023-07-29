package Jule28;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //создал семью


        Human Igor = new Human("Igor", Gender.Мужской, null, null, "Irina", LocalDate.of(1977, 4, 6));
        Human Olga = new Human("Olga", Gender.Женский, null, null, "Irina", LocalDate.of(1978, 4, 6));
        Human Irina = new Human("Irina", Gender.Мужской, "Igor", "olga", "null", LocalDate.of(1999, 4, 6));


        // создал экземпляр FamilyTree
        FamilyTree family = new FamilyTree();

        // добавил семью в семейное древо
        family.familyAdd(Igor);
        family.familyAdd(Olga);
        family.familyAdd(Irina);


    }

}
