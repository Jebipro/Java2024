package kjs.sec02.class042;

public class Button {
	OnClickListener listener;

	public Button SetOnClickListener(OnClickListener listener) {
		this.listener = listener;
		return this;
	}

	public void Touch() {
		if(listener != null)
			listener.OnClick();
	}

	public interface OnClickListener {
		void OnClick();
	}
}