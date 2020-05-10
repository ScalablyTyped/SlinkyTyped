package typingsSlinky.wegameApi

import typingsSlinky.wegameApi.wx.types.AdStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonAdUnitIdStyle extends js.Object {
  /**
    * 广告单元 id
    */
  var adUnitId: String = js.native
  /**
    * banner 广告组件的样式
    */
  var style: AdStyle = js.native
}

object AnonAdUnitIdStyle {
  @scala.inline
  def apply(adUnitId: String, style: AdStyle): AnonAdUnitIdStyle = {
    val __obj = js.Dynamic.literal(adUnitId = adUnitId.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAdUnitIdStyle]
  }
  @scala.inline
  implicit class AnonAdUnitIdStyleOps[Self <: AnonAdUnitIdStyle] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdUnitId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adUnitId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withStyle(value: AdStyle): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("style")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

