package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.`ucs-2`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.`utf-16le`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.`utf-8`
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.ascii
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.base64
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.binary
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.hex
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.latin1
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.ucs2
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.utf16le
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.utf8
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WriteFileOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[WriteFileCompleteCallback] = js.native
  
  /** 要写入的文本或二进制数据 */
  var data: String | js.typedarray.ArrayBuffer = js.native
  
  /** 指定写入文件的字符编码
    *
    * 可选值：
    * - 'ascii': ;
    * - 'base64': ;
    * - 'binary': ;
    * - 'hex': ;
    * - 'ucs2': 以小端序读取;
    * - 'ucs-2': 以小端序读取;
    * - 'utf16le': 以小端序读取;
    * - 'utf-16le': 以小端序读取;
    * - 'utf-8': ;
    * - 'utf8': ;
    * - 'latin1': ; */
  var encoding: js.UndefOr[
    ascii | base64 | binary | hex | ucs2 | `ucs-2` | utf16le | `utf-16le` | `utf-8` | utf8 | latin1
  ] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[WriteFileFailCallback] = js.native
  
  /** 要写入的文件路径 (本地路径) */
  var filePath: String = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[WriteFileSuccessCallback] = js.native
}
object WriteFileOption {
  
  @scala.inline
  def apply(data: String | js.typedarray.ArrayBuffer, filePath: String): WriteFileOption = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteFileOption]
  }
  
  @scala.inline
  implicit class WriteFileOptionMutableBuilder[Self <: WriteFileOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setData(value: String | js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataArrayBuffer(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncoding(
      value: ascii | base64 | binary | hex | ucs2 | `ucs-2` | utf16le | `utf-16le` | `utf-8` | utf8 | latin1
    ): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFail(value: /* result */ WriteFileFailCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
