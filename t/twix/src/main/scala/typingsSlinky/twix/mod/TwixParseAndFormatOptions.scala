package typingsSlinky.twix.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwixParseAndFormatOptions extends TwixFormatOptions {
  var parseStrict: js.UndefOr[Boolean] = js.native
}

object TwixParseAndFormatOptions {
  @scala.inline
  def apply(): TwixParseAndFormatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TwixParseAndFormatOptions]
  }
  @scala.inline
  implicit class TwixParseAndFormatOptionsOps[Self <: TwixParseAndFormatOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withParseStrict(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseStrict")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutParseStrict: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("parseStrict")(js.undefined)
        ret
    }
  }
  
}

