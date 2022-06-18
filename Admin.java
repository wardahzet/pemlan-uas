package Pegawai;

public class Admin extends PegawaiTetap implements Info {
    private int lamaKerja;

    public Admin(String nama, int id, char jenisKelamin, int gajiPokok, int tujangan, int anggotaKeluarga, int lamaKerja) {
        super(nama, id, jenisKelamin, gajiPokok, tujangan, anggotaKeluarga);
        this.lamaKerja = lamaKerja;
    }

    @Override
    public void infoPegawai() {
        System.out.println("Nama : "+super.getNama());
        System.out.println("ID : "+super.getId());
        System.out.println("Jenis kelamin : "+super.getJenisKelamin());
        System.out.println("Gaji Pokok : "+super.getGajiPokok());
        System.out.println("Tunjangan : "+super.getTujangan());
        System.out.println("Jumlah Anggota keluarga : "+super.getAnggotaKeluarga());
        System.out.println("Lama kerja : "+lamaKerja);
        System.out.println("Gaji : " + gaji());
        infoRemunerasi();
    }

    @Override
    public void infoRemunerasi() {
        System.out.println("Remunerasi : "+lamaKerja*0.3*super.getTujangan());

    }

    @Override
    int gaji() {
        return super.getGajiPokok() + super.getTujangan()*super.getAnggotaKeluarga();
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }
}
