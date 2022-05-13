package com.github.rakhmedovrs.protocolbuffer3.oneofs;

/**
 * @author RakhmedovRS
 * @created 5/12/2022
 */
public class OneOfsMain
{
	public static void main(String[] args)
	{
		Oneofs.Result message = Oneofs.Result
			.newBuilder()
			.setMessage("message")
			.build();


		System.out.println("hasMessage " + message.hasMessage());
		System.out.println("hasId " + message.hasId());
		System.out.println(message);

		Oneofs.Result message2 = Oneofs.Result
			.newBuilder(message)
			.setId(1)
			.build();

		System.out.println("hasMessage " + message2.hasMessage());
		System.out.println("hasId " + message2.hasId());
		System.out.println(message2);

		Oneofs.Result message3 = Oneofs.Result
			.newBuilder()
			.setMessage("message")
			.setId(1)
			.build();

		System.out.println("hasMessage " + message3.hasMessage());
		System.out.println("hasId " + message3.hasId());
		System.out.println(message3);
	}
}
