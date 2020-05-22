package typingsSlinky.wordwrap.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mode extends js.Object {
  var mode: js.UndefOr[typingsSlinky.wordwrap.mod.Mode] = js.undefined
}

object Mode {
  @scala.inline
  def apply(mode: typingsSlinky.wordwrap.mod.Mode = null): Mode = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
}

