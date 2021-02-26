package typingsSlinky.wegameApi.anon

import typingsSlinky.wegameApi.wegameApiStrings.add
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageUrl extends StObject {
  
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  
  var fail: js.UndefOr[js.Function1[/* res */ ErrCode, Unit]] = js.native
  
  /**
    * 分享图片地址，详见 wx.shareMessageToFriend 同名参数（需要配置模板规则）
    */
  var imageUrl: js.UndefOr[String] = js.native
  
  /**
    * 分享图片 ID，详见 wx.shareMessageToFriend 同名参数（需要配置模板规则）
    */
  var imageUrlId: js.UndefOr[String] = js.native
  
  /**
    * 需要修改的数据的 key，目前可以为 '1' - '50'
    */
  var key: String = js.native
  
  /**
    * 需要修改的数值，目前只能为 1
    */
  var opNum: Double = js.native
  
  /**
    * 修改类型
    */
  var operation: add = js.native
  
  /**
    * 是否静默修改（不弹框），静默修改需要用户通过快捷分享消息卡片进入才有效，代表分享反馈操作，无需填写 toUser，直接修改分享者与被分享者交互数据
    * 默认值false
    */
  var quiet: js.UndefOr[Boolean] = js.native
  
  var success: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * 分享标题，如果设置了这个值，则在交互成功后自动询问用户是否分享给好友（需要配置模板规则）
    */
  var title: js.UndefOr[String] = js.native
  
  /**
    * 目标好友的 openId
    */
  var toUser: js.UndefOr[String] = js.native
}
object ImageUrl {
  
  @scala.inline
  def apply(key: String, opNum: Double, operation: add): ImageUrl = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], opNum = opNum.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageUrl]
  }
  
  @scala.inline
  implicit class ImageUrlMutableBuilder[Self <: ImageUrl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComplete(value: () => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    @scala.inline
    def setFail(value: /* res */ ErrCode => Unit): Self = StObject.set(x, "fail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFailUndefined: Self = StObject.set(x, "fail", js.undefined)
    
    @scala.inline
    def setImageUrl(value: String): Self = StObject.set(x, "imageUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlId(value: String): Self = StObject.set(x, "imageUrlId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUrlIdUndefined: Self = StObject.set(x, "imageUrlId", js.undefined)
    
    @scala.inline
    def setImageUrlUndefined: Self = StObject.set(x, "imageUrl", js.undefined)
    
    @scala.inline
    def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpNum(value: Double): Self = StObject.set(x, "opNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: add): Self = StObject.set(x, "operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
    
    @scala.inline
    def setSuccess(value: () => Unit): Self = StObject.set(x, "success", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setToUser(value: String): Self = StObject.set(x, "toUser", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUserUndefined: Self = StObject.set(x, "toUser", js.undefined)
  }
}
