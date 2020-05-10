package typingsSlinky.sugar.sugarjs.Number

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NumberOptions extends js.Object {
  var decimal: String = js.native
  var thousands: String = js.native
}

object NumberOptions {
  @scala.inline
  def apply(decimal: String, thousands: String): NumberOptions = {
    val __obj = js.Dynamic.literal(decimal = decimal.asInstanceOf[js.Any], thousands = thousands.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberOptions]
  }
  @scala.inline
  implicit class NumberOptionsOps[Self <: NumberOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDecimal(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("decimal")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withThousands(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("thousands")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

