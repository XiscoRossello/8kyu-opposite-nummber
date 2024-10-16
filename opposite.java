// creamos un programa que invierte los numeros, si nos dan un negativo devuelve el positivo y si nos dan un positivo devuelve el negativo

public class opposite
    {
        public static int opposite(int number)
        {
        if (number <0)
          {
          return Math.abs(number);
        }
          else
            {
            return number - 2 * number;
          }
        }
    }
