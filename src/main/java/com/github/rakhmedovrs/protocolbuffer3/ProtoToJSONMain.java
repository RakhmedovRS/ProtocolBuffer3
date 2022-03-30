package com.github.rakhmedovrs.protocolbuffer3;

import com.google.protobuf.util.JsonFormat;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author RakhmedovRS
 * @created 3/29/2022
 */
public class ProtoToJSONMain
{
	public static void main(String[] args)  throws IOException
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

		//print as a JSON
		String jsonString = JsonFormat.printer().print(builder);
		System.out.println(jsonString);

		Simple.SimpleMessage.Builder builder2 =  Simple.SimpleMessage.newBuilder();
		JsonFormat.parser().ignoringUnknownFields().merge(jsonString, builder2);

		System.out.println(builder2);
	}
}
