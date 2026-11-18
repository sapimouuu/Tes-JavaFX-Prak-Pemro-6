import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Mahasiswa {
    private SimpleIntegerProperty id;
    private SimpleStringProperty nama;
    private SimpleStringProperty nim;

    public Mahasiswa (int id, String nama, String nim) {
        this.id=new SimpleIntegerProperty(id);
        this.nama=new SimpleStringProperty(nama);
        this.nim=new SimpleStringProperty(nim);
    }

    public int getId() {
        return id.get();
    }

    public void setId(int id) {
        this.id.set(id);
    }

    public String getNama() {
        return nama.get();
    }

    public void setNama(String nama) {
        this.nama.set(nama);
    }

    public String getNim() {
        return nim.get();
    }

    public void setNim(String nim) {
        this.nim.set(nim);
    }
}