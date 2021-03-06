package 基本概念.Java.多线程;

/*
    类比于工厂流水线
        条件：
            到工厂前的准备
            到工厂时的状态
            一条流水线  一个位置  一个工具  每人一次做五个玩具

        状态：
            新建状态（New）
            就绪状态（Runnable）
            运行状态（Running）
            阻塞状态（Blocked）
            死亡状态（Dead）
        过程：
            我要去上班 new  ->  start()
            整理好上班需要的东西 到了 工厂  runnable  ->  调用
            开始做  running   -> 做完五个  ->  runnable
                              -> 有人打电话（工作无关）wait -> 等待阻塞（工具留下）
                              -> 老板不发工资 不干了 sleep  -> 其他阻塞（把工具带走）  -> 下一个人没工具 -> 同步阻塞
                              -> 我忘记戴手套了（个人需要） -> 其他阻塞（I\O）
                              -> 我先让老员工做join         -> 其他粗色（join）
                              -> 老板来体验工作了   -> 老板抢走我的位置（优先级抢占）
                                                    -> 我让出位置yield()

*/
public class 线程状态转换 {
    public 线程状态转换() {
        System.out.println("    类比于工厂流水线\n" +
                "        条件：\n" +
                "            到工厂前的准备\n" +
                "            到工厂时的状态\n" +
                "            一条流水线  一个位置  一个工具  每人一次做五个玩具\n" +
                "\n" +
                "        状态：\n" +
                "            新建状态（New）\n" +
                "            就绪状态（Runnable）\n" +
                "            运行状态（Running）\n" +
                "            阻塞状态（Blocked）\n" +
                "            死亡状态（Dead）\n" +
                "        过程：\n" +
                "            我要去上班 new  ->  start()\n" +
                "            整理好上班需要的东西 到了 工厂  runnable  ->  调用\n" +
                "            开始做  running   -> 做完五个  ->  runnable\n" +
                "                              -> 有人打电话（工作无关）wait -> 等待阻塞（工具留下）\n" +
                "                              -> 老板不发工资 不干了 sleep  -> 其他阻塞（把工具带走）  -> 下一个人没工具 -> 同步阻塞\n" +
                "                              -> 我忘记戴手套了（个人需要） -> 其他阻塞（I\\O）\n" +
                "                              -> 我先让老员工做join         -> 其他粗色（join）\n" +
                "                              -> 老板来体验工作了   -> 老板抢走我的位置（优先级抢占）\n" +
                "                                                    -> 我让出位置yield()\n");
    }

    public static void main(String[] args) {
        new 线程状态转换();
    }
}
