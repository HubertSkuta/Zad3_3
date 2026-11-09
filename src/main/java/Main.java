// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {
    
    {
        System.out.println("Tabliczka Mnożenia");

        for (int i = 1; i <=10; i++)

            {
                for (int j = 1; j <= 10; j++)

                    {
                        int wynik = i * j;
                        System.out.printf("%4d", wynik);
                    }

                System.out.println();

            }

    }
  }
  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}