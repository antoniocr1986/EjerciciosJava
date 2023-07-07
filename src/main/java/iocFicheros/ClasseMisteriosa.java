package iocFicheros;
import java.io.File;

/**
 *
 * @author anton
 */
 

public class ClasseMisteriosa {

    public static void main(String[] args) {
        ClasseMisteriosa programa = new ClasseMisteriosa();
        programa.inici();
    }

    public void inici() {
        File fGran = new File("Fotos" + File.separator + "Grans");
        File fBase = new File(fGran.getParent());

        if (fBase.isDirectory()) {

            if (fGran.isDirectory() == false) {
                fGran.mkdir();
            }

            File[] files = fBase.listFiles();

            for (int i = 0; i < files.length; i++) {
                File p = files[i];
                if (p.isFile()) {
                    boolean ext = mirarExt(p.getName());
                    if (ext && (p.length() > 500 * 1024)) {
                        mv(p, fGran);
                    } else {
                        p.delete();
                    }
                }
            }
        }

    }

    public boolean mirarExt(String n) {
        int i = n.lastIndexOf(".");
        if (i != -1) {
            String sub = n.substring(i, n.length());
            if (sub.equals(".png")) {
                return true;
            }
        }
        return false;
    }

    public void mv(File f, File d) {
        String abs = d.getAbsolutePath();
        String name = f.getName();
        File c = new File(abs + File.separator + name);
        f.renameTo(c);
    }

}
