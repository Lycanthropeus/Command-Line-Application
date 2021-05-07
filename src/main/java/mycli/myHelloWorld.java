//package mycli;
////import io.lettuce.*;
//import io.lettuce.core.RedisClient;
//import io.lettuce.core.StatefulRedisConnectionImpl;
//import io.lettuce.core.api.StatefulRedisConnection;
//import io.lettuce.core.api.sync.RedisCommands;
//import lombok.extern.slf4j.Slf4j;
//
//@Slf4j
//public class myHelloWorld  {
//    public static void main (String [] args) {
//        RedisClient redisClient = RedisClient.create("redis://ivoyants2.dyndns.org:20504/");
//        StatefulRedisConnection<String ,String> connection = redisClient.connect();
//        RedisCommands<String,String> syncCommands = connection.sync();
//        syncCommands.set("key","hello, Niranjan");
//        connection.close();
//        redisClient.shutdown();
//    }
//
//}
