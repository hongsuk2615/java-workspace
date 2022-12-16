package com.practicegui.model;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends javax.swing.JFrame {

	public MainFrame() {
		super();
		this.setBounds(300, 0, 1000, 1000);
		this.setTitle("두더지잡기");
		this.setResizable(false);

		
		Toolkit tk = Toolkit.getDefaultToolkit();
		Image imgDoodugee = tk.getImage("C:\\Users\\hongs\\OneDrive\\문서\\카카오톡 받은 파일\\디그다.jpg");
		JPanel doodugee = new JPanel(){  // 익명 클래스로 만들어줌
			@Override
			public void paint(Graphics g){  // 패널의 paint()함수에서 그려줌
				g.drawImage(imgDoodugee, 0, 0, 1000, 1000, this);

			}

		}; // 두더지화면
		JPanel buttons = new JPanel(); //  각종 버튼이 들어갈 패널
		buttons.setBackground(Color.lightGray); 	
		JTextField userNameInput = new JTextField(15); // 이름입력필드
		

		buttons.add(new JLabel("이름"));
		buttons.add(userNameInput);

		JButton gameStart = new JButton("게임시작");
		JButton record = new JButton("기록");
		
		buttons.add(gameStart);
		buttons.add(record);

		



		
		
		gameStart.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
			// 게임시작버튼 누를시 실행할 내용
			}
		});
		//ActionListener : 인터페이스이기때문에 곧바로 생성 불가.
		//단, 여기서 생성을 하고 싶다면 미완성된 메서드를 완성시키면서 생성 => 익명 클래스 방식
		record.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				//기록 버튼 누를시 실행할 내용
			}
		});
		
		
		this.add(doodugee);
		this.add(buttons,"South");
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
}