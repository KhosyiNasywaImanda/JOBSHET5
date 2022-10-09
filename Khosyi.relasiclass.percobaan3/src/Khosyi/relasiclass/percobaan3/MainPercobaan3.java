package Khosyi.relasiclass.percobaan3;

public class MainPercobaan3 {
    public static void main(String[] args){

        pegawai masinis = new pegawai("khosyi nasywa imanda", "2131710103");
        pegawai asisten = new pegawai("Yocky ahmad saputra", "2141710232");
        KeretaApi keretaApi = new KeretaApi("Sancaka", "ekonomi", masinis, asisten);
        System.out.println(keretaApi.info());


    }
}
