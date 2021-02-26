package FactoryMethod.Refactoring_2;

public class Thesis extends Item{

    public Thesis() {
    }

    public Thesis(int id, String title, String program) {
        super(id, title);
        this.program = program;
    }

    private String program = new String();

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    @Override
    public String toString() {
        return "Thesis{" +
                "id=" + super.getId() +
                ", title='" + super.getTitle() + '\'' +
                ", program='" + program + '\'' +
                '}';
    }
}
