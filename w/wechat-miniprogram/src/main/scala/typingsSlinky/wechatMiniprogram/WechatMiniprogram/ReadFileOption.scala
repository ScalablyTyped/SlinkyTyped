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
trait ReadFileOption extends js.Object {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ReadFileCompleteCallback] = js.native
  
  /** 指定读取文件的字符编码，如果不传 encoding，则以 ArrayBuffer 格式读取文件的二进制内容
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
  var fail: js.UndefOr[ReadFileFailCallback] = js.native
  
  /** 要读取的文件的路径 (本地路径) */
  var filePath: String = js.native
  
  /** 指定文件的长度，如果不指定，则读到文件末尾。有效范围：[1, fileLength]。单位：byte
    *
    * 最低基础库： `2.10.0` */
  var length: js.UndefOr[String] = js.native
  
  /** 从文件指定位置开始读，如果不指定，则从文件头开始读。读取的范围应该是左闭右开区间 [position, position+length)。有效范围：[0, fileLength - 1]。单位：byte
    *
    * 最低基础库： `2.10.0` */
  var position: js.UndefOr[String] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ReadFileSuccessCallback] = js.native
}
object ReadFileOption {
  
  @scala.inline
  def apply(filePath: String): ReadFileOption = {
    val __obj = js.Dynamic.literal(filePath = filePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadFileOption]
  }
  
  @scala.inline
  implicit class ReadFileOptionOps[Self <: ReadFileOption] (val x: Self) extends AnyVal {
    
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
    def setFail(value: /* result */ ReadFileFailCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setLength(value: String): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ ReadFileSuccessCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
