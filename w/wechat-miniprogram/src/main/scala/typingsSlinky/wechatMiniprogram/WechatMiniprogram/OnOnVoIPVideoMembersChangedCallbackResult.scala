package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnOnVoIPVideoMembersChangedCallbackResult extends js.Object {
  
  /** 错误码 */
  var errCode: Double = js.native
  
  /** 调用结果 */
  var errMsg: String = js.native
  
  /** 开启视频的成员 openId 名单 */
  var openIdList: js.Array[String] = js.native
}
object OnOnVoIPVideoMembersChangedCallbackResult {
  
  @scala.inline
  def apply(errCode: Double, errMsg: String, openIdList: js.Array[String]): OnOnVoIPVideoMembersChangedCallbackResult = {
    val __obj = js.Dynamic.literal(errCode = errCode.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any], openIdList = openIdList.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnOnVoIPVideoMembersChangedCallbackResult]
  }
  
  @scala.inline
  implicit class OnOnVoIPVideoMembersChangedCallbackResultOps[Self <: OnOnVoIPVideoMembersChangedCallbackResult] (val x: Self) extends AnyVal {
    
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
    def setErrCode(value: Double): Self = this.set("errCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenIdListVarargs(value: String*): Self = this.set("openIdList", js.Array(value :_*))
    
    @scala.inline
    def setOpenIdList(value: js.Array[String]): Self = this.set("openIdList", value.asInstanceOf[js.Any])
  }
}
