package typingsSlinky.vueI18n.mod.VueI18n

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntlAvailability extends js.Object {
  var dateTimeFormat: Boolean = js.native
  var numberFormat: Boolean = js.native
}

object IntlAvailability {
  @scala.inline
  def apply(dateTimeFormat: Boolean, numberFormat: Boolean): IntlAvailability = {
    val __obj = js.Dynamic.literal(dateTimeFormat = dateTimeFormat.asInstanceOf[js.Any], numberFormat = numberFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntlAvailability]
  }
  @scala.inline
  implicit class IntlAvailabilityOps[Self <: IntlAvailability] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateTimeFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withNumberFormat(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormat")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

