//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameHelper {
    private static final String alphabet = "abcdefg";
    private int gridLength = 7;
    private int gridSize = 49;
    private int[] grid;
    private int comCount;

    public GameHelper() {
        this.grid = new int[this.gridSize];
        this.comCount = 0;
    }

    public String getUserInput(String var1) {
        String var2 = null;
        System.out.print(var1 + "  ");

        try {
            BufferedReader var3 = new BufferedReader(new InputStreamReader(System.in));
            var2 = var3.readLine();
            if (var2.length() == 0) {
                return null;
            }
        } catch (IOException var4) {
            System.out.println("IOException: " + var4);
        }

        return var2.toLowerCase();
    }

    public ArrayList<String> placeDotCom(int var1) {
        ArrayList var2 = new ArrayList();
        String[] var3 = new String[var1];
        String var4 = null;
        int[] var5 = new int[var1];
        int var6 = 0;
        boolean var7 = false;
        boolean var8 = false;
        ++this.comCount;
        int var9 = 1;
        if (this.comCount % 2 == 1) {
            var9 = this.gridLength;
        }

        int var10;
        while(!var7 & var6++ < 200) {
            int var13 = (int)(Math.random() * (double)this.gridSize);
            var10 = 0;
            var7 = true;

            while(var7 && var10 < var1) {
                if (this.grid[var13] == 0) {
                    var5[var10++] = var13;
                    var13 += var9;
                    if (var13 >= this.gridSize) {
                        var7 = false;
                    }

                    if (var10 > 0 & var13 % this.gridLength == 0) {
                        var7 = false;
                    }
                } else {
                    var7 = false;
                }
            }
        }

        var10 = 0;
        boolean var11 = false;

        for(boolean var12 = false; var10 < var1; ++var10) {
            this.grid[var5[var10]] = 1;
            int var14 = var5[var10] / this.gridLength;
            int var15 = var5[var10] % this.gridLength;
            var4 = String.valueOf("abcdefg".charAt(var15));
            var2.add(var4.concat(Integer.toString(var14)));
        }

        return var2;
    }
}
