package 基本概念.Java.排序;


/*
    完全二叉树  以数组存储
        左子树 2*s+1
        右子树 2*s+2
    数组最后一个作为根节点
*/


import org.junit.Test;

public class 堆排序 {
    public static void heapify(int[] arrays, int currentRootNode, int size) {

        if (currentRootNode < size) {
            //左子树和右字数的位置
            int left = 2 * currentRootNode + 1;
            int right = 2 * currentRootNode + 2;

            //把当前父节点位置看成是最大的
            int max = currentRootNode;

            if (left < size) {
                //如果比当前根元素要大，记录它的位置
                if (arrays[max] < arrays[left]) {
                    max = left;
                }
            }
            if (right < size) {
                //如果比当前根元素要大，记录它的位置
                if (arrays[max] < arrays[right]) {
                    max = right;
                }
            }
            //如果最大的不是根元素位置，那么就交换
            if (max != currentRootNode) {
                int temp = arrays[max];
                arrays[max] = arrays[currentRootNode];
                arrays[currentRootNode] = temp;

                //继续比较，直到完成一次建堆
                heapify(arrays, max, size);
            }
        }
    }


    /**
     * 完成一次建堆，最大值在堆的顶部(根节点)
     */
    public static void maxHeapify(int[] arrays, int size) {

        // 从数组的尾部开始，直到第一个元素(角标为0)
        for (int i = size - 1; i >= 0; i--) {
            heapify(arrays, i, size);
        }
    }


    @Test
    public void test1() {
        int[] arrays = {1, 6, 7, 8};
        for (int i = 0; i < arrays.length; i++) {

            //每次建堆就可以排除一个元素了
            maxHeapify(arrays, arrays.length - i);

            //交换
            int temp = arrays[0];
            arrays[0] = arrays[(arrays.length - 1) - i];
            arrays[(arrays.length - 1) - i] = temp;
        }
        for (int array : arrays) {
            System.out.println(array);
        }
    }

    @Test
    public void test2() {
        int[] arrays = {1, 6, 7, 8};

        maxHeapify(arrays, arrays.length);
        //记录数组最大下标的位置
        int size = arrays.length - 1;
        //接下来不断对堆顶执行调整方法heapify()，然后让数组最后一位与当前堆顶（数组第一位）进行交换,反复，即可排序
        for (int i = 0; i < arrays.length - 1; i++) {
            //交换
            int temp = arrays[0];
            arrays[0] = arrays[(arrays.length - 1) - i];
            arrays[(arrays.length - 1) - i] = temp;

            heapify(arrays, 0, size);
            size--;
        }
        for (int array : arrays) {
            System.out.println(array);
        }
    }
}
