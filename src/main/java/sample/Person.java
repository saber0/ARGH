package sample;

public class Person {

    private String date;
    private String name;
    private String company;
    private String color;

    public Person(){
    }

    public Person(String date, String name, String company, String color){
        this.date = date;
        this.name = name;
        this.company = company;
        this.color = color;
    }

    public String getDate() { return this.date; }

    public String getName() {
        return this.name;
    }

    public String getCompany() {
        return this.company;
    }

    public String getColor() {
        return this.color;
    }


    public void setDate(String date) {
        this.date = date;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setColor(String color) {
        this.color = color;
    }


    @Override
    public String toString() {
        return "Person{" +
                "date='" + date + '\'' +
                ", name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", color='" + color + '\'' +
                '}' + '\n';
    }
}


