package at.markushi.ui.util;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;

public class UiHelper {

	@SuppressWarnings("deprecation")
	public static void setBackground(View view, Drawable d) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
			view.setBackground(d);
		} else {
			view.setBackgroundDrawable(d);
		}
	}

	public static void postInvalidateOnAnimation(View view) {
		if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
			view.postInvalidateOnAnimation();
		} else {
			view.invalidate();
		}
	}
}
