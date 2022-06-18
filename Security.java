package Pegawai;

public class Security extends PegawaiTidakTetap implements Info {
    private int level;

    public Security(String nama, int id, char jenisKelamin, int tarif, int bonus, int lamaKerja, int level) {
        super(nama, id, jenisKelamin, tarif, bonus, lamaKerja);
        this.level = level;
    }

    @Override
    public void infoPegawai() {
        System.out.println("Nama : "+super.getNama());
        System.out.println("ID : "+super.getId());
        System.out.println("Jenis kelamin : "+super.getJenisKelamin());
        System.out.println("Tarif : "+super.getTarif());
        System.out.println("Bonus : "+super.getBonus());
        System.out.println("Lama Kerja : "+super.getLamaKerja());
        System.out.println("Level : "+level);
        System.out.println("Gaji : "+gaji());
        infoRemunerasi();
    }

    @Override
    public void infoRemunerasi() {
        if (level == 1 ||level == 2 ) System.out.println("Remunerasi : "+0.5*super.getTarif());
        else System.out.println("Remunerasi : "+super.getTarif());
    }

    @Override
    int gaji() {
        super.setBonus(0);
        if (super.getLamaKerja()>8) super.setBonus((super.getLamaKerja()-8)*super.getBonus());
        return super.getTarif()*super.getBonus();
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
