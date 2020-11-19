package typingsSlinky.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetBackgroundColorOptions extends js.Object {
  
  /**
    * 窗口的背景色，必须为十六进制颜色值
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * 底部窗口的背景色，必须为十六进制颜色值，仅 iOS 支持
    */
  var backgroundColorBottom: js.UndefOr[String] = js.native
  
  /**
    * 顶部窗口的背景色，必须为十六进制颜色值，仅 iOS 支持
    */
  var backgroundColorTop: js.UndefOr[String] = js.native
  
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 接口调用成功的回调函数
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}
object SetBackgroundColorOptions {
  
  @scala.inline
  def apply(): SetBackgroundColorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SetBackgroundColorOptions]
  }
  
  @scala.inline
  implicit class SetBackgroundColorOptionsOps[Self <: SetBackgroundColorOptions] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundColorBottom(value: String): Self = this.set("backgroundColorBottom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColorBottom: Self = this.set("backgroundColorBottom", js.undefined)
    
    @scala.inline
    def setBackgroundColorTop(value: String): Self = this.set("backgroundColorTop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColorTop: Self = this.set("backgroundColorTop", js.undefined)
    
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
}
