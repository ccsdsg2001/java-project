import java.util.Scanner;

public class 井字棋二位数组 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int [][]a=new int[n][n];
        boolean gotResult=false;
        int numFX=0;
        int numFO=0;

        if(n>=3&&n<=100)
            //读入矩阵
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    a[i][j]=in.nextInt();
                }
            }

        //检查行
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(a[i][j]==1){
                    numFX++;//如果是1则numFX加1
                }else{
                    numFO++;//如果是0则numFO加1
                }
            }
            if(numFO==n||numFX==n){//判断一行内是否出现n个0或1
                gotResult=true;
                break;
            }
            numFO=0;//计数清零
            numFX=0;
        }

        //检查列
        if(!gotResult){
            numFO=0;
            numFX=0;
            for(int j=0;j<n;j++){
                for(int i=0;i<n;i++){
                    if(a[i][j]==1){
                        numFX++;
                    }else{
                        numFO++;
                    }
                }
                if(numFO==n||numFX==n){
                    gotResult=true;
                    break;
                }
                numFO=0;
                numFX=0;
            }
        }

        //检查反对角线
        if(!gotResult){
            numFO=0;
            numFX=0;
            for(int i=0;i<n;i++){
                if(a[i][n-i-1]==1){
                    numFX++;
                }else{
                    numFO++;
                }
            }
            if(numFO==n||numFX==n){
                gotResult=true;
            }
        }

        //检查对角线
        if(!gotResult){
            numFO=0;
            numFX=0;
            for(int i=0;i<n;i++){
                if(a[i][i]==1){
                    numFX++;
                }else{
                    numFO++;
                }
            }
            if(numFO==n||numFX==n){
                gotResult=true;
            }
        }

        //判断
        if(gotResult){
            if(numFX==n){
                System.out.println("X");
            }else if(numFO==n){
                System.out.println("O");
            }
        }
        if(!gotResult){
            System.out.println("NIL");
        }

    }

}