package typingsSlinky.twix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwixSimpleFormatOptions extends js.Object {
  var allDay: js.UndefOr[String] = js.native
  var template: js.UndefOr[js.Function2[/* left */ js.Any, /* right */ js.Any, _]] = js.native
}

object TwixSimpleFormatOptions {
  @scala.inline
  def apply(): TwixSimpleFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwixSimpleFormatOptions]
  }
  @scala.inline
  implicit class TwixSimpleFormatOptionsOps[Self <: TwixSimpleFormatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAllDay(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDay")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAllDay: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("allDay")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplate(value: (/* left */ js.Any, /* right */ js.Any) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("template")(js.undefined)
        ret
    }
  }
  
}

