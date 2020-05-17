package typingsSlinky.tabris.anon

import typingsSlinky.tabris.tabrisStrings.auto
import typingsSlinky.tabris.tabrisStrings.off
import typingsSlinky.tabris.tabrisStrings.on
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Flash extends js.Object {
  var flash: js.UndefOr[auto | on | off] = js.native
}

object Flash {
  @scala.inline
  def apply(): Flash = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Flash]
  }
  @scala.inline
  implicit class FlashOps[Self <: Flash] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFlash(value: auto | on | off): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutFlash: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flash")(js.undefined)
        ret
    }
  }
  
}

