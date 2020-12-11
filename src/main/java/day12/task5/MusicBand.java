package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private final String name;
    private final int year;

    private List<MusicArtist> artistsList = new ArrayList<>();

    public MusicBand(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public MusicBand(String name, int year, List<MusicArtist> arrayList) {
        this.name = name;
        this.year = year;
        this.artistsList = arrayList;
    }

    public static void transferMembers(MusicBand musicBand1, MusicBand musicBand2) {
        List<MusicArtist> list = new ArrayList<>();
        list.addAll(musicBand1.getArtistsList());
        list.addAll(musicBand2.getArtistsList());
        musicBand2.setArtistsList(null);
        musicBand1.setArtistsList(list);
    }

    public void printMembers() {
        if (artistsList == null) {
            System.out.println("Нет артистов");
        } else {
            for (MusicArtist artist : artistsList) {
                System.out.println(artist.getNameArtist() + " " + artist.getSurnameArtist());
            }
        }
    }

    public int getYear() {
        return year;
    }

    public void setArtistsList(List<MusicArtist> artistsList) {
        this.artistsList = artistsList;
    }

    public List<MusicArtist> getArtistsList() {
        return artistsList;
    }
}