package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.all
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.file
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.image
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChooseMessageFileOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ChooseMessageFileCompleteCallback] = js.native
  
  /** 最多可以选择的文件个数，可以 0～100 */
  var count: Double = js.native
  
  /** 根据文件拓展名过滤，仅 type==file 时有效。每一项都不能是空字符串。默认不过滤。
    *
    * 最低基础库： `2.6.0` */
  var extension: js.UndefOr[js.Array[String]] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ChooseMessageFileFailCallback] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ChooseMessageFileSuccessCallback] = js.native
  
  /** 所选的文件的类型
    *
    * 可选值：
    * - 'all': 从所有文件选择;
    * - 'video': 只能选择视频文件;
    * - 'image': 只能选择图片文件;
    * - 'file': 可以选择除了图片和视频之外的其它的文件; */
  var `type`: js.UndefOr[all | video | image | file] = js.native
}
object ChooseMessageFileOption {
  
  @scala.inline
  def apply(count: Double): ChooseMessageFileOption = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChooseMessageFileOption]
  }
  
  @scala.inline
  implicit class ChooseMessageFileOptionMutableBuilder[Self <: ChooseMessageFileOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtension(value: js.Array[String]): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
    
    @scala.inline
    def setExtensionVarargs(value: String*): Self = StObject.set(x, "extension", js.Array(value :_*))
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* result */ ChooseMessageFileSuccessCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setType(value: all | video | image | file): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
