package at.markushi.ui.action;

public class CloseAction extends Action {

	public CloseAction() {
		final float start = 0.239375f;
		final float end = 1f - start;

		lineData = new float[]{
				// line 1
				start, start, end, end,
				// line 2
				start, end, end, start,
				// line 3
				start, start, end, end,};
	}
}