public interface Voiceable {

    String gimmeVoice();

    default void sing(String SongName){ //domyslna metoda
        defaultsinging(SongName);

    }
    private void defaultsinging(String Songname){
        System.out.println("Default singing: " + Songname);
    }

}
