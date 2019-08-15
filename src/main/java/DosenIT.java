public class DosenIT extends Dosen {
    @Override
    public void mengajar() {
        System.out.println(String.format("saya mengajar teori %s", this.getMatakuliah()));
    }

    @Override
    public int terimaTugas(Tugas tugas) {
        if (tugas.getMahasiswa() instanceof MahasiswaIT) {
            return 100;
        } else if (tugas.getMahasiswa() instanceof MahasiswaSipil) {
            return 50;
        }

        return 0;
    }
}
