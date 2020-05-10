package typingsSlinky.smoothScrollbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<smooth-scrollbar.smooth-scrollbar/interfaces.SetPositionOptions> */
@js.native
trait PartialSetPositionOptions extends js.Object {
  var withoutCallbacks: js.UndefOr[Boolean] = js.native
}

object PartialSetPositionOptions {
  @scala.inline
  def apply(): PartialSetPositionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialSetPositionOptions]
  }
  @scala.inline
  implicit class PartialSetPositionOptionsOps[Self <: PartialSetPositionOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withWithoutCallbacks(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutCallbacks")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWithoutCallbacks: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("withoutCallbacks")(js.undefined)
        ret
    }
  }
  
}

