package item10;

public class BookGoodSample {

		private long id;
		private String title;
		private String author;
		private int price;

		public long getId() {
			return id;
		}

		public String getTitle() {
			return title;
		}

		public String getAuthor() {
			return author;
		}

		public int getPrice() {
			return price;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((author == null) ? 0 : author.hashCode());
			result = prime * result + (int) (id ^ (id >>> 32));
			result = prime * result + price;
			result = prime * result + ((title == null) ? 0 : title.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			BookGoodSample other = (BookGoodSample) obj;
			if (author == null) {
				if (other.author != null)
					return false;
			} else if (!author.equals(other.author))
				return false;
			if (id != other.id)
				return false;
			if (price != other.price)
				return false;
			if (title == null) {
				if (other.title != null)
					return false;
			} else if (!title.equals(other.title))
				return false;
			return true;
		}

		public BookGoodSample(long id, String title, String author, int price) {
			super();
			this.id = id;
			this.title = title;
			this.author = author;
			this.price = price;
		}
}
