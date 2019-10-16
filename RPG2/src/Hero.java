
public class Hero {
	private String name = "ミナト";
	private int hp = 100;
	public void attack (Matango m) {
		System.out.println(this.name+"の攻撃！");
	m.hp -= 5;
		System.out.println("5ポイントのダメージを与えた！");
	}

	public void run() {
		System.out.println(this.name + "は逃げ出した！");
		}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}
}
