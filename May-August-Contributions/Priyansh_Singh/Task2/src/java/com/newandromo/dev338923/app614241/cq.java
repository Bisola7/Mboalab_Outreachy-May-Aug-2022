/*
 *  
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.support.v7.d.b
 *  com.bumptech.glide.f.a.c
 *  com.bumptech.glide.f.b.g
 *  com.bumptech.glide.h.h
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.newandromo.dev338923.app614241;

import android.graphics.drawable.Drawable;
import android.support.v7.d.b;
import com.bumptech.glide.f.a.c;
import com.bumptech.glide.f.b.g;
import com.bumptech.glide.h.h;
import com.newandromo.dev338923.app614241.ca;
import com.newandromo.dev338923.app614241.cr;

public final class cq
extends cr<b> {
    private ca a;
    private final int b;
    private final int c;

    public final void a(g g2) {
        if (h.a((int)this.b, (int)this.c)) {
            g2.a(this.b, this.c);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: ");
        stringBuilder.append(this.b);
        stringBuilder.append(" and height: ");
        stringBuilder.append(this.c);
        stringBuilder.append(", either provide dimensions in the constructor or call override()");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    @Override
    public final void a(Exception exception, Drawable drawable) {
        super.a(exception, drawable);
    }

    public final /* synthetic */ void a(Object object, c c2) {
        b b2 = (b)object;
        if (this.a != null) {
            this.a.onPaletteReady(b2);
        }
    }

    @Override
    public final void b(Drawable drawable) {
        super.b(drawable);
    }
}

