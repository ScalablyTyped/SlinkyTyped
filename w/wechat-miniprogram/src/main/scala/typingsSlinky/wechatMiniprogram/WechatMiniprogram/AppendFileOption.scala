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
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppendFileOption extends js.Object {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[AppendFileCompleteCallback] = js.native
  
  /** 要追加的文本或二进制数据 */
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
  var fail: js.UndefOr[AppendFileFailCallback] = js.native
  
  /** 要追加内容的文件路径 (本地路径) */
  var filePath: String = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[AppendFileSuccessCallback] = js.native
}
object AppendFileOption {
  
  @scala.inline
  def apply(data: String | js.typedarray.ArrayBuffer, filePath: String): AppendFileOption = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppendFileOption]
  }
  
  @scala.inline
  implicit class AppendFileOptionOps[Self <: AppendFileOption] (val x: Self) extends AnyVal {
    
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
    def setData(value: String | js.typedarray.ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilePath(value: String): Self = this.set("filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setEncoding(
      value: ascii | base64 | binary | hex | ucs2 | `ucs-2` | utf16le | `utf-16le` | `utf-8` | utf8 | latin1
    ): Self = this.set("encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncoding: Self = this.set("encoding", js.undefined)
    
    @scala.inline
    def setFail(value: /* result */ AppendFileFailCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
