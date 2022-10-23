package me.ssu.objectoriented._1.domains;

// 관람객(Audience)
public class Audience {
	private Bag bag;    // 가방

	// TODO 1) 관람객의 경우(가방)
	public Audience(Bag bag) {
		this.bag = bag;
	}

	// TODO 2) 가방을 소유할 수 있는 관람객
	public Bag getBag() {
		return bag;
	}
}
