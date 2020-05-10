package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.`integer-list`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedAttributeRightHandSideIntegerList extends ExtendedAttributeRightHandSide {
  var `type`: `integer-list` = js.native
  var value: js.Array[ExtendedAttributeRightHandSideInteger] = js.native
}

object ExtendedAttributeRightHandSideIntegerList {
  @scala.inline
  def apply(`type`: `integer-list`, value: js.Array[ExtendedAttributeRightHandSideInteger]): ExtendedAttributeRightHandSideIntegerList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideIntegerList]
  }
  @scala.inline
  implicit class ExtendedAttributeRightHandSideIntegerListOps[Self <: ExtendedAttributeRightHandSideIntegerList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: `integer-list`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Array[ExtendedAttributeRightHandSideInteger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

