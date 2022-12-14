import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		char[] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int i=0;

		for (char a: hex) {
			for (char b: hex) {
				for (char c: hex) {
					for (char d: hex) {
						for (char e: hex) {
							for (char f: hex) {
								System.out.print("<div style='background-color:#");
								System.out.print(a);
								System.out.print(b);
								System.out.print(c);
								System.out.print(d);
								System.out.print(e);
								System.out.print(f);
								System.out.println(";'>&nbsp;</div>");

								i++;
								if (i==1000) {
									return;
								}
							}
						}
					}
				}
			}
		}

		
	}
}