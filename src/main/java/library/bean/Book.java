package library.bean;

public class Book extends Entity{
	
	private String title;
	private Author author;
	private int year;
	private String authorDetails;
	
	public Book() {
		super();
	}
	
	public Book(int id) {
		super(id);
	}
	public Book(int id, String title, Author author) {
		super(id);
		this.title = title;
		this.author = author;
	}
	
	public int getYear() {
		return year;
	}

	public String getAuthorDetails() {
		return authorDetails;
	}

	public void setAuthorDetails(String authorDetails) {
		this.authorDetails = authorDetails;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((authorDetails == null) ? 0 : authorDetails.hashCode());
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + year;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (authorDetails == null) {
			if (other.authorDetails != null)
				return false;
		} else if (!authorDetails.equals(other.authorDetails))
			return false;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (year != other.year)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\"" + title + "\"" + " by " + author;
	}

}
