package me.ssu.objectoriented.domains.audience;

import me.ssu.objectoriented.domains.bag.Bag;

/**
 * Fourth Step, 소지품을 보관할 수 있는 관람객
 *
 */
public class Audience {

    private Bag bag;    // 가방

    /**
     * 가방을 소유할 수 있는 관람객 객체 상태
     * @param bag
     */
    public Audience(Bag bag) {
        this.bag = bag;
    }

    // TODO 가방을 소지할 수 있는 관람객
    public Bag getBag() {
        return bag;
    }
}
