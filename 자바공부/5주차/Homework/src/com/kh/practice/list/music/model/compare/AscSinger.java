package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscSinger implements Comparator<Music> {

	public int compare(Music music1, Music music2) {

		return music2.getSinger().compareTo(music1.getSinger());
	}
}
