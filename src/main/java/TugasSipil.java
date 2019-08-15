public class TugasSipil implements Tugas {
    private Mahasiswa pengumpul;

    private Tugas sumber;

    public TugasSipil(Mahasiswa pengumpul, Tugas sumber) {
        this.pengumpul = pengumpul;
        this.sumber = sumber;
    }

    @Override
    public Mahasiswa getMahasiswa() {
        return this.pengumpul;
    }

    @Override
    public int getSoal() {
        return this.sumber.getSoal();
    }

    @Override
    public int getJawaban() {
        return this.sumber.getJawaban();
    }
}
