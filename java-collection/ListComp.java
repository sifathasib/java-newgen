import java.util.*;



public class ListComp {
    public static void main(String[] args){
        List<Car> list = new ArrayList<Car>();
        list.add(new Car("Volvo","XYZ 20266008",4));
        list.add(new Car("Toyota","DHK 21366408",2));
        list.add(new Car("Mercidez","CHT 31266568",5));
        for(Car c : list){
            System.out.println(c.brand+" "+c.numberPlates+" "+c.noOfDoors);
        }
        Comparator <Car> cm = new Comparator<Car>(){
            @Override
            public int compare(Car c1,Car c2){
                return c1.brand.compareTo(c2.brand);
            }
        };
        Collections.sort(list,cm);
        for(Car c : list){
            System.out.println(c.brand+" "+c.numberPlates+" "+c.noOfDoors);
        }

    }
}
