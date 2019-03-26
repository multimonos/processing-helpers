import processing.core.PApplet;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Camera {

    protected PApplet p;
    protected String filename;
    protected String basedir;
    protected String sequence;

    public Camera(PApplet parent) {
        p = parent;
        basedir = "./frames";
        filename = "snapshot";
        sequence = "####";
    }

    protected void saveFrame(String basedir, String filename, String ext) {
        String path = basedir + "/" + filename + "-" + sequence + "." + ext;
        p.saveFrame(path);
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void groupByFolders() {
        basedir += "/" + datetime();
    }

    public void png() {
        saveFrame(basedir, filename, "png");
    }

    public void tiff() {
        saveFrame(basedir, filename, "tif");
    }

    public void jpeg() {
        saveFrame(basedir, filename, "jpg");
    }

    public void jpg() {
        jpeg();
    }

    public String datetime() {
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}