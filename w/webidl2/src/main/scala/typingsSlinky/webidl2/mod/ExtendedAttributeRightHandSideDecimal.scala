package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.decimal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedAttributeRightHandSideDecimal extends ExtendedAttributeRightHandSide {
  var `type`: decimal = js.native
  var value: String = js.native
}

object ExtendedAttributeRightHandSideDecimal {
  @scala.inline
  def apply(`type`: decimal, value: String): ExtendedAttributeRightHandSideDecimal = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideDecimal]
  }
  @scala.inline
  implicit class ExtendedAttributeRightHandSideDecimalOps[Self <: ExtendedAttributeRightHandSideDecimal] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: decimal): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

