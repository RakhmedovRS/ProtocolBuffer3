package com.github.rakhmedovrs.protocolbuffer3;

import com.github.rakhmedovrs.protocolbuffer3.practice.AddressBook;
import com.github.rakhmedovrs.protocolbuffer3.practice.Person;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.util.JsonFormat;

/**
 * @author RakhmedovRS
 * @created 4/5/2022
 */
public class PracticeMain
{
	public static void main(String[] args) throws InvalidProtocolBufferException
	{
		AddressBook.Builder addressBookBuilder = AddressBook.newBuilder();
		Person.Builder personBuilder = Person.newBuilder();
		personBuilder.setId(1)
			.setName("Name1")
			.setEmail("email1")
			.addPhones(Person.PhoneNumber.newBuilder().setNumber("111-111-111").build())
			.addPhones(Person.PhoneNumber.newBuilder().setNumber("222-222-222").build())
			.addPhones(Person.PhoneNumber.newBuilder().setNumber("333-333-333").build());
		System.out.println(JsonFormat.printer().print(personBuilder));

		Person person1 = personBuilder.build();

		personBuilder = Person.newBuilder();
		personBuilder.setId(2)
			.setName("Name2")
			.setEmail("email2")
			.addPhones(Person.PhoneNumber.newBuilder().setNumber("444-444-444").build())
			.addPhones(Person.PhoneNumber.newBuilder().setNumber("555-555-555").build())
			.addPhones(Person.PhoneNumber.newBuilder().setNumber("666-666-666").build());
		System.out.println(JsonFormat.printer().print(personBuilder));

		Person person2 = personBuilder.build();

		addressBookBuilder.addPeople(person1).addPeople(person2);
		System.out.println(JsonFormat.printer().print(addressBookBuilder));

		AddressBook addressBook = addressBookBuilder.build();

		System.out.println(addressBook.getPeopleList());
		System.out.println(addressBook.getPeople(0));
		System.out.println(addressBook.getPeople(1));
	}
}
