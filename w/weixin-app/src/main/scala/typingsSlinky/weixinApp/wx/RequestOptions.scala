package typingsSlinky.weixinApp.wx

import typingsSlinky.weixinApp.weixinAppStrings.CONNECT
import typingsSlinky.weixinApp.weixinAppStrings.DELETE
import typingsSlinky.weixinApp.weixinAppStrings.GET
import typingsSlinky.weixinApp.weixinAppStrings.HEAD
import typingsSlinky.weixinApp.weixinAppStrings.OPTIONS
import typingsSlinky.weixinApp.weixinAppStrings.POST
import typingsSlinky.weixinApp.weixinAppStrings.PUT
import typingsSlinky.weixinApp.weixinAppStrings.TRACE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestOptions
  extends BaseOptions[DataResponse, js.Any] {
  
  /** 请求的参数 */
  var data: js.UndefOr[String | js.Object | js.typedarray.ArrayBuffer] = js.native
  
  /** 如果设为json，会尝试对返回的数据做一次 JSON.parse */
  var dataType: js.UndefOr[String] = js.native
  
  /** 设置请求的 header , header 中不能设置 Referer */
  var header: js.UndefOr[RequestHeader] = js.native
  
  /** 默认为 GET，有效值：OPTIONS, GET, HEAD, POST, PUT, DELETE, TRACE, CONNECT */
  var method: js.UndefOr[GET | OPTIONS | HEAD | POST | PUT | DELETE | TRACE | CONNECT] = js.native
  
  /**
    * 设置响应的数据类型。合法值：text、arraybuffer
    * @version 1.7.0
    */
  var responseType: js.UndefOr[String] = js.native
  
  /** 开发者服务器接口地址 */
  var url: String = js.native
}
object RequestOptions {
  
  @scala.inline
  def apply(url: String): RequestOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestOptions]
  }
  
  @scala.inline
  implicit class RequestOptionsOps[Self <: RequestOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataArrayBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: String | js.Object | js.typedarray.ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataType(value: String): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setHeader(value: RequestHeader): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setMethod(value: GET | OPTIONS | HEAD | POST | PUT | DELETE | TRACE | CONNECT): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setResponseType(value: String): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
  }
}
