package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.`decimal-list`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedAttributeRightHandSideDecimalList extends ExtendedAttributeRightHandSide {
  var `type`: `decimal-list` = js.native
  var value: js.Array[ExtendedAttributeRightHandSideDecimal] = js.native
}

object ExtendedAttributeRightHandSideDecimalList {
  @scala.inline
  def apply(`type`: `decimal-list`, value: js.Array[ExtendedAttributeRightHandSideDecimal]): ExtendedAttributeRightHandSideDecimalList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideDecimalList]
  }
  @scala.inline
  implicit class ExtendedAttributeRightHandSideDecimalListOps[Self <: ExtendedAttributeRightHandSideDecimalList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: `decimal-list`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Array[ExtendedAttributeRightHandSideDecimal]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

