import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Created by ryszardszymanski on 21.07.2019.
 */
public class ListToTree {

    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();
        boolean flag = false;
        Integer tempParent = null;
        String pointer = "->";
        String space = " ";

        carList.add(new Car(1, "Car", null));
        carList.add(new Car(2, "BMW", 1));
        carList.add(new Car(3, "BMW_model_3", 2));
        carList.add(new Car(4, "BMW_model_5", 2));
        carList.add(new Car(5, "BMW_model_3_kombi", 3));
        carList.add(new Car(6, "Audi", 1));
        carList.add(new Car(7, "Audi_A4", 6));
        carList.add(new Car(8, "Audi_A6", 6));
        carList.add(new Car(9, "Audi_A4_kombi", 7));

        while (flag == false) {
            int repeat = 0;
            for (int i = 0; i < carList.size(); i++) {
                if(carList.get(i).isKey()==false && carList.get(i).getParent() == tempParent) {
                    System.out.println(IntStream.range(0, repeat).mapToObj(j -> space).collect(Collectors.joining(""))+ pointer + carList.get(i).getText());
                    carList.get(i).setKey(true);
                    tempParent = carList.get(i).getIndex();
                    repeat++;

                }

            }

        }

    }

    public static void branch(List<Car> cars, Integer parent) {
        for (int i = 0; i < cars.size(); i++) {
            if(cars.get(i).isKey()==false && cars.get(i).getParent() == parent) {
                
            }
        }
    }
}
