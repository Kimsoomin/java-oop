package encapsule;

public class Casino {
	// 멤버 필드
	private String winner;
	private String loser;
	private int winnum;
	public int getWinnum() {
		return winnum;
	}

	public int getLosenum() {
		return losenum;
	}

	public void setWinnum(int winnum) {
		this.winnum = winnum;
	}

	public void setLosenum(int losenum) {
		this.losenum = losenum;
	}

	private int losenum;

	public Casino(Card p1, Card p2) {
		if (p1.setNumber() > p2.setNumber()) {
			winner = p1.getName();
			loser = p2.getName();
			winnum = p1.getNumber();
			losenum = p2.getNumber();
		} else {
			winner = p2.getName();
			loser = p1.getName();
			winnum = p2.getNumber();
			losenum = p1.getNumber();
		}
	}

	@Override
	public String toString() {
		return "승자 " +winner+ " 의 점수: " +winnum+ "\n"
				+"패자 " +loser+ " 의 점수: " +losenum;
	}

	public Casino() {
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public String getLoser() {
		return loser;
	}

	public void setLoser(String loser) {
		this.loser = loser;
	}
}
