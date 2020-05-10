package typingsSlinky.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FullscreenOptions extends js.Object {
  var navigationUI: js.UndefOr[FullscreenNavigationUI] = js.native
}

object FullscreenOptions {
  @scala.inline
  def apply(): FullscreenOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FullscreenOptions]
  }
  @scala.inline
  implicit class FullscreenOptionsOps[Self <: FullscreenOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withNavigationUI(value: FullscreenNavigationUI): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationUI")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutNavigationUI: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("navigationUI")(js.undefined)
        ret
    }
  }
  
}

