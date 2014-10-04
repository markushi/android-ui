package at.markushi.ui.action;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * A LineSegment describes which lines within an Action are linked together
 */
public class LineSegment implements Parcelable {

	public int[] indexes;

	public LineSegment(int... indexes) {
		this.indexes = indexes;
	}

	public int getStartIdx() {
		return indexes[0];
	}

	@Override
	public int describeContents() {
		return 0;
	}

	@Override
	public void writeToParcel(Parcel dest, int flags) {
		dest.writeIntArray(this.indexes);
	}

	private LineSegment(Parcel in) {
		this.indexes = in.createIntArray();
	}

	public static final Parcelable.Creator<LineSegment> CREATOR = new Parcelable.Creator<LineSegment>() {
		public LineSegment createFromParcel(Parcel source) {
			return new LineSegment(source);
		}

		public LineSegment[] newArray(int size) {
			return new LineSegment[size];
		}
	};
}