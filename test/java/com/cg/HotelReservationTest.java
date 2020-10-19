package com.cg;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.*;

public class HotelReservationTest {
	
	@Test
	public void findCheapestHotelForGivenDateRange_ConsideringOnlyWeekdayRates() throws ParseException {
		HotelReservationMain hotelReservationMain = new HotelReservationMain();
		String hotel = hotelReservationMain.findCheapestHotelForGivenDateRangeConsideringWeekdayRatesOnly("10Sep2020","11Sep2020");
		Assert.assertEquals("Lakewood", hotel);
	}
	
	@Test
	public void findCheapestHotelForGivenDateRange_ConsideringBothWeekdayAndWeekendRates() throws ParseException {
		HotelReservationMain hotelReservationMain = new HotelReservationMain();
		List<String> actualList = hotelReservationMain.findCheapestHotelForGivenDateRangeConsideringWeekdayAndWeekendRatesBoth("11Sep2020", "12Sep2020");
		List<String> expectedList = new ArrayList<>(Arrays.asList("Lakewood","Bridgewood"));
		Assert.assertEquals(expectedList, actualList);
	}
	
	@Test
	public void findCheapestBestRatedHotelForRegulars() throws ParseException {
		HotelReservationMain hotelReservationMain = new HotelReservationMain();
		String hotel = hotelReservationMain.findCheapestBestRatedHotelForRegulars("11Sep2020", "12Sep2020");
		Assert.assertEquals("Bridgewood",hotel);
	}
	
	@Test
	public void findBestRatedHotelForRegulars() throws ParseException {
		HotelReservationMain hotelReservationMain = new HotelReservationMain();
		String hotel = hotelReservationMain.findBestRatedHotelForRegulars("11Sep2020", "12Sep2020");
		Assert.assertEquals("Ridgewood",hotel);
	}
	
	@Test
	public void findCheapestBestRatedHotelForRewards() throws ParseException {
		HotelReservationMain hotelReservationMain = new HotelReservationMain();
		String hotel = hotelReservationMain.findCheapestBestRatedHotelForRewards("11Sep2020", "12Sep2020");
		Assert.assertEquals("Ridgewood",hotel);
	}
	
	@Test
	public void checkWithInvalidDateFormat() {
		HotelReservationMain hotelReservationMain = new HotelReservationMain();
		try {
			String hotel = hotelReservationMain.findCheapestBestRatedHotelForRegulars("10092020", "12Sep20");
		} catch (Exception e) {
			Assert.assertEquals("Text '10092020' could not be parsed at index 2", e.getMessage());
		}
	}
}
