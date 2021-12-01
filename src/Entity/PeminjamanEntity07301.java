package Entity;
import java.util.Date;
public class PeminjamanEntity07301 {
    private String idPinjam;
    BukuEntity07301 buku = new BukuEntity07301();
    AnggotaEntity07301 anggota = new AnggotaEntity07301();
    Date tglPinjam;
    Date tglKembali;
    private Boolean statusPinjam;
}
