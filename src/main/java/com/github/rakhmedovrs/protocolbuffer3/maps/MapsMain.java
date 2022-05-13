package com.github.rakhmedovrs.protocolbuffer3.maps;

/**
 * @author RakhmedovRS
 * @created 5/12/2022
 */
public class MapsMain
{
	public static void main(String[] args)
	{
		Maps.MapExample message = Maps.MapExample
			.newBuilder()
			.putIds("id_1", newIdWrapper(1))
			.putIds("id_2", newIdWrapper(2))
			.putIds("id_3", newIdWrapper(3))
			.build();

		System.out.println(message);
	}

	private static Maps.IdWrapper newIdWrapper(int id)
	{
		return Maps.IdWrapper.newBuilder().setId(id).build();
	}
}
