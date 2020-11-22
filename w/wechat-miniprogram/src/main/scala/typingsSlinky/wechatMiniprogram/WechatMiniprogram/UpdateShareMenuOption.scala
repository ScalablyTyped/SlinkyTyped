package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateShareMenuOption extends js.Object {
  
  /** 动态消息的 activityId。通过 [updatableMessage.createActivityId](https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/updatable-message/updatableMessage.createActivityId.html) 接口获取
    *
    * 最低基础库： `2.4.0` */
  var activityId: js.UndefOr[String] = js.native
  
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[UpdateShareMenuCompleteCallback] = js.native
  
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[UpdateShareMenuFailCallback] = js.native
  
  /** 是否是私密消息。详见 [小程序私密消息](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/share/private-message.html)
    *
    * 最低基础库： `2.13.0` */
  var isPrivateMessage: js.UndefOr[Boolean] = js.native
  
  /** 是否是动态消息，详见[动态消息](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/share/updatable-message.html)
    *
    * 最低基础库： `2.4.0` */
  var isUpdatableMessage: js.UndefOr[Boolean] = js.native
  
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[UpdateShareMenuSuccessCallback] = js.native
  
  /** 动态消息的模板信息
    *
    * 最低基础库： `2.4.0` */
  var templateInfo: js.UndefOr[UpdatableMessageFrontEndTemplateInfo] = js.native
  
  /** 群待办消息的id，通过toDoActivityId可以把多个群待办消息聚合为同一个。通过 [updatableMessage.createActivityId](https://developers.weixin.qq.com/miniprogram/dev/api-backend/open-api/updatable-message/updatableMessage.createActivityId.html) 接口获取。详见[群待办消息](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/share.html)
    *
    * 最低基础库： `2.11.0` */
  var toDoActivityId: js.UndefOr[String] = js.native
  
  /** 是否使用带 shareTicket 的转发[详情](https://developers.weixin.qq.com/miniprogram/dev/framework/open-ability/share.html) */
  var withShareTicket: js.UndefOr[Boolean] = js.native
}
object UpdateShareMenuOption {
  
  @scala.inline
  def apply(): UpdateShareMenuOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateShareMenuOption]
  }
  
  @scala.inline
  implicit class UpdateShareMenuOptionOps[Self <: UpdateShareMenuOption] (val x: Self) extends AnyVal {
    
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
    def setActivityId(value: String): Self = this.set("activityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActivityId: Self = this.set("activityId", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    
    @scala.inline
    def setIsPrivateMessage(value: Boolean): Self = this.set("isPrivateMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsPrivateMessage: Self = this.set("isPrivateMessage", js.undefined)
    
    @scala.inline
    def setIsUpdatableMessage(value: Boolean): Self = this.set("isUpdatableMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsUpdatableMessage: Self = this.set("isUpdatableMessage", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
    
    @scala.inline
    def setTemplateInfo(value: UpdatableMessageFrontEndTemplateInfo): Self = this.set("templateInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplateInfo: Self = this.set("templateInfo", js.undefined)
    
    @scala.inline
    def setToDoActivityId(value: String): Self = this.set("toDoActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToDoActivityId: Self = this.set("toDoActivityId", js.undefined)
    
    @scala.inline
    def setWithShareTicket(value: Boolean): Self = this.set("withShareTicket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithShareTicket: Self = this.set("withShareTicket", js.undefined)
  }
}
