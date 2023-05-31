package task.three;
public class Main {
    public static void main(String[] args) {
        Song song = new Song(); //

        // Özellikleri ayarlayın
        song.setBaşlık("Geceler");
        song.setSanatçı("Elnare");
        song.setSüre(180);

        // Özellikleri ekrana yazdırın
        System.out.println("Başlık: " + song.getBaşlık());
        System.out.println("Sanatçı: " + song.getSanatçı());
        System.out.println("Süre: " + song.getSüreDakikaSaniye());
    }
}
