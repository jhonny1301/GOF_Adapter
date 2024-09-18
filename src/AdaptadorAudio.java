public class AdaptadorAudio implements ReproductorAudio {
    private ReproductorMP3 reproductorMP3;

    public AdaptadorAudio() {
        this.reproductorMP3 = new ReproductorMP3();
    }

    @Override
    public void reproducir(String tipoArchivo, String nombreArchivo) {
        if ("mp3".equalsIgnoreCase(tipoArchivo)) {
            reproductorMP3.reproducirMP3(nombreArchivo);
        } else {
            System.out.println("Formato no compatible: " + tipoArchivo);
        }
    }
}