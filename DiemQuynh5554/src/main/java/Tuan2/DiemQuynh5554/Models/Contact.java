package Tuan2.DiemQuynh5554.Models;

public class Contact {
    private String name;
    private String email;
    private String message;
    private String date;

    public Contact(String name, String date, String message, String email) {
        this.name = name;
        this.date = date;
        this.message = message;
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}