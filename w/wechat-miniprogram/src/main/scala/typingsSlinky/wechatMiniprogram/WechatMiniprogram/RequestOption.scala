package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.CONNECT
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.DELETE
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.GET
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.HEAD
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.OPTIONS
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.POST
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.PUT
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.TRACE
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.arraybuffer
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.json
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.text
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.其他
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[RequestCompleteCallback] = js.native
  
  /** 请求的参数 */
  var data: js.UndefOr[String | IAnyObject | js.typedarray.ArrayBuffer] = js.native
  
  /** 返回的数据格式
    *
    * 可选值：
    * - 'json': 返回的数据为 JSON，返回后会对返回的数据进行一次 JSON.parse;
    * - '其他': 不对返回的内容进行 JSON.parse; */
  var dataType: js.UndefOr[json | 其他] = js.native
  
  /** 开启 cache
    *
    * 最低基础库： `2.10.4` */
  var enableCache: js.UndefOr[Boolean] = js.native
  
  /** 开启 http2
    *
    * 最低基础库： `2.10.4` */
  var enableHttp2: js.UndefOr[Boolean] = js.native
  
  /** 开启 quic
    *
    * 最低基础库： `2.10.4` */
  var enableQuic: js.UndefOr[Boolean] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[RequestFailCallback] = js.native
  
  /** 设置请求的 header，header 中不能设置 Referer。
    *
    * `content-type` 默认为 `application/json` */
  var header: js.UndefOr[IAnyObject] = js.native
  
  /** HTTP 请求方法
    *
    * 可选值：
    * - 'OPTIONS': HTTP 请求 OPTIONS;
    * - 'GET': HTTP 请求 GET;
    * - 'HEAD': HTTP 请求 HEAD;
    * - 'POST': HTTP 请求 POST;
    * - 'PUT': HTTP 请求 PUT;
    * - 'DELETE': HTTP 请求 DELETE;
    * - 'TRACE': HTTP 请求 TRACE;
    * - 'CONNECT': HTTP 请求 CONNECT; */
  var method: js.UndefOr[OPTIONS | GET | HEAD | POST | PUT | DELETE | TRACE | CONNECT] = js.native
  
  /** 响应的数据类型
    *
    * 可选值：
    * - 'text': 响应的数据为文本;
    * - 'arraybuffer': 响应的数据为 ArrayBuffer;
    *
    * 最低基础库： `1.7.0` */
  var responseType: js.UndefOr[text | arraybuffer] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[RequestSuccessCallback] = js.native
  
  /** 超时时间，单位为毫秒
    *
    * 最低基础库： `2.10.0` */
  var timeout: js.UndefOr[Double] = js.native
  
  /** 开发者服务器接口地址 */
  var url: String = js.native
}
object RequestOption {
  
  @scala.inline
  def apply(url: String): RequestOption = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOption]
  }
  
  @scala.inline
  implicit class RequestOptionMutableBuilder[Self <: RequestOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setData(value: String | IAnyObject | js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataType(value: json | 其他): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    @scala.inline
    def setEnableCache(value: Boolean): Self = StObject.set(x, "enableCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableCacheUndefined: Self = StObject.set(x, "enableCache", js.undefined)
    
    @scala.inline
    def setEnableHttp2(value: Boolean): Self = StObject.set(x, "enableHttp2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableHttp2Undefined: Self = StObject.set(x, "enableHttp2", js.undefined)
    
    @scala.inline
    def setEnableQuic(value: Boolean): Self = StObject.set(x, "enableQuic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnableQuicUndefined: Self = StObject.set(x, "enableQuic", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setHeader(value: IAnyObject): Self = StObject.set(x, "header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaderUndefined: Self = StObject.set(x, "header", js.undefined)
    
    @scala.inline
    def setMethod(value: OPTIONS | GET | HEAD | POST | PUT | DELETE | TRACE | CONNECT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setResponseType(value: text | arraybuffer): Self = StObject.set(x, "responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseTypeUndefined: Self = StObject.set(x, "responseType", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ RequestSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
