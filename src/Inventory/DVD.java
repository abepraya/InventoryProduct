package Inventory;

public class DVD extends Product {
	private String FilmStudio;
	private int LengthFilm;
	private int AgeRating;

	public DVD(String nameProduct, String FilmStudio, int AgeRating, int LengthFilm, int qty, double priceItem,
			int itemNumber) {
		super(itemNumber, nameProduct, qty, priceItem);
		this.LengthFilm = LengthFilm;
		this.AgeRating = AgeRating;
		this.FilmStudio = FilmStudio;
	}

	public String getFilmStudio() {
		return FilmStudio;
	}

	public void setFilmStudio(String filmStudio) {
		FilmStudio = filmStudio;
	}

	public int getLengthFilm() {
		return LengthFilm;
	}

	public void setLengthFilm(int lengthFilm) {
		LengthFilm = lengthFilm;
	}

	public int getAgeRating() {
		return AgeRating;
	}

	public void setAgeRating(int ageRating) {
		AgeRating = ageRating;
	}
	
	@Override
	public double getInventoryValue() {
		return priceItem * qty * 1.05;
	}
	
	@Override
	public String toString() {
//		Product baseClass = new Product();
		return  "Item Number\t\t: "+ this.getItemNumber() + "\n" +
				"Name\t\t\t: " +this.getNameProduct() + "\n" +
				"Movie Length\t\t: " + this.getLengthFilm() + "\n" +
				"Age Rating\t\t: " + this.getAgeRating() + "\n" +
				"Film Studio\t\t: " + this.getFilmStudio() + "\n" +
				"Quantity in stock\t: " + this.getQty() + "\n" +
				"Price\t\t\t: " + this.getPriceItem() + "\n" +
				"Stock Value\t\t: " + this.getInventoryValue() + "\n" +
				"Product Status\t\t: " + (this.getItemStatus()? "Active" : "Discontinued") + "\n\n" ;
	}

}
