package typingsSlinky.webidl2.webidl2Mod

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

trait ValueDescription extends js.Object {
  var negative: Boolean | Null
  var `type`: string | number | boolean | `null` | Infinity | NaN | sequence | dictionary
  var value: String | js.Array[_] | Null
}

object ValueDescription {
  @scala.inline
  def apply(
    `type`: string | number | boolean | `null` | Infinity | NaN | sequence | dictionary,
    negative: js.UndefOr[Boolean] = js.undefined,
    value: String | js.Array[_] = null
  ): ValueDescription = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(negative)) __obj.updateDynamic("negative")(negative.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueDescription]
  }
}

