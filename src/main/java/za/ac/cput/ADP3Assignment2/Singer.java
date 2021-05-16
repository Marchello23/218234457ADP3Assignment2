package za.ac.cput.ADP3Assignment2;

//Author: Marchello Carolus 218234457
//Description: I used this class for my List and Collection test cases


public class Singer {


    private String fullname;
    private int age;
    private String genre;

    public Singer(String fullname) {
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Singer{" +
                "fullname='" + fullname + '\'' +
                ", age=" + age +
                ", genre='" + genre + '\'' +
                '}';
    }
}
