package org.aion.p2p;

public interface IMsgCvt<T, V> {
    T cvt(V v);
}
