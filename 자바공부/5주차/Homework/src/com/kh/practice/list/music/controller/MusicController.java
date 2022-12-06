package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscSinger;
import com.kh.practice.list.music.model.vo.Music;

public class MusicController {

	private List<Music> list = new ArrayList();

	public int addList(Music music) {
		list.add(music);
		return 1;
	}

	public int addAtZero(Music music) {
		list.add(0, music);
		return 1;
	}

	public List printAll() {

		return list;
	}

	public Music searchMusic(String title) {
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index).getTitle().equals(title)) {
				return list.get(index);
			}
		}
		return null;
	}

	public Music removeMusic(String title) {
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index).getTitle().equals(title)) {
				return list.remove(index);
			}
		}
		return null;
	}

	public Music setMusic(String title, Music music) {
		for (int index = 0; index < list.size(); index++) {
			if (list.get(index).equals(music)) {
				list.get(index).setTitle(title);
				return list.get(index);
			}
		}
		return null;
	}

	public int ascTitle() {
		Collections.sort(list);
		return 1;
	}

	public int descSinger() {
		Collections.sort(list,new AscSinger());
		return 1;
	}
}
