package typingsSlinky.tabris.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<tabris.tabris.Picker, 'itemText'>> */
@js.native
trait PartialPickPickeritemText extends js.Object {
  var itemText: js.UndefOr[js.Function1[/* index */ Double, String]] = js.native
}

object PartialPickPickeritemText {
  @scala.inline
  def apply(): PartialPickPickeritemText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickPickeritemText]
  }
  @scala.inline
  implicit class PartialPickPickeritemTextOps[Self <: PartialPickPickeritemText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemText(value: /* index */ Double => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemText")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutItemText: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemText")(js.undefined)
        ret
    }
  }
  
}

