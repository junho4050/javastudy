package kr.co.ezen;

import com.naver.HeroDAO;
import com.naver.HeroDTO;

public class MainEx {

	public static void main(String[] args) {
		HeroDAO dao = new HeroDAO();
		
		//HeroDTO dto = new HeroDTO("superman", 1, 100, 0, 10, "аж╦т");
		
		//dao.insertHero(dto);
		// HeroDTO dto = dao.selectByMid("superman");
		// HeroDTO dto2 = new HeroDTO("ironman", dto.getLv(),
				                    // dto.getHp(), dto.getExp(),
				                     //dto.getPower(), dto.getWeapon());
		// dao.updateHero(dto2);
		//dao.select();
		dao.deleteHero(new HeroDTO("ironman", 0, 0, 0, 0, null));
		
		

	}

}
