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

package javafx.scene.input;

/**
Builder class for javafx.scene.input.KeyCodeCombination
@see javafx.scene.input.KeyCodeCombination
@deprecated This class is deprecated and will be removed in the next version
* @since JavaFX 2.0
*/
@javax.annotation.Generated("Generated by javafx.builder.processor.BuilderProcessor")
@Deprecated
public final class KeyCodeCombinationBuilder implements javafx.util.Builder<javafx.scene.input.KeyCodeCombination> {
    protected KeyCodeCombinationBuilder() {
    }
    
    /** Creates a new instance of KeyCodeCombinationBuilder. */
    @SuppressWarnings({"deprecation", "rawtypes", "unchecked"})
    public static javafx.scene.input.KeyCodeCombinationBuilder create() {
        return new javafx.scene.input.KeyCodeCombinationBuilder();
    }
    
    private javafx.scene.input.KeyCombination.ModifierValue alt;
    /**
    Set the value of the {@link javafx.scene.input.KeyCodeCombination#getAlt() alt} property for the instance constructed by this builder.
    */
    public javafx.scene.input.KeyCodeCombinationBuilder alt(javafx.scene.input.KeyCombination.ModifierValue x) {
        this.alt = x;
        return this;
    }
    
    private javafx.scene.input.KeyCode code;
    /**
    Set the value of the {@link javafx.scene.input.KeyCodeCombination#getCode() code} property for the instance constructed by this builder.
    */
    public javafx.scene.input.KeyCodeCombinationBuilder code(javafx.scene.input.KeyCode x) {
        this.code = x;
        return this;
    }
    
    private javafx.scene.input.KeyCombination.ModifierValue control;
    /**
    Set the value of the {@link javafx.scene.input.KeyCodeCombination#getControl() control} property for the instance constructed by this builder.
    */
    public javafx.scene.input.KeyCodeCombinationBuilder control(javafx.scene.input.KeyCombination.ModifierValue x) {
        this.control = x;
        return this;
    }
    
    private javafx.scene.input.KeyCombination.ModifierValue meta;
    /**
    Set the value of the {@link javafx.scene.input.KeyCodeCombination#getMeta() meta} property for the instance constructed by this builder.
    */
    public javafx.scene.input.KeyCodeCombinationBuilder meta(javafx.scene.input.KeyCombination.ModifierValue x) {
        this.meta = x;
        return this;
    }
    
    private javafx.scene.input.KeyCombination.ModifierValue shift;
    /**
    Set the value of the {@link javafx.scene.input.KeyCodeCombination#getShift() shift} property for the instance constructed by this builder.
    */
    public javafx.scene.input.KeyCodeCombinationBuilder shift(javafx.scene.input.KeyCombination.ModifierValue x) {
        this.shift = x;
        return this;
    }
    
    private javafx.scene.input.KeyCombination.ModifierValue shortcut;
    /**
    Set the value of the {@link javafx.scene.input.KeyCodeCombination#getShortcut() shortcut} property for the instance constructed by this builder.
    */
    public javafx.scene.input.KeyCodeCombinationBuilder shortcut(javafx.scene.input.KeyCombination.ModifierValue x) {
        this.shortcut = x;
        return this;
    }
    
    /**
    Make an instance of {@link javafx.scene.input.KeyCodeCombination} based on the properties set on this builder.
    */
    public javafx.scene.input.KeyCodeCombination build() {
        javafx.scene.input.KeyCodeCombination x = new javafx.scene.input.KeyCodeCombination(this.code, this.shift, this.control, this.alt, this.meta, this.shortcut);
        return x;
    }
}
