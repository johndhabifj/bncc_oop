public class Main {
    public static void main(String[] args) {
        Manusia manusia1 = new Manusia();
        manusia1.setNama("Andi");

        System.out.println();

        Mahasiswa mahasiswa1 = new Mahasiswa();
        mahasiswa1.setNama("Budi");
        mahasiswa1.belajar();

        System.out.println();

        Mahasiswa mahasiswa2 = new MahasiswaIT();
        mahasiswa2.setNama("Cindy");
        mahasiswa2.belajar();

        System.out.println();

        MahasiswaSipil mahasiswa3 = new MahasiswaSipil();
        mahasiswa3.setNama("Deny");
        mahasiswa3.belajar();

        System.out.println();

        Dosen dosen1 = new DosenIT();
        dosen1.setMatakuliah("object oriented programming");
        dosen1.mengajar();

        Tugas tugas1 = new TugasIT();
        System.out.println(String.format("nilai: %d", dosen1.terimaTugas(tugas1)));
    }
}
