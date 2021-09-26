package innerclass;

public class Button {
	
	private OnClickListener listener;
	
	interface OnClickListener{
		public void onClick();
	}
	
	// set()
	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
	
	public void touch() {
		listener.onClick();
	}
	
}
