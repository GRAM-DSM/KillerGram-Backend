package com.killergram.killergrambackend.domain.user.exception

import com.killergram.killergrambackend.global.error.exception.ErrorCode
import com.killergram.killergrambackend.global.error.exception.KillergramException

object UserAlreadyExistsException : KillergramException(ErrorCode.USER_ALREADY_EXISTS)