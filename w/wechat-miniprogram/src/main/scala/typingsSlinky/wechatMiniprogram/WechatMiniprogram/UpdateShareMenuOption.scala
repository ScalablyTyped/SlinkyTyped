package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateShareMenuOption extends StObject {
  
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
  implicit class UpdateShareMenuOptionMutableBuilder[Self <: UpdateShareMenuOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActivityId(value: String): Self = StObject.set(x, "activityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActivityIdUndefined: Self = StObject.set(x, "activityId", js.undefined)
    
    @scala.inline
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setIsPrivateMessage(value: Boolean): Self = StObject.set(x, "isPrivateMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsPrivateMessageUndefined: Self = StObject.set(x, "isPrivateMessage", js.undefined)
    
    @scala.inline
    def setIsUpdatableMessage(value: Boolean): Self = StObject.set(x, "isUpdatableMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsUpdatableMessageUndefined: Self = StObject.set(x, "isUpdatableMessage", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTemplateInfo(value: UpdatableMessageFrontEndTemplateInfo): Self = StObject.set(x, "templateInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTemplateInfoUndefined: Self = StObject.set(x, "templateInfo", js.undefined)
    
    @scala.inline
    def setToDoActivityId(value: String): Self = StObject.set(x, "toDoActivityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToDoActivityIdUndefined: Self = StObject.set(x, "toDoActivityId", js.undefined)
    
    @scala.inline
    def setWithShareTicket(value: Boolean): Self = StObject.set(x, "withShareTicket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWithShareTicketUndefined: Self = StObject.set(x, "withShareTicket", js.undefined)
  }
}
