public class Mother {



    private int[][] motherDo = {{0, 10, 20}, {1, 11, 21}, {2, 12, 22}};

    public Mother() {
    }

    public void motherToStr(){
        for (int i = 0; i < motherDo.length; i++) {
            for (int j = 0; j < motherDo[i].length; j++) {
                System.out.print(motherDo[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

    }
    public void motherCng(){
        int[] temp = motherDo[0];
        motherDo[0] = motherDo[2];
        motherDo[2] = temp;
    }

    public int[][] getMotherDo() {
        return motherDo;
    }

    public void setMotherDo(int[][] motherDo) {
        this.motherDo = motherDo;
    }
}
