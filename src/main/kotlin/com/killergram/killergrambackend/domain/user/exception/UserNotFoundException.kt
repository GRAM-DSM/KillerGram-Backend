package com.killergram.killergrambackend.domain.user.exception

import com.killergram.killergrambackend.global.error.exception.ErrorCode
import com.killergram.killergrambackend.global.error.exception.KillergramException

object UserNotFoundException : KillergramException(ErrorCode.USER_NOT_FOUND)