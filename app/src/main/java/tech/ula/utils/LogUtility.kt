package tech.ula.utils

import android.util.Log

class LogUtility {

    fun e(tag: String, message: String) {
        Log.e(tag, message)
    }

    fun w(tag: String, message: String) {
        Log.w(tag, message)
    }

    fun v(tag: String, message: String) {
        Log.v(tag, message)
    }

    fun d(tag: String, message: String) {
        Log.d(tag, message)
    }

    fun runtimeErrorForCommand(functionName: String, command: String, err: Exception) {
        val errorMessage = "Error while executing " +
                "`$functionName()` with command: $command \n\tError = $err"
        this.e(tag = "RuntimeError", message = errorMessage)
    }
}
