package model;

public class DataStore {
    private static final int MAX_STOCK = 100;
    private Computer [] computers = new Computer[MAX_STOCK];
    private int currentStock = 0;

    public void add(Computer computer){
        if(currentStock < MAX_STOCK){
            computers[currentStock] = computer;
            currentStock ++ ;
        }else{
            System.out.println("Max stock.");
        }
    }

    public int checkAvailability(Computer computer){
        int counter = 0;
        for(int i = 0; i < currentStock; i++){
            if(computers[currentStock].equals(computer)){
                counter ++ ;
            }
        }
        return  counter;

    }
}
