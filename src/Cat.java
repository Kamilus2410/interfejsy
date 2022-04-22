public class Cat implements CatStrokable, Voiceable {
    @Override
    public void doSmth() {
       System.out.println("zagłaskany na smierc");
            }

    @Override
    public void beStroked() {
        System.out.println("głasku, głasku");
    }

    @Override
    public String gimmeVoice() {
        return "miał";
    }

//    @Override
//    public void sing(String SongName) {
//        System.out.println("singing: " + SongName);
//    }

}