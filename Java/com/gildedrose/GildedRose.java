package com.gildedrose;

import java.util.Arrays;

class GildedRose {
	Item[] items;

	@Override
	public String toString() {
		return "GildedRose [items=" + Arrays.toString(items) + "]";
	}

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {
		for (Item item : items) {
			updateItem(item);
		}
	}

	private void updateItem(Item item) {
		foo(item);

		if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
			item.sellIn = item.sellIn - 1;
		}

		doSellInLessThanZero(item);
	}

	private void doSellInLessThanZero(Item item) {
		if (item.sellIn >= 0) {
			return;
		}
		if (!item.name.equals("Aged Brie")) {
			if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
				if (item.quality > 0) {
					if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
						item.quality = item.quality - 1;
					}
				}
			} else {
				item.quality = item.quality - item.quality;
			}
		} else {
			incrementQuality(item);
		}
	}

	private void incrementQuality(Item item) {
		if (item.quality < 50) {
			item.quality = item.quality + 1;
		}
	}

	private void foo(Item item) {
		if (!item.name.equals("Aged Brie") && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
			if (item.quality > 0) {
				if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
					item.quality = item.quality - 1;
				}
			}
		} else {
			if (item.quality < 50) {
				item.quality = item.quality + 1;

				if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
					if (item.sellIn < 11) {
						incrementQuality(item);
					}

					if (item.sellIn < 6) {
						incrementQuality(item);
					}
				}
			}
		}
	}
}
