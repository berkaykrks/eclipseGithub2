package tr.edu.medipol.yazilimort;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamalarTest {

	@Test
	public void testFaktoriyelRec() {
		int sonuc = Hesaplamalar.faktoriyelRec(5);
		assertEquals(120,sonuc);
	}

	@Test
	public void testFaktoriyelDongu() {
		int sonuc = Hesaplamalar.faktoriyelDongu(5);
		assertEquals(120,sonuc);
	}

	@Test
	public void testTopla() {
		int sonuc = Hesaplamalar.topla(10, 20);
		assertEquals(30,sonuc);
	}

	@Test
	public void testCikar() {
		int sonuc = Hesaplamalar.cikar(20, 10);
		assertEquals(10,sonuc);
	}

	@Test
	public void testCarp() {
		int sonuc = Hesaplamalar.carp(20, 10);
		assertEquals(200,sonuc);
	}

}
