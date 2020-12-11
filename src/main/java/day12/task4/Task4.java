package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<MusicBand> bands = new ArrayList<>();
        MusicBand mb1 = new MusicBand("Сплин", 2001, Arrays.asList("Ivan Ivanov","Den Ser"));
        MusicBand mb2 = new MusicBand("ДДТ", 1998, Arrays.asList("Nik Bin", "Zikky Ferz"));
        MusicBand mb3 = new MusicBand("Asap", 2005);
        MusicBand mb4 = new MusicBand("Аквариум", 1985);
        MusicBand mb5 = new MusicBand("Кино", 1990);
        MusicBand mb6 = new MusicBand("Nirvana", 1980);
        MusicBand mb7 = new MusicBand("Metallica", 1981);
        MusicBand mb8 = new MusicBand("The Doors", 2001);
        MusicBand mb9 = new MusicBand("Slayer", 2003);
        MusicBand mb10 = new MusicBand("Green Day", 1989);

        bands.add(mb1);
        bands.add(mb2);
        bands.add(mb3);
        bands.add(mb4);
        bands.add(mb5);
        bands.add(mb6);
        bands.add(mb7);
        bands.add(mb8);
        bands.add(mb9);
        bands.add(mb10);

        mb1.printMembers();
        mb2.printMembers();

        MusicBand.transferMembers(mb1,mb2);
        System.out.println("After transformation");
        mb1.printMembers();
        mb2.printMembers();

    }
}
