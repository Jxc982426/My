package 算法.经典;

/*
n边形（p0~Pn） 每一条边都是水平或者垂直的，以p0为起始点，将n边形分为k段，每段长度相同，找出所有的等分点。

    ——————————
   |                   |
   |                   |
   |                   |
   |                   | _ _ _ _ _ _
   |                                |
   |                                |
   |                                |
 p0 ————————————————

p0  ( 0, 0 )
p1  ( 0, 7 )
p2  (10, 7 )
p3  (10, 3 )
p4  (16, 3 )
p5  (16, 0 )

6
0 0
0 7
10 7
10 3
16 3
16 0
23

*/


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Math.abs;

public class 多边方形n等分点 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入顶点数：");
        int n = scanner.nextInt();
        int[][] a = new int[n][2];
        多边方形n等分点 func = new 多边方形n等分点();

        for (int i = 0; i < n; i++) {
            System.out.println("请输入第" + i + "个点的位置坐标：");
            a[i][0] = scanner.nextInt();
            a[i][1] = scanner.nextInt();
            func.round(a[i][0], a[i][1]);
        }
        func.round(0, 0);

        System.out.println(func.length);
        System.out.println(func.sides.toString());
        int k = scanner.nextInt();
        func.splitPoint(k);

    }

    private void splitPoint(int k) {

        int splitLength = length / k;

        this.x = 0;
        this.y = 0;
//        sides.remove(0);
//        System.out.println(sides.toString());
        for (int i = 0; i < k; i++) {
            process(splitLength);
        }
    }

    private void process(int splitLength) {

        for (多边方形n等分点.side side : sides) {
            if (side.length == 0){
                continue;
            }
            if (side.length >= splitLength) {
                //splitpoint就在这
                option(side.direction, splitLength);
                System.out.println("等分点位置坐标：(" + this.x + "," + this.y + ")");

                side.length -= splitLength;
                //找下一个splitpoint
                break;
            } else {
                //splitpoint不在这
                option(side.direction, side.length);
                //进行下一条边
                splitLength -= side.length;
                side.length = 0;
            }
        }
    }

    public void option(char direction, int length) {
        switch (direction) {
            case 'w':
                this.y += length;
                break;
            case 'a':
                this.x -= length;
                break;
            case 's':
                this.y -= length;
                break;
            case 'd':
                this.x += length;
                break;
            default:
                System.out.println("ERROR!!!");
        }
    }


    private int x = 0;
    private int y = 0;
    private int length = 0;
    private List<side> sides = new ArrayList<side>();

    private void round(int x, int y) {

        //默认  方向是 s  长度是 0   （将0,0 带入求得）
        char direction = ' ';

        int length = abs(x - this.x);
        if (length != 0) {
            direction = (x - this.x) > 0 ? 'd' : 'a';
        } else {
            length = abs(y - this.y);
            direction = (y - this.y) > 0 ? 'w' : 's';
        }

        this.length += length;
        this.sides.add(new side(direction, length));
        this.x = x;
        this.y = y;

    }

    class side {
        char direction;
        int length;

        @Override
        public String toString() {
            return "side{" +
                    "direction=" + direction +
                    ", length=" + length +
                    '}';
        }

        public side(char direction, int length) {
            this.direction = direction;
            this.length = length;
        }
    }


}
