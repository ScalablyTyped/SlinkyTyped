package typingsSlinky.vueI18n

import typingsSlinky.vueI18n.mod.VueI18n.DateTimeFormats
import typingsSlinky.vueI18n.mod.VueI18n.LocaleMessages
import typingsSlinky.vueI18n.mod.VueI18n.NumberFormats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDateTimeFormats extends js.Object {
  var dateTimeFormats: js.UndefOr[DateTimeFormats] = js.native
  var messages: js.UndefOr[LocaleMessages] = js.native
  var numberFormats: js.UndefOr[NumberFormats] = js.native
  var sharedMessages: js.UndefOr[LocaleMessages] = js.native
}

object AnonDateTimeFormats {
  @scala.inline
  def apply(): AnonDateTimeFormats = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonDateTimeFormats]
  }
  @scala.inline
  implicit class AnonDateTimeFormatsOps[Self <: AnonDateTimeFormats] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDateTimeFormats(value: DateTimeFormats): Self = {
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

