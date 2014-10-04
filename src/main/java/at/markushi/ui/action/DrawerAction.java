package at.markushi.ui.action;

public class DrawerAction extends Action {

	public DrawerAction() {

		final float startX = 0.1375f;
		final float endX = 1f - startX;
		final float endY = 0.707f;
		final float startY = 1f - endY;
		final float center = 0.5f;

		lineData = new float[]{
				// line 1
				startX, startY, endX, startY,
				// line 2
				startX, center, endX, center,
				// line 3
				startX, endY, endX, endY,};
	}
}