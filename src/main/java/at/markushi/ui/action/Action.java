package at.markushi.ui.action;

import java.util.ArrayList;
import java.util.List;

import android.graphics.Matrix;
import android.os.Parcel;
import android.os.Parcelable;

/**
 * A action to be drawn by {@link at.markushi.ui.ActionView}
 */
public class Action implements Parcelable {

	// 3 Lines * 4 points each
	public static final int ACTION_SIZE = 12;

	// combination of x/y positions describing the lines
	protected float[] lineData;
	protected List<LineSegment> lineSegments = new ArrayList<LineSegment>(3);
	protected boolean transformed = false;
	protected float size = 1f;

	public Action() {
		
	}

	public Action(float[] lineData, List<LineSegment> lineSegments) {
		this.lineData = lineData;
		if (lineSegments != null) {
			this.lineSegments.addAll(lineSegments);
		}
	}

	public void transform(float translationX, float translationY, float scale, float size) {

		this.size = size;
		this.transformed = true;

		final Matrix m = new Matrix();
		m.preScale(scale, scale);
		m.postTranslate(translationX, translationY);
		m.mapPoints(lineData);
	}

	public void flipHorizontally() {
		// flip x coordinates
		for (int i = 0; i < lineData.length; i += 2) {
			lineData[i] = size - lineData[i];
		}

		// flip line direction
		for (int i = 0; i < lineData.length; i += 4) {
			float x0 = lineData[i];
			float y0 = lineData[i + 1];
			lineData[i + 0] = lineData[i + 2];
			lineData[i + 1] = lineData[i + 3];
			lineData[i + 2] = x0;
			lineData[i + 3] = y0;
		}
	}

	public float[] getLineData() {
		return lineData;
	}

	public List<LineSegment> getLineSegments() {
		return lineSegments;
	}

	public void setLineSegments(List<LineSegment> lineSegments) {
		this.lineSegments = lineSegments;
	}

	public boolean isTransformed() {
		return transformed;
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeFloatArray(this.lineData);
		dest.writeTypedList(lineSegments);
	}

	private Action(Parcel in) {
		this.lineData = in.createFloatArray();
		in.readTypedList(lineSegments, LineSegment.CREATOR);
	}

	public static final Parcelable.Creator<Action> CREATOR = new Parcelable.Creator<Action>() {
		public Action createFromParcel(Parcel source) {
			return new Action(source);
		}

		public Action[] newArray(int size) {
			return new Action[size];
		}
	};
}