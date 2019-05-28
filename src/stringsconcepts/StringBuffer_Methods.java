package stringsconcepts;

public class StringBuffer_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());/// default capacity is 16
		sb.append("fniuerghiurebviubeiru");
		System.out.println(sb.capacity());
		sb.trimToSize();
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.insert(1, "Tejaswini"));
		System.out.println(sb.charAt(1));
		System.out.println(sb.indexOf("Teja"));
		System.out.println(sb.append(10));
		System.out.println(sb.delete(1, 4));
		System.out.println(sb.reverse());
		
		
		
		
		
		
		
		
		
	}

}
