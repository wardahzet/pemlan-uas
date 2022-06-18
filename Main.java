package Pegawai;

public class Main {
    public static void main(String[] args) {
        Info admin = new Admin("khjf",1,'p',3,4,5,6);
        admin.infoPegawai();

        Info security = new Security("khjf",1,'p',9,9,9,2);
        security.infoPegawai();

        Info manager = new Manager("dshga",76,'d',34,5,6,"dsa",2);
        manager.infoPegawai();

        Info clean = new CleaningServis("sadd",3,'f',32,44,55,45);
        clean.infoPegawai();
    }
}
