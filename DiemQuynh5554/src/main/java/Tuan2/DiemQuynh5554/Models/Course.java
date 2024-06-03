package Tuan2.DiemQuynh5554.Models;

public class Course {
    private String code;
    private String name;
    private String imagePath;

    public Course(String code, String name, String imagePath) {
        this.code = code;
        this.name = name;
        this.imagePath = imagePath;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
