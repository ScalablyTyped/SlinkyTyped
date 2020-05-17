package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pair extends js.Object {
  /** The field name to which the value is applied. */
  var fieldName: String = js.native
  /** The value formatted according to the locale and the formatting applied to the field. */
  var formattedValue: String = js.native
  /** Contains the raw native value for the field as a JavaScript type, which is one of String, Number, Boolean, or Date. */
  var value: String | Double | Boolean | js.Date = js.native
}

object Pair {
  @scala.inline
  def apply(fieldName: String, formattedValue: String, value: String | Double | Boolean | js.Date): Pair = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], formattedValue = formattedValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pair]
  }
  @scala.inline
  implicit class PairOps[Self <: Pair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFieldName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fieldName")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFormattedValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValueDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: String | Double | Boolean | js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

