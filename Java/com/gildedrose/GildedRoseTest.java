package com.gildedrose;

import org.approvaltests.legacycode.LegacyApprovals;
import org.approvaltests.reporters.QuietReporter;
import org.approvaltests.reporters.UseReporter;
import org.junit.Test;

@UseReporter(QuietReporter.class)
public class GildedRoseTest {

	@Test
	public void foo() throws Exception {
		String[] names = { "", "pie", "foo", "Sulfuras, Hand of Ragnaros", "Aged Brie",
				"Backstage passes to a TAFKAL80ETC concert" };
		Integer[] numbers = { -1, 0, 1, 2, 4, 5, 6, 10, 11, 12, 49, 50, 51, Integer.MAX_VALUE, Integer.MIN_VALUE };
		LegacyApprovals.LockDown(this, "doStuff", names, numbers, numbers);
	}

	public GildedRose doStuff(String name, Integer quality, Integer sellIn) {
		Item[] items = new Item[] { new Item(name, sellIn, quality) };
		GildedRose app = new GildedRose(items);
		app.updateQuality();
		return app;
	}

}
