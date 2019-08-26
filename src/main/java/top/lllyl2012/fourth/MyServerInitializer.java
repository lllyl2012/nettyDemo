package top.lllyl2012.fourth;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.timeout.IdleStateHandler;

import java.util.concurrent.TimeUnit;

public class MyServerInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel ch) throws Exception {
        ChannelPipeline channelPipeline = ch.pipeline();

        //触发空闲事件
        channelPipeline.addLast(new IdleStateHandler(5, 7, 10, TimeUnit.SECONDS));
        channelPipeline.addLast(new MyServerHandler());
    }
}
