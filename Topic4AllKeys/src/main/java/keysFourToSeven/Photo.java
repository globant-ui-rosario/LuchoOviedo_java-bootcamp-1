package keysFourToSeven;

public class Photo {

	private int photoId;
	private int likes;

	public Photo(int id) {
		photoId = id;
		likes = 0;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getPhotoId() {
		return photoId;
	}

	public void addLike() {
		this.likes++;
	}

}
