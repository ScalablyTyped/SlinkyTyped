package typingsSlinky.wordpressDate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Date extends js.Object {
  var date: String = js.native
  var datetime: String = js.native
  var datetimeAbbreviated: String = js.native
  var time: String = js.native
}

object Date {
  @scala.inline
  def apply(date: String, datetime: String, datetimeAbbreviated: String, time: String): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], datetimeAbbreviated = datetimeAbbreviated.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  @scala.inline
  implicit class DateOps[Self <: Date] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDate(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("date")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatetime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDatetimeAbbreviated(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("datetimeAbbreviated")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTime(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("time")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

