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
trait ReadFileOption extends StObject {
  
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
  implicit class ReadFileOptionMutableBuilder[Self <: ReadFileOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setEncoding(
      value: ascii | base64 | binary | hex | ucs2 | `ucs-2` | utf16le | `utf-16le` | `utf-8` | utf8 | latin1
    ): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncodingUndefined: Self = StObject.set(x, "encoding", js.undefined)
    
    @scala.inline
    def setFail(value: /* result */ ReadFileFailCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setFilePath(value: String): Self = StObject.set(x, "filePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLength(value: String): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ ReadFileSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
  }
}
