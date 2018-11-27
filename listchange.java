import java.util.*;
public class listchange{
	public static void main(String[]args){
		ArrayList <Integer> list = new ArrayList <>();
		ArrayList <Integer> list2 = new ArrayList <>();
		for(int i = 0; i < 10; i++){
			list.add(i);
			list2.add(i);
		}
		combine(list, list2);
	}
	public static ArrayList <Integer> combine(ArrayList <Integer> listA, ArrayList <Integer> listB){
		for(int i = 0; i < listB.size();i++){
			listA.add(listB.get(i));
		}
		return listA;
	}
}
