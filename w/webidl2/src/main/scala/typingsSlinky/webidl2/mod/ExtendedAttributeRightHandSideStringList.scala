package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.`string-list`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtendedAttributeRightHandSideStringList extends ExtendedAttributeRightHandSide {
  var `type`: `string-list` = js.native
  var value: js.Array[ExtendedAttributeRightHandSideString] = js.native
}

object ExtendedAttributeRightHandSideStringList {
  @scala.inline
  def apply(`type`: `string-list`, value: js.Array[ExtendedAttributeRightHandSideString]): ExtendedAttributeRightHandSideStringList = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtendedAttributeRightHandSideStringList]
  }
  @scala.inline
  implicit class ExtendedAttributeRightHandSideStringListOps[Self <: ExtendedAttributeRightHandSideStringList] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: `string-list`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Array[ExtendedAttributeRightHandSideString]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

