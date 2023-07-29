package Jule28;


import java.util.ArrayList;
import java.util.List;

public class FamilyTree {
    List<Human> familyList = new ArrayList<>();
    List<Human>  parentsList = new ArrayList<>();
    List<Human>  childrenList = new ArrayList<>();

    public void familyAdd(Human name){
        familyList.add(name);
    }
    public void ParentsAdd(Human name){
        parentsList.add(name);
    }
    public void childrenAdd(Human name){
        childrenList.add(name);
    }


}
