package Khosyi.relasiclass.percobaan3;

public class MainPertanyaan {
    public static void main(String[] args){

        pegawai masinis = new pegawai("khosyi nasywa imanda", "2131710103");
        KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis);
        System.out.println(keretaApi.info());



    }
}
