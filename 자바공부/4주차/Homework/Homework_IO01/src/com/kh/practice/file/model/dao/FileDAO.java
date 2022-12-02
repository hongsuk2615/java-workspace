package com.kh.practice.file.model.dao;

import java.io.*;

public class FileDAO {
	
	public boolean checkName(String file) { //단순 파일 생성 제거의 경우 File 객체를 이용하는게 나음.
		boolean result = false;
		try (FileInputStream fis = new FileInputStream(file)) {
			result = true;
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
			e.printStackTrace();
		}
		return result;
	}

	public void fileSave(String file, String sb) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
			bw.write(sb);
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

	public void fileEdit(String file, String sb) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))) {
			bw.write(sb);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	

}
