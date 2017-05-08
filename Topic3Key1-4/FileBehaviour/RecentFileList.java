package FileBehaviour;

import java.util.ArrayList;
import java.util.List;

public class RecentFileList {

	static final int LargeOfList = 5;
	private List<MyFile> files;
	private int fileExistingTime;

	public RecentFileList() {
		files = new ArrayList<MyFile>();
		fileExistingTime = 0;
	}

	public boolean isEmpty() {
		return files.isEmpty();
	}

	public void addFile(MyFile file) {

		this.fileExistingTime++;
		file.setExistingTime(this.fileExistingTime);

		if (!listIsFull()) {
			this.files.add(file);
		} else {
			removeOldest();
			this.files.add(file);
		}
	}

	public void removeOldest() {

		int oldestExistingTime = files.get(0).getExistingTime();
		MyFile oldestFile = files.get(0);

		for (MyFile file : files) {
			if (file.getExistingTime() < oldestExistingTime) {
				oldestFile = file;
				oldestExistingTime = file.getExistingTime();
			}
		}
		files.remove(oldestFile);

	}

	public boolean listIsFull() {

		return (files.size() == RecentFileList.LargeOfList);

	}

	public List<MyFile> getFiles() {
		return files;
	}

	public MyFile getFile(String fileName) {

		MyFile file = null;

		if (fileName != null) {
			for (MyFile file2 : files) {

				if (fileName.equals(file2.getName())) {
					file = file2;
					break;
				}
			}
		}
		return file;
	}

	public boolean contains(MyFile file) {

		return (this.getFile(file.getName()) != null);

	}

	public void bump(MyFile file) {
		files.remove(file);
		files.add(0, file);
	}
}
