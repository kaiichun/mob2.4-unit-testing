package com.alvin.mob24test.core.util

object ValidationUtil {

    fun validateEmail(email: String): Boolean {
        val regex1 = Regex("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$")
        return email.matches(regex1)
    }

}