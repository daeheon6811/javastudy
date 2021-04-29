package com.douzone.paint.shape;

import com.douzone.paint.i.Drawable;

public abstract class Shape implements Drawable {

	private String linecColor;
	private String fileColor;

	public abstract void draw();

}
