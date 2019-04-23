public class AudioTrack implements Comparable<AudioTrack> {
    int duration;
    String title;
    String author;

    //+ - больше
    //- - меньше
    //0 - равен
    @Override
    public int compareTo(AudioTrack o) {
        return duration - o.duration;
    }
}
