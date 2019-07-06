package Model;

public class Jersey {

    int id;
    String club;
    String type;
    int cut;

    Jersey jersey;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCut() {
        return cut;
    }

    public void setCut(int cut) {
        this.cut = cut;
    }

    public Jersey (int id, String club,String type, int cut){
       this.id = id;
       this.club = club;
       this.type = type;
       this.cut = cut;

    }

    public Jersey() {
    }

    @Override
    public String toString() {
        return "Jersey{" +
                "id=" + id +
                ", club='" + club + '\'' +
                ", type='" + type + '\'' +
                ", cut=" + cut  +
                '}';
    }
}
