package Khosyi.relasiclass.percobaan3;

public class pegawai{
    private String nama;
    private String nip;

    pegawai(String nama , String nip){
        this.nama = nama;
        this.nip = nip;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setNip(String nip){
        this.nip = nip;
    }

    public String getNama(){
        return nama;
    }
    public String getNip(){
        return nip;
    }

    public String info() { 
        String info = "";
        info += "Nip: " + this.nip + "\n";
        info += "Nama: " + this.nama + "\n";
        return info;
    }




}
