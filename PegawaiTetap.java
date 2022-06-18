package Pegawai;

public abstract class PegawaiTetap extends Pegawai {
    private int gajiPokok;
    private int tujangan;
    private int anggotaKeluarga;

    public PegawaiTetap(String nama, int id, char jenisKelamin, int gajiPokok, int tujangan, int anggotaKeluarga) {
        super(nama, id, jenisKelamin);
        this.gajiPokok = gajiPokok;
        this.tujangan = tujangan;
        this.anggotaKeluarga = anggotaKeluarga;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTujangan() {
        return tujangan;
    }

    public void setTujangan(int tujangan) {
        this.tujangan = tujangan;
    }

    public int getAnggotaKeluarga() {
        return anggotaKeluarga;
    }

    public void setAnggotaKeluarga(int anggotaKeluarga) {
        this.anggotaKeluarga = anggotaKeluarga;
    }
}
