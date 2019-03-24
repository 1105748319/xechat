package cn.xeblog.xechat.domain.vo;

import cn.xeblog.xechat.domain.mo.User;
import cn.xeblog.xechat.enums.MessageTypeEnum;
import lombok.*;

import java.io.Serializable;

/**
 * 消息视图
 *
 * @author yanpanyi
 * @date 2019/3/20
 */
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class MessageVO implements Serializable {

    private static final long serialVersionUID = -1455469852669257711L;

    /**
     * 用户
     */
    private User user;
    /**
     * 消息信息
     */
    private String message;
    /**
     * 消息类型 1.系统 2.用户
     */
    private MessageTypeEnum type;

}