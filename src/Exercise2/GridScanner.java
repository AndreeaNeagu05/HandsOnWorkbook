package Exercise2;

public class GridScanner {
    public static void main(String[] args) {

        char[][] grid = {
                {'.', '.', '#', '.'},
                {'a', '#', 'b', '.'},
                {'.', '.', '.', '.'}
        };

        rows:
        for(int i=0; i<grid.length; i++){
            for(int j=0; j<grid[i].length; j++)
            {
                char ch = grid[i][j];
                if(ch == '#'){
                    continue;
                }

                if(Character.isDigit(ch)){
                    System.out.println("found digit '" + grid[i][j] + "' at (row=" + i + ", col=" + j + ")");
                    break rows;
                } else{
                    System.out.println("none");
                }
            }
        }
    }
}