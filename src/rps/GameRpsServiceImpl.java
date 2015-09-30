package rps;

import java.lang.invoke.SwitchPoint;

// 서비스 구현 객체

public class GameRpsServiceImpl implements GameRpsService {

	private int result;
	private int a;
	GameRps game = new GameRps();
	@Override
	public String getResult(int a) {
		String result = "";
		switch (a) {
		case 1 : result = "승리"; break;
		case 2 : result = "패배"; break;
		case 3 : result = "비김"; break;
		default:break;
		}
		return result;
	}

	@Override
	public String playGame(int a, int b) {
		int win = 0;
		if (a==b){
			return getResult(3);
		}
		switch (Math.abs(a-b)) {
		case 1:win = (a>b) ? a : b; break;
		case 2:win = (a>b) ? b : b; break;
		default:
		
			break;
		}
		String winner = (win==a)?"당신":"컴퓨터";
		game.setRpsVal(a);
		String userRPS = game.getRpsVal();
		game.setRpsVal(b);
		String comRps = game.getRpsVal();
		return "컴퓨터는" +comRps+ "이고, 당신은" +userRPS+ "이므로" + winner+"이(가) 이겼습니다.";
				
}
	
	
	
	
}

	
	
	


