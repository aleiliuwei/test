package sample.web.thymeleaf3;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.io.FileUtils;


public class Test {
	
	public static void main(String[] args) throws IOException {
		String srcDirPath = "G:\\JavaEE开发的颠覆者 Spring Boot实战\\SourceCode"; 
		//转为UTF-8编码格式源码路径 
		String utf8DirPath = "G:\\JavaEE开发的颠覆者 Spring Boot实战\\SourceCode1"; 
		
		
		//获取所有java文件 
		List<File> javaGbkFileCol = getListFiles(new File(srcDirPath)); 
		        
		for (File javaGbkFile : javaGbkFileCol) { 
		      //UTF8格式文件路径 
		      String utf8FilePath = utf8DirPath+javaGbkFile.getAbsolutePath().substring(srcDirPath.length()); 
		       //使用GBK读取数据，然后用UTF-8写入数据 
		      FileUtils.writeLines(new File(utf8FilePath), "UTF-8", FileUtils.readLines(javaGbkFile));        
		}
	}
	
	/*** 
     * 获取指定目录下的所有的文件（不包括文件夹），采用了递归 
     *  
     * @param obj 
     * @return 
     */  
    public static List<File> getListFiles(Object obj) {  
        File directory = null;  
        if (obj instanceof File) {  
            directory = (File) obj;  
        } else {  
            directory = new File(obj.toString());  
        }  
        List<File> files = new ArrayList<File>();  
        if (directory.isFile()) {  
            files.add(directory);  
            return files;  
        } else if (directory.isDirectory()) {  
            File[] fileArr = directory.listFiles();  
            for (int i = 0; i < fileArr.length; i++) {  
                File fileOne = fileArr[i];  
                files.addAll(getListFiles(fileOne));  
            }  
        }  
        return files;  
    }  

}
