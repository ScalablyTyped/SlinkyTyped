package typingsSlinky.uniApp

import typingsSlinky.uniApp.uniAppStrings.default
import typingsSlinky.uniApp.uniAppStrings.none
import typingsSlinky.uniApp.uniAppStrings.number
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PreviewImageOptions extends StObject {
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 当前显示图片的链接，不填则默认为 urls 的第一张
    */
  var count: js.UndefOr[String] = js.native
  
  /**
    * current 为当前显示图片的链接/索引值，不填或填写的值无效则为 urls 的第一张。App平台在 1.9.5至1.9.8之间，current为必填。不填会报错
    */
  var current: js.UndefOr[String] = js.native
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 图片指示器样式
    * - default: 底部圆点指示器
    * - number: 顶部数字指示器
    * - none: 不显示指示器
    */
  var indicator: js.UndefOr[default | number | none] = js.native
  
  /**
    * 长按图片显示操作菜单，如不填默认为保存相册，1.9.5 起支持。
    */
  var longPressActions: js.UndefOr[LongPressActionsOptions] = js.native
  
  /**
    * 是否可循环预览
    */
  var loop: js.UndefOr[Boolean] = js.native
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 需要预览的图片链接列表
    */
  var urls: js.UndefOr[String | js.Array[_]] = js.native
}
object PreviewImageOptions {
  
  @scala.inline
  def apply(): PreviewImageOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PreviewImageOptions]
  }
  
  @scala.inline
  implicit class PreviewImageOptionsMutableBuilder[Self <: PreviewImageOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setCount(value: String): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setCurrent(value: String): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setIndicator(value: default | number | none): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndicatorUndefined: Self = StObject.set(x, "indicator", js.undefined)
    
    @scala.inline
    def setLongPressActions(value: LongPressActionsOptions): Self = StObject.set(x, "longPressActions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLongPressActionsUndefined: Self = StObject.set(x, "longPressActions", js.undefined)
    
    @scala.inline
    def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setUrls(value: String | js.Array[_]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
    
    @scala.inline
    def setUrlsVarargs(value: js.Any*): Self = StObject.set(x, "urls", js.Array(value :_*))
  }
}
