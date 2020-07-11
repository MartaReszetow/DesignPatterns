package Builder.Zad1;

public class GameCharacter {

    String name;
    int health;
    int manna;
    int numberOfPoints;

    public GameCharacter(String name, int health, int manna, int numberOfPoints) {
        this.name = name;
        this.health = health;
        this.manna = manna;
        this.numberOfPoints = numberOfPoints;
    }



    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", manna=" + manna +
                ", numberOfPoints=" + numberOfPoints +
                '}';
    }

    public static class CharacterBuilder{
        private String name;
        private int health;
        private int manna;
        private int numberOfPoints;

        public CharacterBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public CharacterBuilder setHealth(int health) {
            this.health = health;
            return this;
        }

        public CharacterBuilder setManna(int manna) {
            this.manna = manna;
            return this;
        }

        public CharacterBuilder setNumberOfPoints(int numberOfPoints) {
            this.numberOfPoints = numberOfPoints;
            return this;
        }

        public GameCharacter createGameCharacter() {
            return new GameCharacter(name, health, manna, numberOfPoints);
        }
    };

}
