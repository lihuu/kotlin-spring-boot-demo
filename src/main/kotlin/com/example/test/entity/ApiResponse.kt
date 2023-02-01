package com.example.test.entity

/**
 * @author lihu
 * @since 2023/2/1 09:18
 */

class ApiResponse<T>(val code: Int, val message: String, val data: T?) {
    companion object {
        fun <M> successfulResponse(m:M):ApiResponse<M>{
            return ApiResponse(200,"",m);
        }
        
        fun <M> successfulResponse():ApiResponse<M>{
            return ApiResponse(200,"",null)
        }
        
        fun <M> failedResponse():ApiResponse<M>{
            return ApiResponse(199,"",null)
        }
        
        fun <M> failedResponse(code:Int):ApiResponse<M>{
            return ApiResponse(code,"",null)
        }
        fun <M> failedResponse(message: String):ApiResponse<M>{
            return ApiResponse(199,message,null)
        }
        
        fun <M> failedResponse(code:Int,message:String):ApiResponse<M>{
            return ApiResponse(code,message,null)
        }
    }
}