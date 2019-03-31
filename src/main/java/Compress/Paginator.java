package Compress;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import oracle.jrockit.jfr.StringConstantPool;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Paginator {

    private int maxLength;

    public Paginator(int length) {
        maxLength = length;
    }

    public String[] paginate(String string){
        Iterable<String> chunks = Splitter.fixedLength(maxLength).split(string);
        // w nawiasie podajemy inicjalizator
        return Lists.newArrayList(chunks).toArray(new String[0]);
    }
}
