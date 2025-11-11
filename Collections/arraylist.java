import java.util.ArrayList;

class arraylist{
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>(); 

        list.add(1); 
        list.add(2);
        list.add(3);
        list.set(1,5);
        list.remove(0);
        for(int i: list){
            System.out.println(i);
            
        }
    }
}