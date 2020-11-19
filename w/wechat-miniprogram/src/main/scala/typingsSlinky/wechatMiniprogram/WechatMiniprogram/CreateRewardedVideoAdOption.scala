package typingsSlinky.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRewardedVideoAdOption extends js.Object {
  
  /** 广告单元 id */
  var adUnitId: String = js.native
  
  /** 是否启用多例模式，默认为false
    *
    * 最低基础库： `2.8.0` */
  var multiton: js.UndefOr[Boolean] = js.native
}
object CreateRewardedVideoAdOption {
  
  @scala.inline
  def apply(adUnitId: String): CreateRewardedVideoAdOption = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRewardedVideoAdOption]
  }
  
  @scala.inline
  implicit class CreateRewardedVideoAdOptionOps[Self <: CreateRewardedVideoAdOption] (val x: Self) extends AnyVal {
    
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
    def setAdUnitId(value: String): Self = this.set("adUnitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiton(value: Boolean): Self = this.set("multiton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiton: Self = this.set("multiton", js.undefined)
  }
}
