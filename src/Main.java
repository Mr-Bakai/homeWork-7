public class Main {

    public static void main(String[] args) {
	// write your code here

    HavingSuperAbility[] havingSuperAbilities = { new Medic(), new Magic(), new Warrior()};
        for (int i = 0; i <havingSuperAbilities.length; i++) {
            havingSuperAbilities[i].applySuperAbility(""); // <----- is it okay ?

        }
    }
}
