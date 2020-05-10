package typingsSlinky.sharepoint.SPClientTemplates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents schema for a DateTime field in list form or in list view in grid mode */
@js.native
trait FieldSchemaInFormDateTime extends FieldSchemaInForm {
  /** Type of calendar to use */
  var CalendarType: DateTimeCalendarType = js.native
  /** Display format for DateTime field. */
  var DisplayFormat: DateTimeDisplayFormat = js.native
  var FirstDayOfWeek: Double = js.native
  var FirstWeekOfYear: Double = js.native
  var HijriAdjustment: Double = js.native
  var HoursMode24: Boolean = js.native
  var HoursOptions: js.Array[String] = js.native
  var LanguageId: String = js.native
  var LocaleId: String = js.native
  var MaxJDay: Double = js.native
  var MinJDay: Double = js.native
  /** Indicates wherever current user regional settings specify to display week numbers in day or week views of a calendar.
    Only appears for DateTime fields. */
  var ShowWeekNumber: Boolean = js.native
  var TimeSeparator: String = js.native
  var TimeZoneDifference: String = js.native
  var WorkWeek: String = js.native
}

object FieldSchemaInFormDateTime {
  @scala.inline
  def apply(
    AllowGridEditing: Boolean,
    CalendarType: DateTimeCalendarType,
    Description: String,
    Direction: String,
    DisplayFormat: DateTimeDisplayFormat,
    FieldType: String,
    FirstDayOfWeek: Double,
    FirstWeekOfYear: Double,
    Hidden: Boolean,
    HijriAdjustment: Double,
    HoursMode24: Boolean,
    HoursOptions: js.Array[String],
    IMEMode: js.Any,
    Id: String,
    LanguageId: String,
    LocaleId: String,
    MaxJDay: Double,
    MinJDay: Double,
    Name: String,
    ReadOnlyField: Boolean,
    Required: Boolean,
    RestrictedMode: Boolean,
    ShowWeekNumber: Boolean,
    TimeSeparator: String,
    TimeZoneDifference: String,
    Title: String,
    Type: String,
    UseMinWidth: Boolean,
    WorkWeek: String
  ): FieldSchemaInFormDateTime = {
    val __obj = js.Dynamic.literal(AllowGridEditing = AllowGridEditing.asInstanceOf[js.Any], CalendarType = CalendarType.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Direction = Direction.asInstanceOf[js.Any], DisplayFormat = DisplayFormat.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], FirstDayOfWeek = FirstDayOfWeek.asInstanceOf[js.Any], FirstWeekOfYear = FirstWeekOfYear.asInstanceOf[js.Any], Hidden = Hidden.asInstanceOf[js.Any], HijriAdjustment = HijriAdjustment.asInstanceOf[js.Any], HoursMode24 = HoursMode24.asInstanceOf[js.Any], HoursOptions = HoursOptions.asInstanceOf[js.Any], IMEMode = IMEMode.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], LanguageId = LanguageId.asInstanceOf[js.Any], LocaleId = LocaleId.asInstanceOf[js.Any], MaxJDay = MaxJDay.asInstanceOf[js.Any], MinJDay = MinJDay.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], ReadOnlyField = ReadOnlyField.asInstanceOf[js.Any], Required = Required.asInstanceOf[js.Any], RestrictedMode = RestrictedMode.asInstanceOf[js.Any], ShowWeekNumber = ShowWeekNumber.asInstanceOf[js.Any], TimeSeparator = TimeSeparator.asInstanceOf[js.Any], TimeZoneDifference = TimeZoneDifference.asInstanceOf[js.Any], Title = Title.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UseMinWidth = UseMinWidth.asInstanceOf[js.Any], WorkWeek = WorkWeek.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSchemaInFormDateTime]
  }
  @scala.inline
  implicit class FieldSchemaInFormDateTimeOps[Self <: FieldSchemaInFormDateTime] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCalendarType(value: DateTimeCalendarType): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("CalendarType")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDisplayFormat(value: DateTimeDisplayFormat): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DisplayFormat")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstDayOfWeek(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstDayOfWeek")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFirstWeekOfYear(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("FirstWeekOfYear")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHijriAdjustment(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HijriAdjustment")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoursMode24(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HoursMode24")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withHoursOptions(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("HoursOptions")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLanguageId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LanguageId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withLocaleId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("LocaleId")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMaxJDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MaxJDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withMinJDay(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("MinJDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withShowWeekNumber(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ShowWeekNumber")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeSeparator(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeSeparator")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimeZoneDifference(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("TimeZoneDifference")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withWorkWeek(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("WorkWeek")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

