package model;

import javax.enterprise.inject.Model;
import java.io.File;

@Model
public class FileGetter {

    private File file;
    private Integer id;


    public FileGetter(){

    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
}
