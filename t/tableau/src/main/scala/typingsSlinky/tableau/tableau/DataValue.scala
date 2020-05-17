package typingsSlinky.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DataValue extends js.Object {
  /** The value formatted according to the locale and the formatting applied to the field or parameter. */
  var formattedValue: String = js.native
  /** Contains the raw native value as a JavaScript type, which is one of String, Number, Boolean, or Date */
  var value: js.Any = js.native
}

object DataValue {
  @scala.inline
  def apply(formattedValue: String, value: js.Any): DataValue = {
    val __obj = js.Dynamic.literal(formattedValue = formattedValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataValue]
  }
  @scala.inline
  implicit class DataValueOps[Self <: DataValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormattedValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formattedValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withValue(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

