package Inventory;

public class CD extends Product {
	private String Artist;
	private int NumberOfSongs;
	private String Label;

	public CD(String nameProduct, String Artist, String Label, int NumberOfSongs, int qty, double priceItem,
			int itemNumber) {
		super(itemNumber, nameProduct, qty, priceItem);
		this.Artist = Artist;
		this.NumberOfSongs = NumberOfSongs;
		this.Label = Label;
	}

	public String getArtist() {
		return Artist;
	}

	public void setArtist(String artist) {
		Artist = artist;
	}

	public int getNumberOfSongs() {
		return NumberOfSongs;
	}

	public void setNumberOfSongs(int numberOfSongs) {
		NumberOfSongs = numberOfSongs;
	}

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	@Override
	public String toString() {
//		Product baseClass = new Product();
		return "Item Number\t\t: " + this.getItemNumber() + "\n" 
				+ "Name\t\t\t: " + this.getNameProduct() + "\n"
				+ "Artist\t\t\t: " + this.getArtist() + "\n" 
				+ "Songs on Album\t\t: " + this.getNumberOfSongs() + "\n"
				+ "Record label\t\t: " + this.getLabel() + "\n" 
				+ "Quantity in stock\t: " + this.getQty() + "\n"
				+ "Price\t\t\t: " + this.getPriceItem() + "\n" 
				+ "Stock Value\t\t: " + this.getInventoryValue()
				+ "\n" + "Product Status\t\t: " + (this.getItemStatus() ? "Active" : "Discontinued") 
				+ "\n\n";

	}
}
