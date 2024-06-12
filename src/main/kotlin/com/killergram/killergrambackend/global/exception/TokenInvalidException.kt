package com.killergram.killergrambackend.global.exception

import com.killergram.killergrambackend.global.error.exception.ErrorCode
import com.killergram.killergrambackend.global.error.exception.KillergramException

object TokenInvalidException : KillergramException(ErrorCode.TOKEN_INVALID)