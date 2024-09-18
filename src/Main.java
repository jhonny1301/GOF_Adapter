public class Main {
    public static void main(String[] args) {
        ReproductorAudio reproductor = new AdaptadorAudio();

        // Reproducir un archivo MP3 (el adaptador convierte la llamada)
        reproductor.reproducir("mp3", "cancion.mp3");

        // Intentar reproducir un archivo en formato no compatible
        reproductor.reproducir("wav", "audio.wav");
    }
}
