package day12.task3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task3 {

    public static void main(String[] args) {
        ArrayList<MusicBand> bands = new ArrayList<>();
        MusicBand mb1 = new MusicBand("Сплин", 2001);
        MusicBand mb2 = new MusicBand("ДДТ", 1998);
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

        Collections.shuffle(bands);
        for(MusicBand i: bands) {
            System.out.println(i.getName());
        }
        for(MusicBand i: groupsAfter2000(bands)) {
            System.out.println(i.getName());
        }
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> list = new ArrayList<>();
        for(MusicBand i : bands) {
            if(i.getYear()>2000){
                list.add(i);
            }
        }
        return list;
    }
}
