import org.jetbrains.annotations.NotNull;
import java.util.Vector;


public class Cinema {
    private String name;
    private Integer maxCapacity;
    private String address;
    private Vector<String> formatsAvail;
    private Vector<Hall> halls;
    private Vector<Film> catalogue;

    //TODO: protected access to all fields of the class
    public Cinema(){

        name = "Unknown cinema";
        maxCapacity = 0;
        address = "Unknown address";
        formatsAvail.clear();
        halls.clear();
        catalogue.clear();
    }
    public Cinema(String name){
        this.name = name;
        maxCapacity = 0;
        address = "Unknown address";
        formatsAvail.clear();
        halls.clear();
        catalogue.clear();
    }
    public Cinema(String name, String address){
        this.name = name;
        maxCapacity = 0;
        this.address = address;
        formatsAvail.clear();
        halls.clear();
        catalogue.clear();
    }
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Vector<String> getFormatsAvail() {
        return formatsAvail;
    }

    public Integer getMaxCapacity() {
        return maxCapacity;
    }

    public Vector<Hall> getHalls() {
        return halls;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setFormatsAvail(Vector<String> formatsAvail) {
        this.formatsAvail = formatsAvail;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHallCount(){
        return halls.size();
    }

    public Vector<Film> getCatalogue() {
        return catalogue;
    }

    public void addFilm(@NotNull Film film){
//        catalogue.add(film.clone());
    }

    public void removeFilm(Integer index){
        catalogue.remove(index - 1);
    }


}
