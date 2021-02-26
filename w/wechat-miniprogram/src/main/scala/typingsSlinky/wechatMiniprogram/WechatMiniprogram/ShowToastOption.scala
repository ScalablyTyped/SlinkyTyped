package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.loading
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.none
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.success
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowToastOption extends StObject {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ShowToastCompleteCallback] = js.native
  
  /** 提示的延迟时间 */
  var duration: js.UndefOr[Double] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ShowToastFailCallback] = js.native
  
  /** 图标
    *
    * 可选值：
    * - 'success': 显示成功图标，此时 title 文本最多显示 7 个汉字长度;
    * - 'loading': 显示加载图标，此时 title 文本最多显示 7 个汉字长度;
    * - 'none': 不显示图标，此时 title 文本最多可显示两行，[1.9.0](https://developers.weixin.qq.com/miniprogram/dev/framework/compatibility.html)及以上版本支持; */
  var icon: js.UndefOr[success | loading | none] = js.native
  
  /** 自定义图标的本地路径，image 的优先级高于 icon
    *
    * 最低基础库： `1.1.0` */
  var image: js.UndefOr[String] = js.native
  
  /** 是否显示透明蒙层，防止触摸穿透 */
  var mask: js.UndefOr[Boolean] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ShowToastSuccessCallback] = js.native
  
  /** 提示的内容 */
  var title: String = js.native
}
object ShowToastOption {
  
  @scala.inline
  def apply(title: String): ShowToastOption = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowToastOption]
  }
  
  @scala.inline
  implicit class ShowToastOptionMutableBuilder[Self <: ShowToastOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setIcon(value: success | loading | none): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
    
    @scala.inline
    def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
