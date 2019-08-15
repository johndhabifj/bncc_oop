public class Manusia {
    private String nama;

    public void setNama(String nama) {
        if (nama == null) {
            throw new IllegalArgumentException("nama tidak boleh kosong");
        }
        this.nama = nama;
    }

    public String getNama() {
        return this.nama;
    }

    public void perkenalkanDiri() {
        System.out.println(String.format("Hi, nama saya %s", this.getNama()));
    }
}

