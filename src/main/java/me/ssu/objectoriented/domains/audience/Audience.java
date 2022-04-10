package me.ssu.objectoriented.domains.audience;

import me.ssu.objectoriented.domains.bag.Bag;

/**
 * Four Step, 관람객
 * 소지품을 보관할 수 있는 관람객
 *
 */
public class Audience {

    private Bag bag;    // 가방

    // TODO 가방을 소유할 수 있는 관람객
    public Audience(Bag bag) {
        this.bag = bag;
    }

    /**
     * 가방을 소지할 수 있는 관람객
     * @return
     */
    public Bag getBag() {
        return bag;
    }
}
