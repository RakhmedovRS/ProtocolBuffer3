package com.github.rakhmedovrs.protocolbuffer3;

/**
 * @author RakhmedovRS
 * @created 3/29/2022
 */
public class ComplexMain
{
	public static void main(String[] args)
	{
		System.out.println("Complex example");

		Complex.DummyMessage dummyMessage = createDummyMessage(1, "name");

		Complex.ComplexMessage.Builder builder = Complex.ComplexMessage.newBuilder();
		builder.setSingleDummy(dummyMessage);
		builder.addDummies(createDummyMessage(2, "second name"));
		builder.addDummies(createDummyMessage(3, "third name"));

		System.out.println(builder.build());
	}

	public static Complex.DummyMessage createDummyMessage(int id, String name)
	{
		return Complex.DummyMessage.newBuilder()
			.setId(id)
			.setName(name)
			.build();
	}
}
