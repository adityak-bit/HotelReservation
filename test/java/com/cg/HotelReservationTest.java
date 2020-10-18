package com.cg;

import org.junit.*;

public class HotelReservationTest {
	
	@Test
	public void findCheapestHotelForGivenDateRange_ConsideringOnlyWeekdayRates() {
		HotelReservationMain hotelReservationMain = new HotelReservationMain();
		String hotel = hotelReservationMain.findCheapestHotelForGivenDateRangeConsideringWeekdayRatesOnly("10Sep2020","11Sep2020");
		Assert.assertEquals("Lakewood", hotel);
	}
}
