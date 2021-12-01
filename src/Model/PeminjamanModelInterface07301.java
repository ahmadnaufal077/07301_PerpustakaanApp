package Model;
import Controller.PeminjamanControllerInterface07301;
public class PeminjamanModelInterface07301 {
    private String generateIdPeminjaman(){
        String newId = null;
        String data;
        try{
            String sql = "SELECT peminjaman_id FROM peminjaman ORDER BY peminjaman_id DESC LIMIT 1";          
        }catch(Exception e){
            System.out.println(e);
        }return newId;
    }
}