package kjs.sec02.exam03;

public class Button {
	OnClickListener listener;
	
	void setOnClicklistner(OnClickListener listener) {
		this.listener = listener;
	}
	
	void touch() {
		listener.onClick();
	}
	
	static interface OnClickListener {
		void onClick();
	}
}