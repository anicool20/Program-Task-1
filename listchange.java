import java.util.*;
public class listchange{
	public static void main(String[]args){
		ArrayList <Integer> list = new ArrayList <>();
		ArrayList <Integer> list2 = new ArrayList <>();
		for(int i = 0; i < 10; i++){
			list.add(i);
			list2.add(i);
		}
		print(combine(list, list2));
		removeDoubles(combine(list, list2));
	}
	public static ArrayList <Integer> combine(ArrayList <Integer> listA, ArrayList <Integer> listB){
		for(int i = 0; i < listB.size();i++){
			listA.add(listB.get(i));
		}
		return listA;
	}
	public static void print(ArrayList <Integer> listP){
		for(int i = 0; i < listP.size();i++){
			if(i == listP.size()-1)
			System.out.println(listP.get(i));
			else
			System.out.print(listP.get(i)+", ");
		}
		System.out.println();
	}
	public static void removeDoubles(ArrayList <Integer> listX){
		for(int i = 0; i < listX.size();i++){
			for(int j = 1; j < listX.size(); j++){
				if(listX.get(i) == listX.get(j))
				listX.remove(listX.get(j));
			}
			j = 1;
		}
		print(listX);
	}
}
