package typingsSlinky.terminalKit

import typingsSlinky.terminalKit.screenBufferMod.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonTransparencyChar extends js.Object {
  var attr: Double | Attributes = js.native
  var transparencyChar: String = js.native
  var transparencyType: Double = js.native
}

object AnonTransparencyChar {
  @scala.inline
  def apply(attr: Double | Attributes, transparencyChar: String, transparencyType: Double): AnonTransparencyChar = {
    val __obj = js.Dynamic.literal(attr = attr.asInstanceOf[js.Any], transparencyChar = transparencyChar.asInstanceOf[js.Any], transparencyType = transparencyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonTransparencyChar]
  }
  @scala.inline
  implicit class AnonTransparencyCharOps[Self <: AnonTransparencyChar] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttr(value: Double | Attributes): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attr")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransparencyChar(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparencyChar")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTransparencyType(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transparencyType")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

