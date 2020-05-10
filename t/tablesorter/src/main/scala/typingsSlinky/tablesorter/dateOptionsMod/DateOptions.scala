package typingsSlinky.tablesorter.dateOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateOptions extends js.Object {
  /**
    * A value indicating whether the filter's time-value should be set to the end of the day.
    */
  var endOfDay: js.UndefOr[Boolean] = js.native
}

object DateOptions {
  @scala.inline
  def apply(): DateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateOptions]
  }
  @scala.inline
  implicit class DateOptionsOps[Self <: DateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEndOfDay(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOfDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEndOfDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("endOfDay")(js.undefined)
        ret
    }
  }
  
}

