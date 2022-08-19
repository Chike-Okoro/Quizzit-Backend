package bu.kotlin.projects.quizzitbackend.utility

import bu.kotlin.projects.quizzitbackend.model.response.BaseResponse
import bu.kotlin.projects.quizzitbackend.utility.constant.ResponseUtil
import com.google.gson.Gson

inline fun exceptionWrapper(action: () -> Any): String {
    val gson = Gson()
    return try {
        action().toString()
    } catch (ex : Exception) {
        val response = when (ex) {
            is UnableToLocateRecordException ->  BaseResponse(ResponseUtil().UNABLE_TO_LOCATE_RECORD.responseCode, ex.message?: ResponseUtil().UNABLE_TO_LOCATE_RECORD.responseMessage)
            is BadRequest ->  BaseResponse(ResponseUtil().BAD_REQUEST.responseCode, ex.message?: ResponseUtil().BAD_REQUEST.responseMessage)
            is FailedToCreate ->  BaseResponse(ResponseUtil().FAILED_TO_CREATE_RECORD.responseCode, ex.message?: ResponseUtil().FAILED_TO_CREATE_RECORD.responseMessage)
            is FailedToUpdate ->  BaseResponse(ResponseUtil().FAILED_TO_UPDATE_RECORD.responseCode, ex.message?: ResponseUtil().FAILED_TO_UPDATE_RECORD.responseMessage)
            is InvalidPathException ->  BaseResponse(ResponseUtil().ERROR_INVALID_PATH.responseCode, ex.message?: ResponseUtil().ERROR_INVALID_PATH.responseMessage)
            else -> BaseResponse(ResponseUtil().SUSPECTED_MALFUNCTION.responseCode, "something went wrong. please try again later.")

        }
        ex.printStackTrace()
        gson.toJson(response)
    }

}