package main.java.Main;

import common.java.JGrapeSystem.GscBooster;

// -n test -h 127.0.0.1:805
public class main {
    public static void main(String[] args) {
        System.out.println("<标准数据服务>");
        GscBooster.start(args, () -> {
            // 测试分布式订阅源系统
            // SubscribeGsc.injectDistribution();
            // 测试分布式数据源系统
            // DataSourceManager.injectDateSourceStore(DataSourceDistribution.build());
        });
    }
}
