package top.lllyl2012.fourth;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.handler.timeout.IdleStateEvent;

public class MyServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if(evt instanceof IdleStateEvent){
            IdleStateEvent idleStateEvent = (IdleStateEvent) evt;

            String state = null;

            switch (idleStateEvent.state()){
                case WRITER_IDLE:
                    state = "写空闲";
                    break;
                case ALL_IDLE:
                    state = "读写空闲";
                    break;
                case READER_IDLE:
                    state = "读空闲";
                    break;
            }
            System.out.println(ctx.channel().remoteAddress() + "空闲事件" + state);

            ctx.channel().close();
        }
    }
}
