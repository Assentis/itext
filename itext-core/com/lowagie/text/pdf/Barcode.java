package com.lowagie.text.pdf;

import java.awt.Color;
import java.awt.Image;

public interface Barcode {
    /** Creates a <CODE>java.awt.Image</CODE>. This image only contains the bars without any text.
     * @param foreground the color of the bars
     * @param background the color of the background
     * @return the image
     */
    Image createAwtImage(Color foreground, Color background);
}
