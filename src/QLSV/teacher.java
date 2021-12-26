
package QLSV;


public class teacher {
    private int id;
    private String name;
    private String gender;
    private String bdate;
    private String email;
    private String address;
    private String phonenumber;
    private byte[] picture;

    public teacher(int id, String name, String gender, String bdate, String email, String address, String phonenumber, byte[] picture) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.bdate = bdate;
        this.email = email;
        this.address = address;
        this.phonenumber = phonenumber;
        this.picture = picture;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getBdate() {
        return bdate;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public byte[] getPicture() {
        return picture;
    }
    
    
}
