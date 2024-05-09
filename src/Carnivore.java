
    interface Carnivore<T> {
        void eatMeat(T meat);
    }

    interface Herbivore<T> {
        void eatPlant(T plant);
    }

    interface Omnivore<T> extends Carnivore<T>, Herbivore<T> {
        void eatPlantAndMeat(T food);
    }
