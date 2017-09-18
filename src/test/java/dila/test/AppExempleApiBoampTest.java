package dila.test;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;
import com.x.api.ApiBoamp;
import com.x.api.core.Item;
import com.x.api.core.ServiceSearch;

public class AppExempleApiBoampTest {

	private int getResultCount(String critere) {
		ApiBoamp app = new ApiBoamp("xml");
		List<Item> items = app.search(critere);
		int nbItemsExistants = ServiceSearch.getNbItemsExistants();
		if (items != null)
			return nbItemsExistants;
		else
			return 0;
	}

	@Test(timeout = 10000)
	public void test20() {
		int testval=2713633;
		Assert.assertTrue(getResultCount("#all") >= testval);
	}

	@Test(timeout = 10000)
	public void test30() {
		int testval=2713633;
		Assert.assertTrue(getResultCount("exalead") >= testval);
	}

	@Test(timeout = 10000)
	public void test40() {
		Assert.assertEquals(158382, getResultCount("source_cat: v0"));
	}

	@Test(timeout = 10000)
	public void test50() {
		Assert.assertEquals(0, getResultCount("source_cat: v0 devise:EUR"));
	}

	@Test(timeout = 10000)
	public void test60() {
		Assert.assertEquals(2264173, getResultCount("source_cat: v1"));
	}

	@Test(timeout = 10000)
	public void test70() {
		Assert.assertEquals(0, getResultCount("source_cat: v1 devise:EUR"));
	}

	@Test(timeout = 10000)
	public void test80() {
		Assert.assertEquals(187813, getResultCount("source_cat: v2"));
	}

	@Test(timeout = 10000)
	public void test90() {
		Assert.assertEquals(3207, getResultCount("source_cat: v2 devise:EUR"));
	}

	@Test(timeout = 10000)
	public void test100() {
		Assert.assertEquals(51085, getResultCount("source_cat: v2 nature:ATTRIBUTION"));
	}

	@Test(timeout = 10000)
	public void test110() {
		Assert.assertEquals(1, getResultCount("source_cat: v2 idweb:16-941"));
	}

	@Test(timeout = 10000)
	public void test120() {
		Assert.assertEquals(697, getResultCount("source_cat: v2 dateparution:2016/01/07"));
	}

	@Test(timeout = 10000)
	public void test130() {
		Assert.assertEquals(2610368, getResultCount("(source_cat:v0 OR source_cat:v1 OR source_cat:v2)"));
	}

	@Test(timeout = 10000)
	public void test140() {
		Assert.assertEquals(51565, getResultCount("(source_cat:v0 OR source_cat:v1 OR source_cat:v2) AND numeroregion:42"));
	}

	@Test(timeout = 10000)
	public void test150() {
		Assert.assertEquals(3207, getResultCount("(source_cat:v0 OR source_cat:v1 OR source_cat:v2) devise:EUR"));
	}

	@Test(timeout = 10000)
	public void test160() {
		Assert.assertEquals(3207, getResultCount("(source_cat:v0 OR source_cat:v1 OR source_cat:v2) AND devise:EUR"));
	}

	@Test(timeout = 10000)
	public void test170() {
		Assert.assertEquals(2195, getResultCount("(source_cat:v0 OR source_cat:v1 OR source_cat:v2) AND famille_cat:JOUE AND famille_cat:FNS"));
	}

	@Test(timeout = 10000)
	public void test180() {
		Assert.assertEquals(1328, getResultCount("(source_cat:v0 OR source_cat:v1 OR source_cat:v2) AND nomacheteur: syctom"));
	}

}