package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private final String name;
    private final int year;

    private List<String> artistsList = new ArrayList<>();

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public MusicBand(String name, int year, List<String> arrayList) {
        this.name = name;
        this.year = year;
        this.artistsList = arrayList;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        List<String> list = new ArrayList<>();
        list.addAll(musicBand1.getArtistsList());
        list.addAll(musicBand2.getArtistsList());
        musicBand2.setArtistsList(null);
        musicBand1.setArtistsList(list);
    }

    public void printMembers() {
        if (artistsList == null) {
            System.out.println("Нет артистов");
        } else {
            for (String artist : artistsList) {
                System.out.println(artist);
            }
        }
    }

    public int getYear() {
        return year;
    }

    public void setArtistsList(List<String> artistsList) {
        this.artistsList = artistsList;
    }

    public List<String> getArtistsList() {
        return artistsList;
    }
}