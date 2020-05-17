package typingsSlinky.wordpressDate.mod

import typingsSlinky.wordpressDate.anon.Date
import typingsSlinky.wordpressDate.anon.Locale
import typingsSlinky.wordpressDate.anon.Offset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateSettings extends js.Object {
  var formats: Date = js.native
  var l10n: Locale = js.native
  var timezone: Offset = js.native
}

object DateSettings {
  @scala.inline
  def apply(formats: Date, l10n: Locale, timezone: Offset): DateSettings = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], l10n = l10n.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateSettings]
  }
  @scala.inline
  implicit class DateSettingsOps[Self <: DateSettings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFormats(value: Date): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL10n(value: Locale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l10n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimezone(value: Offset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

