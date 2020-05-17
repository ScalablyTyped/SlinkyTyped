package typingsSlinky.terminalKit.anon

import typingsSlinky.terminalKit.terminalKitStrings.button
import typingsSlinky.terminalKit.terminalKitStrings.drag
import typingsSlinky.terminalKit.terminalKitStrings.motion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mouse extends js.Object {
  var mouse: js.UndefOr[button | drag | motion] = js.native
  var safe: js.UndefOr[Boolean] = js.native
}

object Mouse {
  @scala.inline
  def apply(): Mouse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Mouse]
  }
  @scala.inline
  implicit class MouseOps[Self <: Mouse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withMouse(value: button | drag | motion): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouse")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMouse: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mouse")(js.undefined)
        ret
    }
    @scala.inline
    def withSafe(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safe")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSafe: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("safe")(js.undefined)
        ret
    }
  }
  
}

