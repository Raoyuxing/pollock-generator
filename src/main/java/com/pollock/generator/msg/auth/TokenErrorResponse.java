package com.pollock.generator.msg.auth;

import com.pollock.generator.constant.RestCodeConstants;
import com.pollock.generator.msg.BaseResponse;

/**
 * Created by ace on 2017/8/23.
 */
public class TokenErrorResponse extends BaseResponse {
    public TokenErrorResponse(String message) {
        super(RestCodeConstants.TOKEN_ERROR_CODE, message);
    }
}
