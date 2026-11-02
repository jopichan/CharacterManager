import com.unpri.charactermanager.model.Character;
import com.unpri.charactermanager.model.CharacterManager;
import com.unpri.charactermanager.model.CharacterType;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        Character c1 = new Character(
                "Arthur",
                CharacterType.WARRIOR,
                5);

        Character c2 = new Character(
                "Merlin",
                CharacterType.MAGE,
                8);

        Character c3 = new Character(
                "Robin",
                CharacterType.ARCHER,
                4);

        manager.addCharacter(c1);
        manager.addCharacter(c2);
        manager.addCharacter(c3);

        System.out.println("=== DAFTAR CHARACTER ===");

        for (Character c : manager.getAllCharacters()) {
            System.out.println(c);
        }

        System.out.println("\n=== DEMO LEVEL UP ===");

        System.out.println("Sebelum Level Up:");
        System.out.println(c1);

        c1.levelUp();

        System.out.println("Sesudah Level Up:");
        System.out.println(c1);
    }
}