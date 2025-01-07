package session2;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;



public class Activity14 {

	public static void main(String[] args) throws IOException {
		try
		{
			// TODO Auto-generated method stub
			File file = new File("C:/RestAssured_Training/workspace/fst-java-m1/src/main/java/session2/deepthi.txt");
			boolean fStatus = file.createNewFile();
			if(fStatus) {
				System.out.println("File created successfully!");
			} else {
				System.out.println("File already exists at this path.");
			}
			File fileUtil = FileUtils.getFile("C:/RestAssured_Training/workspace/fst-java-m1/src/main/java/session2/deepthi.txt");
			System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));
			//Create directory
			File destDir = new File("resources");
			//Copy file to directory
			FileUtils.copyFileToDirectory(file, destDir);
			//Get file from new directory
			File newFile = FileUtils.getFile(destDir, "deepthi.txt");
			//Read data from file
			String newFileData = FileUtils.readFileToString(newFile, "UTF8");
			//Print it
			System.out.println("Data in new file: " + newFileData);
		} catch(IOException errMessage) {
			System.out.println(errMessage);
		}
	}

}
