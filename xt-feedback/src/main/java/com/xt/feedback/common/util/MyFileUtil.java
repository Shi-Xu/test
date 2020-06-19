package com.xt.feedback.common.util;

import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.io.FileUtils;


public class MyFileUtil {
	public static boolean IsOverWrite=false;
	/**
	 * 修改文件内容：字符串逐行替换
	 *
	 * @param file：待处理的文件
	 * @param oldstr：需要替换的旧字符串
	 * @param newStr：用于替换的新字符串
	 * @throws IOException
	 */
	public static void modifyFileByReplace(File file, String regexOld, String newStr) throws IOException {
        InputStreamReader in=new InputStreamReader(new FileInputStream(file),"UTF-8");
        BufferedReader bufIn = new BufferedReader(in);  
        // 内存流, 作为临时流  
        CharArrayWriter  tempStream = new CharArrayWriter();  
        // 替换  
        String line = null;  
        while ( (line = bufIn.readLine()) != null) {  
            // 替换每行中, 符合条件的字符串  
            line = line.replaceAll(regexOld, newStr);  
            // 将该行写入内存  
            tempStream.write(line);  
            // 添加换行符  
            tempStream.append(System.getProperty("line.separator"));  
        }  
        // 关闭 输入流  
        bufIn.close();  
        // 将内存中的流 写入 文件  
        FileWriter out = new FileWriter(file);  
        tempStream.writeTo(out);  
        out.close();
	}

	/**
	 * 
	 * @param file 待处理的文件
	 * @param regexOlds 需要替换的旧字符串列表，与newStrs一一对应
	 * @param newStrs 用于替换的新字符串列表
	 * @throws IOException
	 */
	public static void modifyFileByListReplace(File file, List<String> regexOlds, List<String> newStrs)
			throws IOException {
		InputStreamReader in=new InputStreamReader(new FileInputStream(file),"UTF-8");
        BufferedReader bufIn = new BufferedReader(in);  
        // 内存流, 作为临时流  
        CharArrayWriter  tempStream = new CharArrayWriter();  
        // 替换  
        String line = null;  
        while ( (line = bufIn.readLine()) != null) {  
        	for (int i=0;i<regexOlds.size();i++) {
        		String regexOld=regexOlds.get(i);
				String newStr=newStrs.get(i);
				// 替换每行中, 符合条件的字符串  
                line = line.replaceAll(regexOld, newStr);  
			}
        	// 将该行写入内存  
            tempStream.write(line);  
            // 添加换行符  
            tempStream.append(System.getProperty("line.separator"));  
        }  
        // 关闭 输入流  
        bufIn.close();  
        // 将内存中的流 写入 文件  
        FileWriter out = new FileWriter(file);  
        tempStream.writeTo(out);  
        out.close();
	}

	/**
	 * 递归搜索文件名包含指定字符串的文件
	 * 
	 * @param folder
	 * @param keyword
	 * @return
	 */
	public static List<File> searchFiles(File folder, final String keyword) {
		List<File> result = new ArrayList<File>();
		if (folder.isFile()) {
			result.add(folder);
			return result;
		}

		File[] subFolders = folder.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				if (name.contains(keyword)) {
					return true;
				}
				return false;
			}
		});

		if (subFolders != null) {
			for (File file : subFolders) {
				if (file.isFile()) {
					// 如果是文件则将文件添加到结果列表中
					result.add(file);
				} else {
					// 如果是文件夹，则递归调用本方法，然后把所有的文件加到结果列表中
					result.addAll(searchFiles(file, keyword));
				}
			}
		}
		return result;
	}
	
	public static List<File> searchDir(File folder, final String keyword) {
		List<File> result = new ArrayList<File>();
		if (folder.isFile()) {
			result.add(folder);
			return result;
		}

		File[] subFolders = folder.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				if (name.contains(keyword)) {
					return true;
				}
				return false;
			}
		});

		if (subFolders != null) {
			for (File file : subFolders) {
				if (file.isFile()) {
					// 如果是文件则将文件添加到结果列表中
					result.add(file);
				} else {
					// 如果是文件夹，则递归调用本方法，然后把所有的文件加到结果列表中
					result.addAll(searchFiles(file, keyword));
				}
			}
		}
		return result;
	}

	public static File copyFile(File folder, String newFileName) throws IOException {
		String pathName = folder.getAbsolutePath();
		String baseUrl = pathName.substring(0, pathName.lastIndexOf(folder.getName()));
		File destFile = new File(baseUrl + newFileName);
		if (destFile.exists() && !IsOverWrite) {
			throw new IOException("目标文件夹已存在："+destFile.getName());
		}
		FileUtils.copyFile(folder, destFile);
		return destFile;
	}
	
	public static File copyDirectory(File sourcedir, String newDirName) throws IOException {
		String pathName = sourcedir.getAbsolutePath();
		String baseUrl = pathName.substring(0, pathName.lastIndexOf(sourcedir.getName()));
		File destFile = new File(baseUrl+ newDirName);
		if (destFile.exists() && !IsOverWrite) {
			throw new IOException("目标文件夹已存在："+destFile.getName());
		}
		FileUtils.copyDirectory(sourcedir, destFile);
		return destFile;
	}

}
