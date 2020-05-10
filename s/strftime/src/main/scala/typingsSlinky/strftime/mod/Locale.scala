package typingsSlinky.strftime.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Locale extends js.Object {
  var AM: js.UndefOr[String] = js.native
  var PM: js.UndefOr[String] = js.native
  var am: js.UndefOr[String] = js.native
  var days: js.UndefOr[js.Array[String]] = js.native
  var formats: LocaleFormats = js.native
  var months: js.UndefOr[js.Array[String]] = js.native
  var pm: js.UndefOr[String] = js.native
  var shortDays: js.UndefOr[js.Array[String]] = js.native
  var shortMonths: js.UndefOr[js.Array[String]] = js.native
}

object Locale {
  @scala.inline
  def apply(formats: LocaleFormats): Locale = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
    __obj.asInstanceOf[Locale]
  }
  @scala.inline
  implicit class LocaleOps[Self <: Locale] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormats(value: LocaleFormats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withAM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("AM")(js.undefined)
        ret
    }
    @scala.inline
    def withPM(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PM")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPM: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("PM")(js.undefined)
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
    @scala.inline
    def withShortDays(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDays")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortDays: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortDays")(js.undefined)
        ret
    }
    @scala.inline
    def withShortMonths(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortMonths")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutShortMonths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shortMonths")(js.undefined)
        ret
    }
  }
  
}

