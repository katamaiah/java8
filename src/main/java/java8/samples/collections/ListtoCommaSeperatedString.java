package java8.samples.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import java8.samples.domain.Complaint;

public class ListtoCommaSeperatedString {

	public static void main(String[] args) {

		List<Complaint> complaintList = new ArrayList<>();
		
		Complaint c1= new Complaint("C1");
		Complaint c2= new Complaint("C2");
		Complaint c3= new Complaint("C3");
		complaintList.add(c1);
		complaintList.add(c2);
		complaintList.add(c3);
		
		String complainIds= complaintList.stream()
										 .map(complaint -> complaint.getComplaintId())
										 .collect(Collectors.joining(","));
		System.out.println("complainIds:"+complainIds);
	}
}
