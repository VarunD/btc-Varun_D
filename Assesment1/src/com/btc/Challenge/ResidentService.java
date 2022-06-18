package com.btc.Challenge;

import java.util.*;
import java.util.stream.Collectors;

import javax.management.relation.RelationNotFoundException;

public class ResidentService 
{
private List<Resident> residentsRepository  = new ArrayList<>();
ResidentService()
{
	Resident r1 = new Resident("span", 12, 'f');
	Resident r2 = new Resident("harsh", 22, 'm');
	Resident r3 = new Resident("manish", 23, 'm');
	Resident r4 = new Resident("var", 33, 'm');
	Resident r5 = new Resident("priya", 34, 'f');
	Resident r6 = new Resident("raksha", 45, 'f');
	residentsRepository.add(r1);
	residentsRepository.add(r2);
	residentsRepository.add(r3);
	residentsRepository.add(r4);
	residentsRepository.add(r5);
	residentsRepository.add(r6);
}

public boolean addResident(Resident resident) throws DuplicateFormatFlagsException {

    return false;
}

public List<Resident> searchResident(int socialSecurityNumber) throws RelationNotFoundException
{
	List<Resident> searchResident = residentsRepository.stream().filter(v->v.getSocialSecurity()==socialSecurityNumber)
																.collect(Collectors.toList());
	
    return  searchResident;
 }

public List<Resident> getAllNamesSorted(List<Resident> residentsRepository)
{
	
    	residentsRepository.sort((Resident residentobj1,Resident residentobj2)->residentobj1.getName().compareTo(residentobj2.getName()));


    	for(Resident i: residentsRepository )
    	{
    		System.out.println(i);
    	}
        return residentsRepository;

   }
	
//	Comparator<Resident> com = new Comparator<Resident>()
//			{
//				public int compare(Resident residentobj1, Resident residentobj2)
//				{
//					if(residentobj1.getName().compareTo(residentobj2.getName()))
//						return 1;
//					else
//						return -1;
//				}
//			};
//	Collections.sort(residentsRepository, com );
//
//    return residentsRepository;


//Fetch the list of residents based on their gender.
public List<Resident> getAllResidentsByGender(char gender)
{
List<Resident> ListBasedGender = residentsRepository.stream().filter(v->v.getGender()==gender)
													.collect(Collectors.toList());

   return ListBasedGender;
}

public static void main(String[] args) throws RelationNotFoundException 
{
	List<String> listOfResident = new ArrayList<>();
	ResidentService r = new ResidentService();
	System.out.println("Based on the Social Security ");
	System.out.println(r.searchResident(22));
	
	System.out.println("=================================================================");
	System.out.println("based on sorting");
	System.out.println(r.getAllNamesSorted(r.residentsRepository));
	
	System.out.println("==================================================================");
	System.out.println("based on the gender");
	System.out.println(r.getAllResidentsByGender('f'));
}
}
