package org.springboot.demo.encrypt.codec;

/**
 * @author mengxy
 */
public class SecurityCodecHandlerFactory {
    private SecurityCodecHandler securityCodecHandler;

    public SecurityCodecHandlerFactory(SecurityCodecHandler securityCodecHandler) {
        this.securityCodecHandler = securityCodecHandler;
    }

    public SecurityCodecHandler getSecurityCodecHandler() {
        return new DefaultSecurityCodecHandler();
    }
}
