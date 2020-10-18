package com.cg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class HotelReservationTest {
	
	@Test
	public void findCheapestHotelForGivenDateRange_ConsideringOnlyWeekdayRates() {
		HotelReservationMain hotelReservationMain = new HotelReservationMain();
		String hotel = hotelReservationMain.findCheapestHotelForGivenDateRangeConsideringWeekdayRatesOnly("10Sep2020","11Sep2020");
		Assert.assertEquals("Lakewood", hotel);
	}
	
	@Test
	public void findCheapestHotelForGivenDateRange_ConsideringBothWeekdayAndWeekendRates() {
		HotelReservationMain hotelReservationMain = new HotelReservationMain();
		List<String> actualList = hotelReservationMain.findCheapestHotelForGivenDateRangeConsideringWeekdayAndWeekendRatesBoth("11Sep2020", "12Sep2020");
		List<String> expectedList = new ArrayList<>(Arrays.asList("Lakewood","Bridgewood"));
		Assert.assertEquals(expectedList, actualList);
	}
}
