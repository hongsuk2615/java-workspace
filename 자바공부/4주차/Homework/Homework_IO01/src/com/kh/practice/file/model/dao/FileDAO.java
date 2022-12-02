package com.kh.practice.file.model.dao;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDAO {
	
	public boolean checkName(String file) {
		boolean result = false;
		try (FileInputStream fis = new FileInputStream(file)) {
			result = true;
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	public void fileSave(String file, StringBuilder sb) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public StringBuilder fileOpen(String file) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String value = null;
			while ((value = br.readLine()) != null) {
				sb.append(value);
				sb.append("\n");
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb;
	}

	public void fileEdit(String file, StringBuilder sb) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))) {
			bw.write(sb.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	

}
