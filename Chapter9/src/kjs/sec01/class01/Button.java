package kjs.sec01.class01;

public class Button {
	OnClickListener listener;

	public void SetOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}

	public void Touch() {
		if(listener != null)
			listener.Onclick();
	}
	
//	public interface OnClickListener {
//		void Onclick();
//	}
}