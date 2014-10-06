package at.markushi.ui.action;

public class BackAction extends Action {

	public BackAction() {

		final float endX = 0.82f;
		final float startX = 0.21875f;
		final float center = 0.5f;

		lineData = new float[]{
				// line 1
				startX, center, 0.52f, 0.2f,
				// line 2
				startX, center, endX, center,
				// line 2
				startX, center, 0.52f, 0.8f,};

		lineSegments.add(new LineSegment(0, 8));
		lineSegments.add(new LineSegment(4));
	}
}