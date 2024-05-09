
    public class Main {
        public static void main(String[] args) {
            Aquatic aquatic = new Aquatic();
            aquatic.eatMeat(Food.MEAT);  // Output: Aquatic is eating meat.
            aquatic.eatMeat(Food.PLANT); // Output: Aquatic cannot eat plant.

            Terrestrial terrestrial = new Terrestrial();
            terrestrial.eatMeat(Food.MEAT);     // Output: Terrestrial is eating meat.
            terrestrial.eatPlant(Food.PLANT);   // Output: Terrestrial is eating plant.
            terrestrial.eatPlantAndMeat(Food.BOTH); // Output: Terrestrial is eating both plant and meat.
        }
    }
