package quiz2;

/**
 *
 * @author ovasae
 */
public class pendataan {

    String nama, nik, alamat, job;
    Integer noTlp, jml_ank;

    public pendataan(String nama, String nik, String alamat, String job, int noTlp, int jml_ank) {
        this.nama = nama;
        this.nik = nik;
        this.alamat = alamat;
        this.job = job;
        this.noTlp = noTlp;
        this.jml_ank = jml_ank;
    }

    pendataan() {

    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setNoTlp(Integer noTlp) {
        this.noTlp = noTlp;
    }

    public void setJml_ank(Integer jml_ank) {
        this.jml_ank = jml_ank;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }

    public String getAlamat() {

        return alamat;
    }

    public String getJob() {
        return job;
    }

    public Integer getNoTlp() {
        return noTlp;
    }

    public Integer getJml_ank() {
        return jml_ank;
    }

}
