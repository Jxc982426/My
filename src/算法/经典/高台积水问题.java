package 算法.经典;

/*
凹凸不平的地面每当下雨的时候总会积水。假设地面是一维的，每一块宽度都为1，高度是非负整数，那么可以用一个数组来表达一块地面。
例如[0,1,0,2,1,0,1,3,2,1,2,1]可以用来表示下图地面：

*/

public class 高台积水问题 {


    public static void main(String[] args) {
        MyTest2 myTest2 = new MyTest2();
        myTest2.test2();
        MyTest1 myTest1 = new MyTest1();
        myTest1.test1();
    }


}

class MyTest1 {
    //基本思路：
    // 1. 找到最高的墙，记录位置高度
    // 2. 从两边向中间遍历，分别记录两边最高的墙，
    // 3. 若遇到比maxHigh低的墙，则积水 + （maxHigh - 当前墙的高度）
    // 4. 找到最高的墙，结束
    private int[] array = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    private int mount = 0;

    private int MaxHigh = 0;
    private int MaxPosition = 0;

    private int leftMaxHigh = 0;
    private int rightMaxHigh = 0;

    void test1() {
        Max();
        process();
    }

    void Max() {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > MaxHigh) {
                MaxHigh = array[i];
                MaxPosition = i;
            }
        }
    }

    void process() {
        int start = 0;
        int end = array.length - 1;

        for (; start < MaxPosition; start++) {
            if (array[start] >= leftMaxHigh) {
                leftMaxHigh = array[start];
            } else {
                mount += (leftMaxHigh - array[start]);
            }
        }
        for (; end > MaxPosition; end--) {
            if (array[end] >= rightMaxHigh) {
                rightMaxHigh = array[end];
            } else {
                mount += (rightMaxHigh - array[end]);
            }
        }

        System.out.println("最高位置：" + MaxPosition);
        System.out.println("最高高度：" + MaxHigh);
        System.out.println("积水：" + mount);
    }
}


class MyTest2 {
    private int[] array = new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
    private int mount = 0;

    void test2() {
        // 总层数
        int top = 0;
        // 当前层
        int level = 0;
        // 是否存在左墙
        boolean haveLeft = false;
        // 单层累加
        int subMount = 0;

        // 一层一层计算
        while (true) {
            for (int val : array) {
                if (level == 0) {
                    // 第一次循环需要计算总层数
                    if (val > top) {
                        top = val;
                    }
                }
                if (haveLeft) {
                    if (val <= level) {
                        subMount++;
                    } else {
                        // 发现右墙，那么结算
                        mount = mount + subMount;
                        subMount = 0;
                    }
                } else {
                    haveLeft = val > level;
                }
            }
            // 达到最顶层那么跳出循环
            level++;
            if (level == top) {
                break;
            }
            // 计算下一层，那么单层累加需要清空，左墙也需要清空
            subMount = 0;
            haveLeft = false;
        }
        System.out.println(mount);
    }
}

