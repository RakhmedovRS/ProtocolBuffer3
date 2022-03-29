package com.github.rakhmedovrs.protocolbuffer3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author RakhmedovRS
 * @created 3/24/2022
 */
public class SimpleMain
{
	public static void main(String[] args) throws IOException
	{
		Simple.SimpleMessage.Builder builder = Simple.SimpleMessage.newBuilder();

		//simple fields
		builder.setId(47)
			.setIsSimple(true)
			.setName("Test name");

		//repeated field
		builder.addSampleList(1);
		builder.addSampleList(2);
		builder.addSampleList(3);

		Simple.SimpleMessage simpleMessage = builder.build();

		System.out.println(simpleMessage);

		//write to file
		try(FileOutputStream fos = new FileOutputStream("simple_message.bin"))
		{
			simpleMessage.writeTo(fos);
		}

		//read from file
		try (FileInputStream fis = new FileInputStream("simple_message.bin"))
		{
			Simple.SimpleMessage read = Simple.SimpleMessage.parseFrom(fis);
			System.out.println(read);

			System.out.println(simpleMessage.equals(read));
		}
	}
}
