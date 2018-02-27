package org.aion.p2p;

public abstract class MsgBase<T, V> implements IMsg<T, V> {
    public T cvt(V v) {
        return null;
    }
}
