package typingsSlinky.vue2Datepicker.mod.Datepicker

import typingsSlinky.vue2Datepicker.AnonFirstDayOfWeek
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Lang extends js.Object {
  var days: js.UndefOr[js.Array[String]] = js.native
  var formatLocale: AnonFirstDayOfWeek = js.native
  var monthBeforeYear: Boolean = js.native
  var monthFormat: String = js.native
  var months: js.UndefOr[js.Array[String]] = js.native
  var yearFormat: String = js.native
}

object Lang {
  @scala.inline
  def apply(
    formatLocale: AnonFirstDayOfWeek,
    monthBeforeYear: Boolean,
    monthFormat: String,
    yearFormat: String
  ): Lang = {
    val __obj = js.Dynamic.literal(formatLocale = formatLocale.asInstanceOf[js.Any], monthBeforeYear = monthBeforeYear.asInstanceOf[js.Any], monthFormat = monthFormat.asInstanceOf[js.Any], yearFormat = yearFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lang]
  }
  @scala.inline
  implicit class LangOps[Self <: Lang] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormatLocale(value: AnonFirstDayOfWeek): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formatLocale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthBeforeYear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthBeforeYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withYearFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("yearFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDays(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("days")(js.undefined)
        ret
    }
    @scala.inline
    def withMonths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(js.undefined)
        ret
    }
  }
  
}

