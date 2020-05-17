package typingsSlinky.tabris.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<std.Pick<this, 'itemText'>> */
@js.native
trait PartialPickthisitemText extends js.Object {
  var itemText: js.UndefOr[js.Any] = js.native
}

object PartialPickthisitemText {
  @scala.inline
  def apply(): PartialPickthisitemText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPickthisitemText]
  }
  @scala.inline
  implicit class PartialPickthisitemTextOps[Self <: PartialPickthisitemText] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withItemText(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("itemText")(value.asInstanceOf[js.Any])
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

