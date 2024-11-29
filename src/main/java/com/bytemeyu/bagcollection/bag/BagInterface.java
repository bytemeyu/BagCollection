package com.bytemeyu.bagcollection.bag;

import java.lang.reflect.Array;
import java.util.ArrayList;

public interface BagInterface {
    public abstract boolean addItem(String item);
    public abstract boolean removeItem(String item);
    public abstract ArrayList showItens();
}
