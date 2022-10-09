package Khosyi.relasiclass.percobaan3;

public class KeretaApi {
    private String nama;
    private String kelas;
    private pegawai masinis;
    private pegawai asisten;

    KeretaApi(String nama , String kelas , pegawai masinis){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
    }

    KeretaApi(String nama , String kelas , pegawai masinis , pegawai asisten){
        this.nama = nama;
        this.kelas = kelas;
        this.masinis = masinis;
        this.asisten = asisten;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setKelas(String kelas){
        this.kelas = kelas;
    }
    public void setMasinis(pegawai masinis){
        this.masinis = masinis;
    }
    public void setAsisten(pegawai asisten){
        this.asisten = asisten;
    }

    public String getNama(){
        return nama;
    }
    public String getKelas(){
        return kelas;
    }
    public pegawai getMasinis(){
        return masinis;
    }
    public pegawai getAsisten(){
        return asisten;
    }

    public String info() {
        String info = "";
        info += "Nama: " + this.nama + "\n";
        info += "Kelas: " + this.kelas + "\n";
        info += "Masinis: " + this.masinis.info() + "\n";
        try{
            info += "Asisten: " + this.asisten.info() + "\n";
        } catch (NullPointerException e){
            info += "Asisten: -\n";
        } catch (Exception e){
            info += "Asisten: -\n";
        }
        return info;
    }
        







}
