package day12.task5;

public class MusicArtist {
    private String nameArtist;
    private String surnameArtist;
    private int age;

    public MusicArtist(String nameArtist, String surnameArtist, int age) {
        this.nameArtist = nameArtist;
        this.surnameArtist = surnameArtist;
        this.age = age;
    }

    public String getNameArtist() {
        return nameArtist;
    }

    public String getSurnameArtist() {
        return surnameArtist;
    }
}
