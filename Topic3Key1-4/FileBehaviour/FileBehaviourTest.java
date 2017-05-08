package FileBehaviour;

import static org.junit.Assert.*;

import org.junit.Test;

public class FileBehaviourTest {

	@Test
	public void testEmptyList() {

		FileSystem fileSystem = new FileSystem();
		assertEquals(fileSystem.getRecentFileList().isEmpty(), true);

	}

	@Test
	public void testAddingFile() {
		FileSystem fileSystem = new FileSystem();
		fileSystem.openFile("file1");
		MyFile file = fileSystem.getRecentFileList().getFile("file1");
		assertEquals(fileSystem.getRecentFileList().contains(file), true);

	}

	@Test
	public void testBumpedToTop() {
		FileSystem fileSystem = new FileSystem();

		fileSystem.openFile("file1");
		fileSystem.openFile("file2");
		fileSystem.openFile("file3");
		fileSystem.openFile("file2");
		MyFile file = fileSystem.getRecentFileList().getFile("file2");
		assertEquals(file, fileSystem.getRecentFileList().getFiles().get(0));

	}

	@Test
	public void testRemoveOldest() {

		FileSystem fileSystem = new FileSystem();

		fileSystem.openFile("file1");
		fileSystem.openFile("file2");
		fileSystem.openFile("file3");
		fileSystem.openFile("file4");
		fileSystem.openFile("file5");
		fileSystem.openFile("file6");
		MyFile oldestFile = fileSystem.getRecentFileList().getFile("fileName1");
		assertEquals(oldestFile, null);

	}

}
