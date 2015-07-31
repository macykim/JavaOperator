package swing;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * @ Date: 2015.07.30
 * @ Author: 김청명
 * @ Story: 
 */

public class LottoUI extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
		// serialVersionUID는 시리얼 번호로 클래스 구분 식별번호
	/**========================================== 필드 =========================================**/
	 	Lotto lotto;
	 	JButton btn;
	 	JPanel panelNorth, panelSouth;
	 	ImageIcon icon;
	 	List<JButton> btns;
	 	
	 /**======================================== 생성자 ========================================**/
	 public LottoUI() {
		 /*================== 로또 화면에 들어갈 부품 만들기(객체의 생성자) ====================*/
		 setTitle("로또 발생기");
		 lotto = new Lotto();
		 btns = new ArrayList<JButton>();
		 panelNorth = new JPanel();
		 panelSouth = new JPanel();
		 btn = new JButton("로또 번호 추첨");
		 
		 /*============== 만들어진 부품(객체)들을 큰 객체(프레임객체)에 조립하기 ===============*/
		 btn.addActionListener(this);
		 	// this는 큰객체인 프레임을 가리킴
		 panelNorth.add(btn);
		 add(panelNorth, BorderLayout.NORTH);
		 add(panelSouth, BorderLayout.SOUTH);
		 setBounds(300, 400, 1200, 300);
		 	// 화면에서 x좌표, y좌표, 가로, 세로 길이
		 setVisible(true);
		 
	}
	
	 /**====================================== 멤버메소드 ======================================**/	
	@Override
	public void actionPerformed(ActionEvent e) {
		/*================================ 버튼 객체 6개 만들기 =================================*/
		if (btns.size() == 0) {
			JButton tmp = new JButton();
			for (int i = 0; i < 6; i++) {
				tmp = new JButton();
				btns.add(tmp);
				panelSouth.add(tmp);
			}
		}
		/*================================ 6개의 랜덤숫자 만들기 ================================*/
		lotto.setLotto();
		int[] arr = lotto.getLotto();
		for (int i = 0; i < arr.length; i ++) {
			System.out.print(arr[i] + "\t");
			// 디버깅: 프로그램을 구성하는데 필수적인 소스는 아니지만,
			// 에럽 라생시 에러의 원인을 파악하기 위해 붙여 둔 소스.
		}
		
		/*====================== 6개의 버튼 객체에 아이콘(이미지)를 붙인다 ======================*/
		for (int i = 0; i < arr.length; i++) {
			btns.get(i).setIcon(getIcon(arr[i]));			
		}
	}
	
	// 메소드가 복잡성을 이룰 때, 이를 간소화 하기 위해서
	// Alt + Shift + M으로 메소드 리팩토링을 한다. 
	// 그러나, 지금 상황은, 이 리팩토링을 먼저 하고, 나중에
	// 그 메소드를 완성하는 기법이다.
	
	private void makeBtns() {
		// TODO Auto-generated method stub		
	}
	
	private Icon getIcon(int i) {
		String imgPath = "src/images/" + Integer.toString(i) + ".gif";
		return new ImageIcon(imgPath);
	}

}
