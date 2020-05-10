package typingsSlinky.winrt.Windows.Globalization.DateTimeFormatting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDateTimeFormatterStatics extends js.Object {
  var longDate: DateTimeFormatter = js.native
  var longTime: DateTimeFormatter = js.native
  var shortDate: DateTimeFormatter = js.native
  var shortTime: DateTimeFormatter = js.native
}

object IDateTimeFormatterStatics {
  @scala.inline
  def apply(
    longDate: DateTimeFormatter,
    longTime: DateTimeFormatter,
    shortDate: DateTimeFormatter,
    shortTime: DateTimeFormatter
  ): IDateTimeFormatterStatics = {
    val __obj = js.Dynamic.literal(longDate = longDate.asInstanceOf[js.Any], longTime = longTime.asInstanceOf[js.Any], shortDate = shortDate.asInstanceOf[js.Any], shortTime = shortTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDateTimeFormatterStatics]
  }
  @scala.inline
  implicit class IDateTimeFormatterStaticsOps[Self <: IDateTimeFormatterStatics] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withLongDate(value: DateTimeFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLongTime(value: DateTimeFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("longTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortDate(value: DateTimeFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShortTime(value: DateTimeFormatter): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortTime")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

