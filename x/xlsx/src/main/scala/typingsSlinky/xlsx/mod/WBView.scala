package typingsSlinky.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WBView extends js.Object {
  /** Right-to-left mode */
  var RTL: js.UndefOr[Boolean] = js.native
}

object WBView {
  @scala.inline
  def apply(): WBView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WBView]
  }
  @scala.inline
  implicit class WBViewOps[Self <: WBView] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withRTL(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RTL")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRTL: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RTL")(js.undefined)
        ret
    }
  }
  
}

