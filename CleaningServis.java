package Pegawai;

public class CleaningServis extends PegawaiTidakTetap implements Info {
    private int masaMengabdi;

    public CleaningServis(String nama, int id, char jenisKelamin, int tarif, int bonus, int lamaKerja, int masaMengabdi) {
        super(nama, id, jenisKelamin, tarif, bonus, lamaKerja);
        this.masaMengabdi = masaMengabdi;
    }

    @Override
    public void infoPegawai() {
        System.out.println("Nama : "+super.getNama());
        System.out.println("ID : "+super.getId());
        System.out.println("Jenis kelamin : "+super.getJenisKelamin());
        System.out.println("Tarif : "+super.getTarif());
        System.out.println("Bonus : "+super.getBonus());
        System.out.println("Lama Kerja : "+super.getLamaKerja());
        System.out.println("Masa Mengabdi : "+masaMengabdi);
        System.out.println("Gaji : "+gaji());
        infoRemunerasi();
    }

    @Override
    public void infoRemunerasi() {
        if (masaMengabdi <= 5) System.out.println("Remunerasi : "+0.3*super.getTarif());
        else System.out.println("Remunerasi : "+0.5*super.getTarif());
    }

    @Override
    int gaji() {
        super.setBonus(0);
        if (super.getLamaKerja()>5) super.setBonus((super.getLamaKerja()-5)*super.getBonus());
        return super.getTarif()+super.getBonus();
    }

    public int getMasaMengabdi() {
        return masaMengabdi;
    }

    public void setMasaMengabdi(int masaMengabdi) {
        this.masaMengabdi = masaMengabdi;
    }
}
