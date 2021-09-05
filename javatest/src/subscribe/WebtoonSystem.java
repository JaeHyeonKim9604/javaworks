package subscribe;

public class WebtoonSystem {
	
	public void SubMessage(SubWeb subweb) {
		System.out.println("subscribe complite : " + subweb.getName());
	}

	public static void main(String[] args) {
		WebtoonSystem wts = new WebtoonSystem();
		Yoomi ym = new Yoomi();
		Horang hr = new Horang();
		DenQ dq = new DenQ();
		
		wts.SubMessage(ym);
		wts.SubMessage(hr);
		wts.SubMessage(dq);
	}

}
