package FileBehaviour;

import java.io.File;

public class MyFile extends File {

	private int existingTime;

	public MyFile(String fileName) {
		super(fileName);
	}

	private static final long serialVersionUID = 1L;

	public int getExistingTime() {
		return existingTime;
	}

	public void setExistingTime(int existingTime) {
		this.existingTime = existingTime;
	}

}
