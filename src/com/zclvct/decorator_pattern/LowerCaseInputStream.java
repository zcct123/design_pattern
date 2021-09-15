package com.zclvct.decorator_pattern;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author zhaochong
 * @version 1.0
 * @description: TODO
 * @date 2021/9/15 14:28
 */
public class LowerCaseInputStream extends FilterInputStream {
    @Override
    public int read() throws IOException {
        int c = super.read();
        return (c == -1 ? c:Character.toLowerCase(c));
    }

    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }
}
