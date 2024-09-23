package src.Extra;

public class Funcoes_String {

	public static void main(String[] args) {
		
		//toLowerCase(),toUpperCase(),trim()->remove espaços
		//substring(inicio),sbstring(inicio,fim)
		//Replace()
		//IndexOf, LastIndexOf
		//str.Split("")
		String original = "- abcd FHI2 ABC abc DeFG -";
		String s01 = original.toLowerCase();
		String s02 = original.toUpperCase();
		String s03 = original.trim();
		String s04 = original.substring(2);
		String s05 = original.substring(2,8);
		String s06 = original.replace("a","x");
		String s07 = original.replace("ABC","123");
		int i = original.indexOf("bc");
		int j = original.lastIndexOf("bc");
		String s = "potato apple lemon";
		
		System.out.println("Original: " + original);
		System.out.println("LowerCase: " + s01);
		System.out.println("UpperCase: " + s02);
		System.out.println("Trim: " + s03);
		System.out.println("Substring: " + s04);
		System.out.println("Substring(inico,fim): " + s05);
		System.out.println("Replace(char): " + s06);
		System.out.println("Replace(String): " + s07);
		System.out.println("IndexOf: " + i);
		System.out.println("LastIndexOf: " + j);
		String [] vet = s.split(" ");
		System.out.println(vet[0]);
		System.out.println(vet[1]);
		System.out.println(vet[2]);
	}

}