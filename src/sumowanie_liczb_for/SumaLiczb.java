package sumowanie_liczb_for;

import java.io.*;

public class SumaLiczb {

    public static void main(String[] args)
        throws IOException

    {
        int a, b, suma = 0;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try
        {
            // Program liczy sume liczb z podanego przedzialu. Przy uzyciu petli for.

            System.out.println("podaj liczbe poczatkowa: ");
            a = Integer.parseInt(br.readLine());
            System.out.println("podaj liczbe koncowa: ");
            b = Integer.parseInt(br.readLine());


            System.out.println("Suma liczb całkowitych\t" + a + " - " + b + "\twynosi: ");

            for (a=a; a<=b; a++)
            {
                suma += a;
            }

            System.out.print(suma);
        }
        catch(NumberFormatException exception)
        {
            System.out.print("Nie poprawne dane, wpisz liczby");
        }
    }
}
