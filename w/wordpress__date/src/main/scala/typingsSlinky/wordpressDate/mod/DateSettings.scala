package typingsSlinky.wordpressDate.mod

import typingsSlinky.wordpressDate.AnonDate
import typingsSlinky.wordpressDate.AnonLocale
import typingsSlinky.wordpressDate.AnonOffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateSettings extends js.Object {
  var formats: AnonDate = js.native
  var l10n: AnonLocale = js.native
  var timezone: AnonOffset = js.native
}

object DateSettings {
  @scala.inline
  def apply(formats: AnonDate, l10n: AnonLocale, timezone: AnonOffset): DateSettings = {
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
    def withFormats(value: AnonDate): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("formats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withL10n(value: AnonLocale): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("l10n")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withTimezone(value: AnonOffset): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("timezone")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

