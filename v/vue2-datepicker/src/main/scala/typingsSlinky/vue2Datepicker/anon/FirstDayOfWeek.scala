package typingsSlinky.vue2Datepicker.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirstDayOfWeek extends js.Object {
  var firstDayOfWeek: Double = js.native
  var firstWeekContainsDate: Double = js.native
  var meridiemParse: js.RegExp = js.native
  var months: js.Array[String] = js.native
  var monthsShort: js.Array[String] = js.native
  var weekdays: js.Array[String] = js.native
  var weekdaysMin: js.Array[String] = js.native
  var weekdaysShort: js.Array[String] = js.native
  def isPM(input: String): Boolean = js.native
  def meridiem(h: Double, _underscore: Double, isLowercase: Boolean): Boolean = js.native
}

object FirstDayOfWeek {
  @scala.inline
  def apply(
    firstDayOfWeek: Double,
    firstWeekContainsDate: Double,
    isPM: String => Boolean,
    meridiem: (Double, Double, Boolean) => Boolean,
    meridiemParse: js.RegExp,
    months: js.Array[String],
    monthsShort: js.Array[String],
    weekdays: js.Array[String],
    weekdaysMin: js.Array[String],
    weekdaysShort: js.Array[String]
  ): FirstDayOfWeek = {
    val __obj = js.Dynamic.literal(firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], firstWeekContainsDate = firstWeekContainsDate.asInstanceOf[js.Any], isPM = js.Any.fromFunction1(isPM), meridiem = js.Any.fromFunction3(meridiem), meridiemParse = meridiemParse.asInstanceOf[js.Any], months = months.asInstanceOf[js.Any], monthsShort = monthsShort.asInstanceOf[js.Any], weekdays = weekdays.asInstanceOf[js.Any], weekdaysMin = weekdaysMin.asInstanceOf[js.Any], weekdaysShort = weekdaysShort.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirstDayOfWeek]
  }
  @scala.inline
  implicit class FirstDayOfWeekOps[Self <: FirstDayOfWeek] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFirstDayOfWeek(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstDayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstWeekContainsDate(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("firstWeekContainsDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsPM(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isPM")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMeridiem(value: (Double, Double, Boolean) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiem")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withMeridiemParse(value: js.RegExp): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("meridiemParse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("months")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMonthsShort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("monthsShort")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekdays(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekdaysMin(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysMin")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWeekdaysShort(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekdaysShort")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

