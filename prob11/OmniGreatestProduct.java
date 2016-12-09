import java.util.List;
import java.util.ArrayList;
import java.io.*;

public class OmniGreatestProduct {

  public static void main(String[] args) {
    String line;
    String fileName = "grid.txt";
    String[][] stringGrid = new String[20][20];
    long[][] grid = new long[20][20];
    List<String> lines = new ArrayList<>();
    try {
      BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
      while((line = bufferedReader.readLine()) != null) {
        lines.add(line);
      }
      bufferedReader.close();
    } catch(FileNotFoundException ex) {
        System.out.println("Unable to open file '" + fileName + "'");
    } catch(IOException ex) {
        System.out.println("Error reading file '" + fileName + "'");
    }

    for(int i = 0; i < lines.size(); i++) {
      stringGrid[i] = lines.get(i).split(" ");
      for(int j = 0; j < stringGrid[i].length; j++) {
        grid[i][j] = Long.parseLong(stringGrid[i][j]);
      }
    }

    long greatestProduct = 0;
    long[] products = new long[4];
    products[0] = horizontalProduct(grid);
    products[1] = verticalProduct(grid);
    products[2] = diagnonalRightProduct(grid);
    products[3] = diagnonalLeftProduct(grid);
    for(int i = 0; i < products.length; i++) {
      if(products[i] > greatestProduct)
        greatestProduct = products[i];
    }

    System.out.println(greatestProduct);

  }

  public static long horizontalProduct(long[][] grid) {
    long greatestProduct = 0;
    long product = 0;
    for(int i = 0; i < grid.length; i++) {
      for(int j = 0; j < grid[0].length - 3; j++) {
        product = grid[i][j]*grid[i][j+1]*grid[i][j+2]*grid[i][j+3];
        if(product > greatestProduct) {
          greatestProduct = product;
        }
      }
    }
    return greatestProduct;
  }

  public static long verticalProduct(long[][] grid) {
    long greatestProduct = 0;
    long product = 0;
    for(int i = 0; i < grid[0].length; i++) {
      for(int j = 0; j < grid.length - 3; j++) {
        product = grid[j][i]*grid[j+1][i]*grid[j+2][i]*grid[j+3][i];
        if(product > greatestProduct) {
          greatestProduct = product;
        }
      }
    }
    return greatestProduct;
  }

  public static long diagnonalRightProduct(long[][] grid) {
    long greatestProduct = 0;
    long product = 0;
    for(int i = 0; i < grid.length - 3; i++) {
      for(int j = 0; j < grid[0].length - 3; j++) {
        product = grid[i][j]*grid[i+1][j+1]*grid[i+2][j+2]*grid[i+3][j+3];
        if(product > greatestProduct) {
          greatestProduct = product;
        }
      }
    }
    return greatestProduct;
  }

  public static long diagnonalLeftProduct(long[][] grid) {
    long greatestProduct = 0;
    long product = 0;
    for(int i = 0; i < grid.length-3; i++) {
      for(int j = 3; j < grid[0].length; j++) {
        product = grid[i][j]*grid[i+1][j-1]*grid[i+2][j-2]*grid[i+3][j-3];
        if(product > greatestProduct) {
          greatestProduct = product;
        }
      }
    }
    return greatestProduct;
  }

}
