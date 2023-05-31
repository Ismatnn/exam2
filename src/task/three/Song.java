package task.three;
public class Song {
    private String title;
    private String artist;
    private int duration;

    public String getBaşlık() {
        return title;
    }

    public void setBaşlık(String başlık) {
        this.title = başlık;
    }

    public String getSanatçı() {
        return artist;
    }

    public void setSanatçı(String sanatçı) {
        this.artist = sanatçı;
    }

    public int getSüre() {
        return duration;
    }

    public void setSüre(int süre) {
        this.duration = süre;
    }

    public String getSüreDakikaSaniye() {
        int dakika = duration / 60;
        int saniye = duration % 60;
        return dakika + " dakika " + saniye + " saniye";
    }
}
