public class Car {
    private int id;
    private int no;

    public Car(int id, int no) {
        this.id = id;
        this.no = no;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", no=" + no +
                '}';
    }
}
