public class DosenSipil extends Dosen {
    @Override
    public void mengajar() {
        System.out.println(String.format("saya mempraktikkan %s", this.getMatakuliah()));
    }

    @Override
    public int terimaTugas(Tugas tugas) {
        if (tugas instanceof TugasSipil) {
            return 100;
        } else if (tugas instanceof TugasIT) {
            return 50;
        }

        return 0;
    }
}
