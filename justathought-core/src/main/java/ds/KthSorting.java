package ds;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

public class KthSorting {
	
	public static List<Integer> findKthLargestElementsFromList(List<Integer> integers,int k){
		PriorityQueue<Integer> priorityQueue=new PriorityQueue<>(Comparator.naturalOrder());
		priorityQueue.addAll(integers);
		LinkedList<Integer> linkedList=new LinkedList<>();
		while(linkedList.size()!=k) {
			linkedList.add(priorityQueue.peek());
			priorityQueue.remove();
		}
	
		return linkedList.stream().toList();
	}
	
	public static void main(String[] args) {
		List<Integer> integers=List.of(20,11,1,2,3,4,5,6,7,8,9);
		System.out.println(findKthLargestElementsFromList(integers, 5));
		
		
	}

}
