package typingsSlinky.wepy.wxEnhancedMod

import typingsSlinky.wepy.wepyStrings.CONNECT
import typingsSlinky.wepy.wepyStrings.DELETE
import typingsSlinky.wepy.wepyStrings.GET
import typingsSlinky.wepy.wepyStrings.HEAD
import typingsSlinky.wepy.wepyStrings.OPTIONS
import typingsSlinky.wepy.wepyStrings.POST
import typingsSlinky.wepy.wepyStrings.PUT
import typingsSlinky.wepy.wepyStrings.TRACE
import typingsSlinky.wepy.wepyStrings.arraybuffer
import typingsSlinky.wepy.wepyStrings.json
import typingsSlinky.wepy.wepyStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestParam extends UrlParam {
  
  var data: js.UndefOr[js.Object | String | js.typedarray.ArrayBuffer] = js.native
  
  var dataType: js.UndefOr[json | text] = js.native
  
  var header: js.UndefOr[js.Object] = js.native
  
  var method: js.UndefOr[GET | OPTIONS | HEAD | POST | PUT | DELETE | TRACE | CONNECT] = js.native
  
  var responseType: js.UndefOr[text | arraybuffer] = js.native
}
object RequestParam {
  
  @scala.inline
  def apply(url: String): RequestParam = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestParam]
  }
  
  @scala.inline
  implicit class RequestParamOps[Self <: RequestParam] (val x: Self) extends AnyVal {
    
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
    def setDataArrayBuffer(value: js.typedarray.ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Object | String | js.typedarray.ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDataType(value: json | text): Self = this.set("dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDataType: Self = this.set("dataType", js.undefined)
    
    @scala.inline
    def setHeader(value: js.Object): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setMethod(value: GET | OPTIONS | HEAD | POST | PUT | DELETE | TRACE | CONNECT): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setResponseType(value: text | arraybuffer): Self = this.set("responseType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseType: Self = this.set("responseType", js.undefined)
  }
}
