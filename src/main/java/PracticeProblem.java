import java.io.*;
import java.util.Scanner;
public class PracticeProblem {

	public static void main(String args[]) {
		
	}
public static String getName(int line, String file){
	Scanner fs = null;
String name = "";
	try{
fs = new Scanner(new File(file));
for (int i = 1; i < line; i++){
	fs.nextLine();
}
if(fs.hasNext()){
	name = fs.next() + " ";
	name = name + fs.next();
}
}
	catch(FileNotFoundException e){
		return "";
	}
	finally {
		if (fs != null) {
			fs.close();
		}
	}
	return name;
}

public static int getAge(int line, String file){
	Scanner fs = null;
int age = -1;
if(line<1){
	return -1;
}
try{
	fs = new Scanner(new File(file));
	if(fs.hasNext()){
		for (int i = 1; i < line; i++){
			if(fs.hasNextLine()){
				fs.nextLine();

			}
		}
		if(fs.hasNext()){
			fs.next();
			fs.next();
			age = fs.nextInt();
		}
		
	}
}
	catch(FileNotFoundException e){
	}
	finally {
		if (fs != null) {
			fs.close();
		}
	}
	return age;
}


public static int getNumber(int line, String file){
	Scanner fs = null;
int number = -1;
	try{
fs = new Scanner(new File(file));
for (int i = 1; i < line; i++){
	if(fs.hasNextLine()){
		fs.nextLine();
	}
}
if(fs.hasNext()){
	fs.next();
	fs.next();
	fs.next();
	number = fs.nextInt();
}

	}
	catch(FileNotFoundException e){
	}
	finally {
		if (fs != null) {
			fs.close();
		}
	}
	return number;
}

public static void fileAppend(String output, String fileName){
BufferedWriter bw = null;

try{
	bw = new BufferedWriter(new FileWriter(fileName, true));
	bw.write(output);
}
catch(IOException e){
}
finally{
	try{
		if (bw != null){
			bw.close();
		}
	}
	catch(IOException e){

	}
}

}
}
