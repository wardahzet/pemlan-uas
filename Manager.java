package Pegawai;

public class Manager extends PegawaiTetap implements Info {
    private String departemen;
    private int level;

    public Manager(String nama, int id, char jenisKelamin, int gajiPokok, int tujangan, int anggotaKeluarga, String departemen, int level) {
        super(nama, id, jenisKelamin, gajiPokok, tujangan, anggotaKeluarga);
        this.departemen = departemen;
        this.level = level;
    }

    @Override
    public void infoPegawai() {
        System.out.println("Nama : "+super.getNama());
        System.out.println("ID : "+super.getId());
        System.out.println("Jenis kelamin : "+super.getJenisKelamin());
        System.out.println("Gaji Pokok : "+super.getGajiPokok());
        System.out.println("Tunjangan : "+super.getTujangan());
        System.out.println("Jumlah Anggota keluarga : "+super.getAnggotaKeluarga());
        System.out.println("Departemen : "+departemen);
        System.out.println("Level : "+level);
        System.out.println("Gaji : "+gaji());
        infoRemunerasi();
    }

    @Override
    public void infoRemunerasi() {
        if (level == 1 ||level == 2 ) System.out.println("Remunerasi : "+0.5*level*super.getTujangan());
        else System.out.println("Remunerasi : "+level*super.getTujangan());
    }

    @Override
    int gaji() {
        return super.getGajiPokok() + super.getTujangan()*level;
    }

    public String getDepartemen() {
        return departemen;
    }

    public void setDepartemen(String departemen) {
        this.departemen = departemen;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
