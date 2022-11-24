package quiz2;

/**
 *
 * @author ovasae
 */
public class overloading extends pendataan {

    int overloading, totbiaya, sampah, keamanan, sumbangan;

    public overloading(String nama, String nik, String alamat, String job, int NoTlp, int jml_ank) {
        super(nama, nik, alamat, job, NoTlp, jml_ank);

    }

    @Override
    public Integer getJml_ank() {
        return super.getJml_ank();
    }

    @Override
    public Integer getNoTlp() {
        return super.getNoTlp();
    }

    @Override
    public String getJob() {
        return super.getJob();
    }

    @Override
    public String getAlamat() {
        return super.getAlamat();
    }

    @Override
    public String getNik() {
        return super.getNik();
    }

    @Override
    public String getNama() {
        return super.getNama();
    }

    @Override
    public void setJml_ank(Integer jml_ank) {
        super.setJml_ank(jml_ank);
    }

    @Override
    public void setNoTlp(Integer noTlp) {
        super.setNoTlp(noTlp);
    }

    @Override
    public void setJob(String job) {
        super.setJob(job);
    }

    @Override
    public void setAlamat(String alamat) {
        super.setAlamat(alamat);
    }

    @Override
    public void setNik(String nik) {
        super.setNik(nik);
    }

    @Override
    public void setNama(String nama) {
        super.setNama(nama);
    }

    public int bayarIuran() {

        totbiaya = overloading + sampah + keamanan + sumbangan;

        return totbiaya;

    }
}
