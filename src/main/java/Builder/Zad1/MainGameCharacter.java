package Builder.Zad1;

import java.util.ArrayList;
import java.util.List;

public class MainGameCharacter {
    public static void main(String[] args) {


        GameCharacter.CharacterBuilder character1 = new GameCharacter.CharacterBuilder();
        character1.setHealth(5)
                .setManna(10);

        GameCharacter.CharacterBuilder character2 = new GameCharacter.CharacterBuilder();
        character2.setHealth(5)
                .setManna(10);

        GameCharacter.CharacterBuilder character3 = new GameCharacter.CharacterBuilder();
        character3.setHealth(5)
                .setManna(10);

        GameCharacter.CharacterBuilder character4 = new GameCharacter.CharacterBuilder();
        character3
                .setManna(10)
                .setHealth(100)
                .setName("Jeży");


        List<GameCharacter> characterList = new ArrayList<>();
        characterList.add(character1.createGameCharacter());
        characterList.add(character2.createGameCharacter());
        characterList.add(character3.createGameCharacter());
        characterList.add(character4.createGameCharacter());

        for (GameCharacter singleCHaracter: characterList
             ) {
            System.out.println(singleCHaracter);
            
        }

        


    }
}
