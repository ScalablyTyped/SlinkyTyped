package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ShowShareMenuOption extends js.Object {
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[ShowShareMenuCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[ShowShareMenuFailCallback] = js.native
  
  /** 本接口为 Beta 版本，暂只在 Android 平台支持。需要显示的转发按钮名称列表，默认['shareAppMessage']。按钮名称合法值包含 "shareAppMessage"、"shareTimeline" 两种
    *
    * 最低基础库： `2.11.3` */
  var menus: js.UndefOr[js.Array[String]] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[ShowShareMenuSuccessCallback] = js.native
  
  /** 是否使用带 shareTicket 的转发[详情](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/share.html) */
  var withShareTicket: js.UndefOr[Boolean] = js.native
}
object ShowShareMenuOption {
  
  @scala.inline
  def apply(): ShowShareMenuOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShowShareMenuOption]
  }
  
  @scala.inline
  implicit class ShowShareMenuOptionOps[Self <: ShowShareMenuOption] (val x: Self) extends AnyVal {
    
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
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setMenusVarargs(value: String*): Self = this.set("menus", js.Array(value :_*))
    
    @scala.inline
    def setMenus(value: js.Array[String]): Self = this.set("menus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenus: Self = this.set("menus", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setWithShareTicket(value: Boolean): Self = this.set("withShareTicket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithShareTicket: Self = this.set("withShareTicket", js.undefined)
  }
}
