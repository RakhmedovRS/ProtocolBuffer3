package com.github.rakhmedovrs.protocolbuffer3.bacics_part_2;

import com.github.rakhmedovrs.protocolbuffer3.EnumExample;

/**
 * @author RakhmedovRS
 * @created 3/28/2022
 */
public class EnumMain
{
	public static void main(String[] args)
	{
		System.out.println("Example for Enums");

		EnumExample.DayOfWeek.Builder builder = EnumExample.DayOfWeek.newBuilder();
		builder.setId(22);

		builder.setDayOfWeek(EnumExample.DayOfWeek.Day.FRIDAY);

		EnumExample.DayOfWeek message = builder.build();
		System.out.println(message);
	}
}
