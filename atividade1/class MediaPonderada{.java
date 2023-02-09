class  MediaPonderada{
	public static void main(String[]args){
		int n1 = 2;
		int n2 = 4;
		int n3 = 6;
		
		int p1 = 10;
		int p2 = 10;
		int p3 = 10; 

		int soma_peso = p1 + p2 + p3;

		double media = (((n1 * p1) +(n2 * p2) + (n3 * p3)) / soma_peso);
		Sydtem.out.println(media);

	}
}


