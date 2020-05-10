package typingsSlinky.webidl2.mod

import typingsSlinky.webidl2.webidl2Strings.Infinity
import typingsSlinky.webidl2.webidl2Strings.NaN
import typingsSlinky.webidl2.webidl2Strings.`null`
import typingsSlinky.webidl2.webidl2Strings.boolean
import typingsSlinky.webidl2.webidl2Strings.dictionary
import typingsSlinky.webidl2.webidl2Strings.number
import typingsSlinky.webidl2.webidl2Strings.sequence
import typingsSlinky.webidl2.webidl2Strings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueDescription extends js.Object {
  var negative: Boolean | Null = js.native
  var `type`: string | number | boolean | `null` | Infinity | NaN | sequence | dictionary = js.native
  var value: String | js.Array[_] | Null = js.native
}

object ValueDescription {
  @scala.inline
  def apply(`type`: string | number | boolean | `null` | Infinity | NaN | sequence | dictionary): ValueDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
  @scala.inline
  implicit class ValueDescriptionOps[Self <: ValueDescription] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withType(value: string | number | boolean | `null` | Infinity | NaN | sequence | dictionary): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegative(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNegativeNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("negative")(null)
        ret
    }
    @scala.inline
    def withValue(value: String | js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueNull: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(null)
        ret
    }
  }
  
}

