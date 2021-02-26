package FactoryMethod.Refactoring_2;

public class Report extends Item{
    public Report() {
    }

    public Report(int id, String title, String type) {
        super(id, title);
        this.type = type;
    }

    private String type = new String();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Report{" +
                "id=" + super.getId() +
                ", title='" + super.getTitle() + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
