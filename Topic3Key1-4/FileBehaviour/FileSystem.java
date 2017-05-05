package FileBehaviour;

public class FileSystem {


	private RecentFileList recentFileList;

	public FileSystem() {

		recentFileList = new RecentFileList();
	}

	public RecentFileList getRecentFileList() {
		return recentFileList;
	}

	public void openFile(String fileName) {
		
		MyFile file = recentFileList.getFile(fileName);

		if (file == null) {
			file = new MyFile(fileName);
			recentFileList.addFile(file);
		} else {
			recentFileList.bump(file);
		}
	}

	public void showRecentFileList() {

		for (MyFile file : recentFileList.getFiles()) {
			System.out.println(file.getName());
		}

}
}
