package org.seckill.exception;


/**
  * @Author llh
  * @Date 2015/11/30
  *秒杀相关业务异常
  */
public class SeckillException extends RuntimeException {

    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
