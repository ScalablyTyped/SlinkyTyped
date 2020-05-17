package typingsSlinky.vue2Datepicker.anon

import typingsSlinky.vue2Datepicker.mod.Datepicker.Lang
import typingsSlinky.vue2Datepicker.mod.Datepicker.Shortcuts
import typingsSlinky.vue2Datepicker.mod.Datepicker.TimePickerOptions
import typingsSlinky.vue2Datepicker.mod.Datepicker.ValueType
import typingsSlinky.vue2Datepicker.vue2DatepickerStrings.date
import typingsSlinky.vue2Datepicker.vue2DatepickerStrings.datetime
import typingsSlinky.vue2Datepicker.vue2DatepickerStrings.month
import typingsSlinky.vue2Datepicker.vue2DatepickerStrings.time
import typingsSlinky.vue2Datepicker.vue2DatepickerStrings.week
import typingsSlinky.vue2Datepicker.vue2DatepickerStrings.year
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppendToBody extends js.Object {
  var appendToBody: js.UndefOr[Boolean] = js.native
  var clearable: js.UndefOr[Boolean] = js.native
  var confirm: js.UndefOr[Boolean] = js.native
  var confirmText: js.UndefOr[String] = js.native
  var defaultValue: js.UndefOr[js.Date] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var disabledDate: js.UndefOr[js.Function1[/* date */ js.Date, Boolean]] = js.native
  var disabledTime: js.UndefOr[js.Function1[/* date */ js.Date, Boolean]] = js.native
  var editable: js.UndefOr[Boolean] = js.native
  var format: js.UndefOr[String] = js.native
  var hourOptions: js.UndefOr[js.Array[Double]] = js.native
  var hourStep: js.UndefOr[Double] = js.native
  var `inline`: js.UndefOr[Boolean] = js.native
  var inputAttr: js.UndefOr[js.Function0[js.Object]] = js.native
  var inputClass: js.UndefOr[String] = js.native
  var lang: js.UndefOr[String | Lang] = js.native
  var minuteOptions: js.UndefOr[js.Array[Double]] = js.native
  var minuteStep: js.UndefOr[Double] = js.native
  var open: js.UndefOr[Boolean] = js.native
  var partialUpdate: js.UndefOr[Boolean] = js.native
  var placeholder: js.UndefOr[String] = js.native
  var popupClass: js.UndefOr[String] = js.native
  var popupStyle: js.UndefOr[js.Function0[js.Object]] = js.native
  var range: js.UndefOr[Boolean] = js.native
  var rangeSeparator: js.UndefOr[String] = js.native
  var secondOptions: js.UndefOr[js.Array[Double]] = js.native
  var secondStep: js.UndefOr[Double] = js.native
  var shortcuts: js.UndefOr[js.Array[Shortcuts]] = js.native
  var showHour: js.UndefOr[Boolean] = js.native
  var showMinute: js.UndefOr[Boolean] = js.native
  var showSecond: js.UndefOr[Boolean] = js.native
  var showTimeHeader: js.UndefOr[Boolean] = js.native
  var showWeekNumber: js.UndefOr[Boolean] = js.native
  var timePickerOptions: js.UndefOr[TimePickerOptions] = js.native
  var timeTitleFormat: js.UndefOr[String] = js.native
  var titleFormat: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[date | datetime | year | month | time | week] = js.native
  var use12h: js.UndefOr[Boolean] = js.native
  var valueType: js.UndefOr[ValueType] = js.native
}

object AppendToBody {
  @scala.inline
  def apply(): AppendToBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AppendToBody]
  }
  @scala.inline
  implicit class AppendToBodyOps[Self <: AppendToBody] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAppendToBody(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToBody")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAppendToBody: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("appendToBody")(js.undefined)
        ret
    }
    @scala.inline
    def withClearable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClearable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("clearable")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirm(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirm: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirm")(js.undefined)
        ret
    }
    @scala.inline
    def withConfirmText(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmText")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConfirmText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("confirmText")(js.undefined)
        ret
    }
    @scala.inline
    def withDefaultValue(value: js.Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDefaultValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("defaultValue")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledDate(value: /* date */ js.Date => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDisabledDate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledDate")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabledTime(value: /* date */ js.Date => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTime")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDisabledTime: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabledTime")(js.undefined)
        ret
    }
    @scala.inline
    def withEditable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEditable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("editable")(js.undefined)
        ret
    }
    @scala.inline
    def withFormat(value: String): Self = {
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
    def withHourOptions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withHourStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHourStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hourStep")(js.undefined)
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
    def withInputAttr(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAttr")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutInputAttr: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputAttr")(js.undefined)
        ret
    }
    @scala.inline
    def withInputClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInputClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inputClass")(js.undefined)
        ret
    }
    @scala.inline
    def withLang(value: String | Lang): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutLang: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("lang")(js.undefined)
        ret
    }
    @scala.inline
    def withMinuteOptions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withMinuteStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMinuteStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("minuteStep")(js.undefined)
        ret
    }
    @scala.inline
    def withOpen(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutOpen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("open")(js.undefined)
        ret
    }
    @scala.inline
    def withPartialUpdate(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialUpdate")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPartialUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("partialUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupClass")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPopupClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupClass")(js.undefined)
        ret
    }
    @scala.inline
    def withPopupStyle(value: () => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupStyle")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutPopupStyle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("popupStyle")(js.undefined)
        ret
    }
    @scala.inline
    def withRange(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("range")(js.undefined)
        ret
    }
    @scala.inline
    def withRangeSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRangeSeparator: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rangeSeparator")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondOptions(value: js.Array[Double]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withSecondStep(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondStep")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSecondStep: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("secondStep")(js.undefined)
        ret
    }
    @scala.inline
    def withShortcuts(value: js.Array[Shortcuts]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcuts")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortcuts: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortcuts")(js.undefined)
        ret
    }
    @scala.inline
    def withShowHour(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHour")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowHour: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showHour")(js.undefined)
        ret
    }
    @scala.inline
    def withShowMinute(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinute")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowMinute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showMinute")(js.undefined)
        ret
    }
    @scala.inline
    def withShowSecond(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSecond")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowSecond: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showSecond")(js.undefined)
        ret
    }
    @scala.inline
    def withShowTimeHeader(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTimeHeader")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowTimeHeader: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showTimeHeader")(js.undefined)
        ret
    }
    @scala.inline
    def withShowWeekNumber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShowWeekNumber: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("showWeekNumber")(js.undefined)
        ret
    }
    @scala.inline
    def withTimePickerOptions(value: TimePickerOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePickerOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimePickerOptions: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timePickerOptions")(js.undefined)
        ret
    }
    @scala.inline
    def withTimeTitleFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeTitleFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTimeTitleFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timeTitleFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withTitleFormat(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitleFormat: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("titleFormat")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: date | datetime | year | month | time | week): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUse12h(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use12h")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUse12h: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("use12h")(js.undefined)
        ret
    }
    @scala.inline
    def withValueType(value: ValueType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValueType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("valueType")(js.undefined)
        ret
    }
  }
  
}

