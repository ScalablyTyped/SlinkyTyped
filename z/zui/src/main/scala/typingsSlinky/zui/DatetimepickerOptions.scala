package typingsSlinky.zui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DatetimepickerOptions extends js.Object {
  var autoclose: js.UndefOr[Double | Boolean] = js.native
  var calendarWeeks: js.UndefOr[Boolean] = js.native
  var collapse: js.UndefOr[Boolean] = js.native
  var daysOfWeekDisabled: js.UndefOr[js.Array[Double]] = js.native
  var defaultDate: js.UndefOr[js.Date | String | js.Any] = js.native
  var direction: js.UndefOr[String] = js.native
  var disabledDates: js.UndefOr[js.Array[js.Date | String | js.Object]] = js.native
  var enabledDates: js.UndefOr[js.Array[js.Date | String | js.Object]] = js.native
  var forceParse: js.UndefOr[Double | Boolean] = js.native
  var format: js.UndefOr[String | Boolean] = js.native
  var icons: js.UndefOr[DatetimepickerIcons] = js.native
  var ignoreReadonly: js.UndefOr[Boolean] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var language: js.UndefOr[String] = js.native
  var locale: js.UndefOr[String] = js.native
  var maxDate: js.UndefOr[js.Date | String | js.Any] = js.native
  var maxView: js.UndefOr[Double] = js.native
  var minDate: js.UndefOr[js.Date | String | js.Any] = js.native
  var minView: js.UndefOr[Double] = js.native
  var minuteStepping: js.UndefOr[Double] = js.native
  var pickDate: js.UndefOr[Boolean] = js.native
  var pickTime: js.UndefOr[Boolean] = js.native
  var showClear: js.UndefOr[Boolean] = js.native
  var showMeridian: js.UndefOr[Boolean | Double] = js.native
  var showToday: js.UndefOr[Boolean] = js.native
  var showTodayButton: js.UndefOr[Boolean] = js.native
  var sideBySide: js.UndefOr[Boolean] = js.native
  var startView: js.UndefOr[Double] = js.native
  var todayBtn: js.UndefOr[Double | Boolean] = js.native
  var todayHighlight: js.UndefOr[Double | Boolean] = js.native
  var toolbarPlacement: js.UndefOr[String] = js.native
  var useCurrent: js.UndefOr[Boolean] = js.native
  var useMinutes: js.UndefOr[Boolean] = js.native
  var useSeconds: js.UndefOr[Boolean] = js.native
  var useStrict: js.UndefOr[Boolean] = js.native
  var viewMode: js.UndefOr[String] = js.native
  var weekStart: js.UndefOr[Double] = js.native
}

object DatetimepickerOptions {
  @scala.inline
  def apply(): DatetimepickerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DatetimepickerOptions]
  }
  @scala.inline
  implicit class DatetimepickerOptionsOps[Self <: DatetimepickerOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAutoclose(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoclose")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutoclose: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autoclose")(js.undefined)
        ret
    }
    @scala.inline
    def withCalendarWeeks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarWeeks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCalendarWeeks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("calendarWeeks")(js.undefined)
        ret
    }
    @scala.inline
    def withCollapse(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollapse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collapse")(js.undefined)
        ret
    }
    @scala.inline
    def withDaysOfWeekDisabled(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfWeekDisabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDaysOfWeekDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("daysOfWeekDisabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDefaultDate(value: js.Date | String | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDirection(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("direction")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledDates(value: js.Array[js.Date | String | js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabledDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDates")(js.undefined)
        ret
    }
    @scala.inline
    def withEnabledDates(value: js.Array[js.Date | String | js.Object]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledDates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnabledDates: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enabledDates")(js.undefined)
        ret
    }
    @scala.inline
    def withForceParse(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceParse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutForceParse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("forceParse")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("format")(js.undefined)
        ret
    }
    @scala.inline
    def withIcons(value: DatetimepickerIcons): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIcons: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("icons")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreReadonly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreReadonly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreReadonly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreReadonly")(js.undefined)
        ret
    }
    @scala.inline
    def withInline(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInline: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inline")(js.undefined)
        ret
    }
    @scala.inline
    def withLanguage(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLanguage: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("language")(js.undefined)
        ret
    }
    @scala.inline
    def withLocale(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLocale: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("locale")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxDate(value: js.Date | String | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMaxView(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMaxView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("maxView")(js.undefined)
        ret
    }
    @scala.inline
    def withMinDateDate(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinDate(value: js.Date | String | js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minDate")(js.undefined)
        ret
    }
    @scala.inline
    def withMinView(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minView")(js.undefined)
        ret
    }
    @scala.inline
    def withMinuteStepping(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteStepping")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteStepping: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteStepping")(js.undefined)
        ret
    }
    @scala.inline
    def withPickDate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickDate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickDate")(js.undefined)
        ret
    }
    @scala.inline
    def withPickTime(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickTime")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPickTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pickTime")(js.undefined)
        ret
    }
    @scala.inline
    def withShowClear(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowClear: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showClear")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMeridian(value: Boolean | Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMeridian")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMeridian: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMeridian")(js.undefined)
        ret
    }
    @scala.inline
    def withShowToday(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToday")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowToday: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showToday")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTodayButton(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTodayButton")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTodayButton: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTodayButton")(js.undefined)
        ret
    }
    @scala.inline
    def withSideBySide(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideBySide")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSideBySide: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sideBySide")(js.undefined)
        ret
    }
    @scala.inline
    def withStartView(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startView")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStartView: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("startView")(js.undefined)
        ret
    }
    @scala.inline
    def withTodayBtn(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayBtn")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTodayBtn: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayBtn")(js.undefined)
        ret
    }
    @scala.inline
    def withTodayHighlight(value: Double | Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayHighlight")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTodayHighlight: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("todayHighlight")(js.undefined)
        ret
    }
    @scala.inline
    def withToolbarPlacement(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarPlacement")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutToolbarPlacement: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toolbarPlacement")(js.undefined)
        ret
    }
    @scala.inline
    def withUseCurrent(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCurrent")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseCurrent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useCurrent")(js.undefined)
        ret
    }
    @scala.inline
    def withUseMinutes(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMinutes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseMinutes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useMinutes")(js.undefined)
        ret
    }
    @scala.inline
    def withUseSeconds(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSeconds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseSeconds: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useSeconds")(js.undefined)
        ret
    }
    @scala.inline
    def withUseStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUseStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("useStrict")(js.undefined)
        ret
    }
    @scala.inline
    def withViewMode(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutViewMode: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("viewMode")(js.undefined)
        ret
    }
    @scala.inline
    def withWeekStart(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekStart")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWeekStart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("weekStart")(js.undefined)
        ret
    }
  }
  
}

