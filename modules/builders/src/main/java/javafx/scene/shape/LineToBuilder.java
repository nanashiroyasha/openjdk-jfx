/* 
 * Copyright (c) 2011, 2013, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

package javafx.scene.shape;

/**
Builder class for javafx.scene.shape.LineTo
@see javafx.scene.shape.LineTo
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public class LineToBuilder<B extends javafx.scene.shape.LineToBuilder<B>> extends javafx.scene.shape.PathElementBuilder<B> implements javafx.util.Builder<javafx.scene.shape.LineTo> {
    protected LineToBuilder() {
    }
    
    /** Creates a new instance of LineToBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static javafx.scene.shape.LineToBuilder<?> create() {
        return new javafx.scene.shape.LineToBuilder();
    }
    
    private int __set;
    public void applyTo(javafx.scene.shape.LineTo x) {
        super.applyTo(x);
        int set = __set;
        if ((set & (1 << 0)) != 0) x.setX(this.x);
        if ((set & (1 << 1)) != 0) x.setY(this.y);
    }
    
    private double x;
    /**
    Set the value of the {@link javafx.scene.shape.LineTo#getX() x} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B x(double x) {
        this.x = x;
        __set |= 1 << 0;
        return (B) this;
    }
    
    private double y;
    /**
    Set the value of the {@link javafx.scene.shape.LineTo#getY() y} property for the instance constructed by this builder.
    */
    @SuppressWarnings("unchecked")
    public B y(double x) {
        this.y = x;
        __set |= 1 << 1;
        return (B) this;
    }
    
    /**
    Make an instance of {@link javafx.scene.shape.LineTo} based on the properties set on this builder.
    */
    public javafx.scene.shape.LineTo build() {
        javafx.scene.shape.LineTo x = new javafx.scene.shape.LineTo();
        applyTo(x);
        return x;
    }
}
