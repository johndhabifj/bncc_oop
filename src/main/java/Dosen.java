public abstract class Dosen extends Manusia {
    private String matakuliah;

    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }

    public String getMatakuliah() {
        return this.matakuliah;
    }

    public abstract void mengajar();

    public abstract int terimaTugas(Tugas tugas);
}
