/**
 * Created by ryszardszymanski on 21.07.2019.
 */
public class Car {

    private Integer index;
    private String text;
    private Integer parent;
    private boolean key;

    public Car(Integer index, String text, Integer parent) {
        this.index = index;
        this.text = text;
        this.parent = parent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (key != car.key) return false;
        if (index != null ? !index.equals(car.index) : car.index != null) return false;
        if (text != null ? !text.equals(car.text) : car.text != null) return false;
        return parent != null ? parent.equals(car.parent) : car.parent == null;
    }

    @Override
    public int hashCode() {
        int result = index != null ? index.hashCode() : 0;
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (parent != null ? parent.hashCode() : 0);
        result = 31 * result + (key ? 1 : 0);
        return result;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getParent() {
        return parent;
    }

    public void setParent(Integer parent) {
        this.parent = parent;
    }

    public boolean isKey() {
        return key;
    }

    public void setKey(boolean key) {
        this.key = key;
    }
}
