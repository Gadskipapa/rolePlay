package rpg;

import java.util.Scanner;

public class Demo {

    private static Squadron getSquadron(String type) {
        Squadron squadron = null;
        SquadronFactory squdronfactory;

        switch (type) {
            case "elf" :
                squdronfactory = new ElfSquadronFactiry();
                squadron = new Squadron(squdronfactory);
                break;

            case "orc":
                squdronfactory = new OrcSquadronFactory();
                squadron = new Squadron(squdronfactory);
                break;

            case "human":
                System.out.println("create human");
                break;
        }

        return squadron;

    }

    public static void main(String[] args) {
        System.out.println("Enter type");
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        Squadron squadron = getSquadron(type);
        squadron.fight();
    }
}
