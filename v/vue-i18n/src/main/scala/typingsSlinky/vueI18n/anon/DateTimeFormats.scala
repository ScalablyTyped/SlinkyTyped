package typingsSlinky.vueI18n.anon

import typingsSlinky.vueI18n.mod.VueI18n.LocaleMessages
import typingsSlinky.vueI18n.mod.VueI18n.NumberFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateTimeFormats extends js.Object {
  var dateTimeFormats: js.UndefOr[typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormats] = js.native
  var messages: js.UndefOr[LocaleMessages] = js.native
  var numberFormats: js.UndefOr[NumberFormats] = js.native
  var sharedMessages: js.UndefOr[LocaleMessages] = js.native
}

object DateTimeFormats {
  @scala.inline
  def apply(): DateTimeFormats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateTimeFormats]
  }
  @scala.inline
  implicit class DateTimeFormatsOps[Self <: DateTimeFormats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateTimeFormats(value: typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDateTimeFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("dateTimeFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withMessages(value: LocaleMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("messages")(js.undefined)
        ret
    }
    @scala.inline
    def withNumberFormats(value: NumberFormats): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormats")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNumberFormats: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("numberFormats")(js.undefined)
        ret
    }
    @scala.inline
    def withSharedMessages(value: LocaleMessages): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedMessages")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSharedMessages: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sharedMessages")(js.undefined)
        ret
    }
  }
  
}

